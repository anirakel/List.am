package util;

import driver.InitDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        InitDriver.setupDriver();
        driver = InitDriver.driver;
        driver.get("https://www.list.am/am");
    }


//    @AfterMethod
//    public void close() {
//        InitDriver.tearDown();
//    }

}
