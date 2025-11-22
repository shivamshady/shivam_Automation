import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SigninAutomation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.browserstack.com/users/sign_in"); 
        
        driver.manage().window().maximize();
        driver.findElement(By.idls("user_email_login")).sendKeys("sk1917042@gmail.com"); 
        driver.findElement(By.id("user_password")).sendKeys("********");
        driver.findElement(By.name("commit")).click();
        Thread.sleep(11000);
        driver.get("https://www.browserstack.com/users/sign_out");
        Thread.sleep(7000);
        driver.quit(); 
    }
}

