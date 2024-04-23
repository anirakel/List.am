package baseInfo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.MadeInArmPage;
import pages.RealEStatePage;
import pages.TransportMainPage;


public class MainPage extends BasePage {

    @FindBy(xpath = "//div[@class='stripc']/div/a[text()='Անշարժ գույք']")
    WebElement realEstate;

    @FindBy(xpath = "//div[@class='stripc']/div/a[text()='Կենցաղային տեխնիկա']")
    WebElement householdAppliances;

    @FindBy(xpath = "//div[@class='stripc']/div/a[text()='Տրանսպորտ']")
    WebElement transport;

    @FindBy(xpath = "//div[@class='stripc']/div/a[text()='Կենդանիներ']")
    WebElement animals;




    public RealEStatePage clickToRealEstate() {
        realEstate.click();
        return new RealEStatePage();
    }

    public TransportMainPage clickToTransport() {
        transport.click();
        return new TransportMainPage();
    }





}
