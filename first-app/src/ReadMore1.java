import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMore1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\achehade\\Desktop\\TestCases\\first-app\\lib\\drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://reqrout.test/");
        driver.manage().window().maximize();
        WebElement Section = driver.findElement(By.tagName("app-blogs"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'end' });", Section);
        Thread.sleep(2000);
        WebElement readmore1 = driver.findElement(By.xpath("(//a[@class='read-more'][normalize-space()='Read more'])[1]"));
        readmore1.click();
        String expectedTitle ="Soft Skills Are Essential To The Future Of Work";
        Thread.sleep(2000);
        String actualTile = driver.getTitle();
        Thread.sleep(2000);


        if(actualTile.contentEquals(expectedTitle)){
            System.out.println("Test Passed");
        }
        else{
            System.out.println("Test failed");
        }

    }

}
