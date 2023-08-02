import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Video {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\achehade\\Desktop\\TestCases\\first-app\\lib\\drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://reqrout.test/");
        driver.manage().window().maximize();
        WebElement Section = driver.findElement(By.tagName("app-demo"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'end' });", Section);
        Thread.sleep(2000);
        WebElement videoElement = driver.findElement(By.xpath("(//div[@class='container-text text-lg-start text-sm-center d-flex flex-column align-items-center'])[1]"));
        videoElement.click();
        System.out.println("Video is playing.");        
     }
    }

