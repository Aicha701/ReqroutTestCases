import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CreateAccount {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\achehade\\Desktop\\TestCases\\first-app\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://reqrout.test/");
        driver.manage().window().maximize();
        System.out.println("***Landing page***");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".freetrial-button")).click();
        System.out.println("****Sign up page****");
        Thread.sleep(5000);
        driver.findElement(By.id("userFullNameInput")).sendKeys("Mahassen Hamze");
        driver.findElement(By.id("companyNameInput")).sendKeys("Inventures Co");
        driver.findElement(By.id("companyEmailInput")).sendKeys("mahassenhamza1997@gmail.com");
        driver.findElement(By.id("passwordFieldInput")).sendKeys("P@ssw0rd");
        driver.findElement(By.id("passwordConfirmFieldInput")).sendKeys("P@ssw0rd");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(5000);
    String title = driver.getTitle();
    if (title.contains("Please verify your email") ) {
        System.out.println("User in validation email page");
    }
    else {
        System.out.println("Test failed!");
    }
    }
}
