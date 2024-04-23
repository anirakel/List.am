package baseInfo;
import driver.InitDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.TransportMainPage;


public class BasePage  {
    public WebDriver driver;


    public BasePage() {
        driver = InitDriver.driver;
        PageFactory.initElements(driver, this);
    }

    public void sendKeys(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);

    }


    public void sleep() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
    }

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
    }
    @FindBy(xpath = "//div[text()='Հայերեն']")
    WebElement armVersion;

    public TransportMainPage arm(){
//        armVersion.click();
        return new TransportMainPage();
    }

    public void MadeInArmPage() {
    }
}
