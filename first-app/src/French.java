import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class French {
    public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\achehade\\Desktop\\TestCases\\first-app\\lib\\drivers\\chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       driver.get("http://reqrout.test/");
       driver.manage().window().maximize();
       WebElement French = driver.findElement(By.xpath("(//div[@class='language-option'])[1]"));
       Thread.sleep(2000);
       French.click();
       WebElement signIn = driver.findElement(By.linkText("Se connecter"));	 
       if (signIn.isDisplayed()){
         System.out.println("Test Passed!");
       } else {
         System.out.println("Test Failed");
     }          
    }
}
