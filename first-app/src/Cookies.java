import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
public class Cookies {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\achehade\\Desktop\\TestCases\\first-app\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://reqrout.com/");
        driver.manage().window().maximize();
        WebElement Section = driver.findElement(By.tagName("app-footer"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Section);
         Thread.sleep(2000);
        WebElement Cookies = driver.findElement(By.linkText("Cookies"));
        Cookies.click(); 
        
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
              