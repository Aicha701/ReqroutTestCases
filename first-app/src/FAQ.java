import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FAQ {
    public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\achehade\\Desktop\\TestCases\\first-app\\lib\\drivers\\chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       driver.get("http://reqrout.test/");
       driver.manage().window().maximize(); 
       WebElement Section = driver.findElement(By.tagName("app-footer"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Section);
       Thread.sleep(2000);
       WebElement FAQ = driver.findElement(By.linkText("FAQ"));
       FAQ.click();
       WebElement title = driver.findElement(By.tagName("h1"));
       
       if(title.isDisplayed()){
        System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
       }
    }
    

