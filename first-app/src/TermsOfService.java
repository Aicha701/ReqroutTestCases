import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TermsOfService {
    public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\achehade\\Desktop\\TestCases\\first-app\\lib\\drivers\\chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       driver.get("http://reqrout.test/");
       driver.manage().window().maximize();
       WebElement Section = driver.findElement(By.tagName("app-pricing"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", Section);
       Thread.sleep(2000);
       WebElement StartFreeTrail = driver.findElement(By.linkText("terms of service"));
       Thread.sleep(2000);
       StartFreeTrail.click();
       
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

