package pages;

import baseInfo.BasePage;
import enums.MadeInArmType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MadeInArmPage extends BasePage {

    @FindBy(xpath = "//div[text()=\"Արտադրված է Հայաստանում\"]")
    public WebElement madeInArmenia;

    @FindBy(xpath = "//div[@class='menustrip']/a")
    List<WebElement> madeInArmPageTypes;

    public void MadeInArmPage() {
        madeInArmenia.click();
    }

    public ProductPage selectMadeInArmType(MadeInArmType en) {
        for (WebElement element : madeInArmPageTypes) {
            if (element.getAttribute("data-name").equalsIgnoreCase(en.getValue())) {
                element.click();
                break;
            }
        }
        madeInArmenia.click();
        return new ProductPage();

    }
}

