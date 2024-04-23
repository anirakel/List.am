package filterObjects;

import enums.EngineType;
import enums.MarkType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import baseInfo.MainPage;

import pages.ProductPage;

import java.util.List;


public class BaseFilterPage extends MainPage {
    @FindBy(xpath = "//input[@id='_idn']/following-sibling::div[@class='me']")
    WebElement region;

    @FindBy(xpath = "//div[@class='ph']")
    WebElement currency;

    @FindBy(xpath = "//div[@data-name='֏ (AMD)']")
    WebElement amdCurrency;

    @FindBy(xpath = "//input[@id='idprice1']")
    WebElement start;

    @FindBy(xpath = "//input[@id='idprice2']")
    WebElement until;

    @FindBy(xpath = "//a[@class='btn']")
    WebElement searchButton;

    @FindBy(xpath = "//div[text()='Դավիթաշեն']")
    WebElement regionChooseDavtashen;

    @FindBy(xpath = "//div[@class='b1']")
    WebElement chooseButton;

    @FindBy(xpath = "//input[@id='_id_a15']/..//div[@class='me']")
    WebElement engineTypeDropdown;

    @FindBy(xpath = "//div[@class='l top']/div[@class='i']")
    List<WebElement> engineTypes;

    @FindBy(xpath = "//input[@id='_id_a15']/..//div[@class='b1']")
    WebElement selectButton;

    @FindBy(xpath = "//input[@id='_id_a28_1']/../div[@class='me']")
    WebElement engineVolumeStart;

    @FindBy(xpath = "//input[@id='_id_a28_2']/../div[@class='me']")
    WebElement engineVolumeUntil;

    @FindBy(xpath = "//input[@id='_idsid']/..//div[@class='me']")
    WebElement markBusTypeDropdown;

    @FindBy(xpath = "//input[@id='_idsid']//../div[2]//div")
    List<WebElement> markTypeBus;


    Actions action = new Actions(driver);


    public void clickToSearchButton() {
        searchButton.click();
    }


    public ProductPage choosePrice(String from, String to) {
        start.sendKeys(from);
        until.sendKeys(to);
        return new ProductPage();
    }


    public ProductPage chooseCurrency() {
        currency.click();
        amdCurrency.click();
        return new ProductPage();
    }


    public ProductPage chooseRegion() {
        region.click();
        regionChooseDavtashen.click();
        chooseButton.click();
        return new ProductPage();
    }

    public ProductPage selectEngineType(EngineType a) {
        engineTypeDropdown.click();
        for (WebElement element : engineTypes) {
            if (element.getAttribute("data-name").equalsIgnoreCase(a.getValue())) {
                element.click();
                break;

            }
        }
        selectButton.click();
        return new ProductPage();
    }


    public ProductPage clickEngineVolume(String from, String to) {
        engineVolumeStart.sendKeys(from);
        engineVolumeUntil.sendKeys(to);
        return new ProductPage();
    }


//    public ProductPage clickMarkButton(){
//      markBusTypeDropdown.click();
//    return new ProductPage();
//    }

    public ProductPage selectMarkType(MarkType mark) {
        markBusTypeDropdown.click();
        for (WebElement element : markTypeBus) {
            action.moveToElement(element).build().perform();
            System.out.println(element.getText());
            if (element.getText().equals(mark.getValue())) {
                element.click();
                break;
            }
        }
        return new ProductPage();
    }
}
