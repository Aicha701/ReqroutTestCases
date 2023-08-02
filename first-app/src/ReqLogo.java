import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReqLogo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\achehade\\Desktop\\TestCases\\first-app\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://reqrout.test/");
        driver.manage().window().maximize();
        driver.findElement(By.tagName("app-header"));
        Thread.sleep(2000);
        WebElement Logo = driver.findElement(By.className("reqruit-logo"));
        Logo.click(); 
        String expectedTitle = "Reqrout";	
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
     
      if (actualTitle.contentEquals(expectedTitle)){
          System.out.println("Test Passed!");
      } else {
          System.out.println("Test Failed");
      }
    }
}
