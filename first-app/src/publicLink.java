
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;

public class publicLink {
    public static void main( String[] args) throws Exception{
        System.setProperty("webdriver.chrome.chromedriver","C:\\Users\\achehade\\Desktop\\TestCases\\first-app\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://reqrout.test/");
        driver.manage().window().maximize();
        System.out.println("***Landing page***");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-landing-page/app-header/nav[@class='navbar navbar-expand-lg navbar-light w-100 dark-grey']/div[@class='d-lg-flex justify-content-end d-none']/div[@class='d-flex d-none d-lg-block']/a[@class='signin-link']")).click();
        System.out.println("***Sign in modal is displayed");
        driver.findElement(By.xpath("/html/body[@class='modal-open']/ngb-modal-window[@class='d-block modal fade show']/div[@class='modal-dialog modal-dialog-centered modal-md']/div[@class='modal-content']/app-sign-in/div[@class='modal-margins']/div[@class='row'][3]/div[@class='col-12']/form[@class='ng-untouched ng-pristine ng-invalid']/div[1]/input[@class='input-form input-field ng-untouched ng-pristine ng-invalid']")).sendKeys("mahassen@inventures.me");
        driver.findElement(By.name("Password")).sendKeys("Mahassen@123");
        driver.findElement(By.cssSelector(".col-6.col-sm-4.no-margin-padding.d-flex.justify-content-center.justify-content-sm-end.buttons-background-color-green")).click();
        System.out.println("*****Successfull login*****");
        Thread.sleep(5000);
        driver.findElement(By.tagName("app-header-candidate"));
        Thread.sleep(5000);
        WebElement newCandidate = driver.findElement(By.cssSelector("div[class='button primary-button'] div[class='button-text']"));
        newCandidate.click();
        Thread.sleep(5000);
        driver.findElement(By.tagName("app-share-game"));
        Thread.sleep(5000);
        System.out.println("Evaluate new candidate modal is displayed");
        driver.findElement(By.className("bulkText"));
        Thread.sleep(5000);
        System.out.println("Bulk section found");
        driver.findElement(By.cssSelector("input[class='inputBackground ng-untouched ng-pristine']"));
        System.out.println("public field found");
        WebElement copy = driver.findElement(By.cssSelector("img[class='me-3']"));
        copy.click();
        Thread.sleep(5000);
        System.out.println("public link is copied");
        
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("http://reqrout.test/candidate-invite/public/7JTD6V1ATVT12SD");
        Thread.sleep(2000);
        driver.switchTo().window(tabs.get(0));
        driver.get("http://app.reqrout.test/candidates");

        
    }
    
}
