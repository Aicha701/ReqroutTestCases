import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class English {
    public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\achehade\\Desktop\\TestCases\\first-app\\lib\\drivers\\chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       driver.get("http://reqrout.test/");
       driver.manage().window().maximize();
       WebElement English = driver.findElement(By.xpath("(//div[@class='language-option language-option-active'])[1]"));
       Thread.sleep(2000);
       Thread.sleep(2000);
       English.click();
       WebElement signIn = driver.findElement(By.linkText("Sign in"));	 
       if (signIn.isDisplayed()){
         System.out.println("Test Passed!");
       } else {
         System.out.println("Test Failed");
     }          
    }
    }

