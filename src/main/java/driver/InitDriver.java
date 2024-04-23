package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitDriver {
    public static WebDriver driver;

    public static void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void tearDown() {
        if (driver != null) {
            driver.close();
        }
        driver = null;
    }

    public static void enterMethod() {
        driver.findElement(By.id("Value")).sendKeys(Keys.ENTER);
    }
}