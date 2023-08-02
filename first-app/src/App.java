import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class App {
    public static void main(String[] args) throws Exception {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\achehade\\Desktop\\TestCases\\first-app\\lib\\drivers\\chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       driver.get("http://juliemr.github.io/protractor-demo/");

       NgWebDriver ngDriver = new NgWebDriver((JavascriptExecutor) driver);
       ngDriver.waitForAngularRequestsToFinish();

       driver.findElement(ByAngular.model("first")).sendKeys("5");
       Thread.sleep(2000);
       Select opt = new Select(driver.findElement(ByAngular.model("operator")));
       opt.selectByValue("MULTIPLICATION");
       Thread.sleep(2000);
       driver.findElement(ByAngular.model("second")).sendKeys("10");
       Thread.sleep(2000);
       driver.findElement(ByAngular.buttonText("Go!")).click();
    }
}
