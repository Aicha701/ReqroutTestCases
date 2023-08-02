import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomContactUs {
    public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\achehade\\Desktop\\TestCases\\first-app\\lib\\drivers\\chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       driver.get("http://reqrout.test/");
       driver.manage().window().maximize();
       WebElement Section = driver.findElement(By.tagName("app-pricing"));
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'end' });", Section);
       Thread.sleep(2000);
       WebElement ContactUs = driver.findElement(By.className("custom-cta"));
       ContactUs.click();
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
