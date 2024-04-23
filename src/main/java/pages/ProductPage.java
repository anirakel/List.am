package pages;

import baseInfo.MainPage;
import filterObjects.BaseFilterPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BaseFilterPage {

    @FindBy(xpath = "//div[@class='dl']/a/div/div[1]")
    List<WebElement> products;

    @FindBy(xpath = "//div[@class='gl']")
    List<WebElement> electricCarProducts;

    @FindBy(xpath = "//div[@class='gl']//a[1]//div[2]")
    WebElement carFirstResultClick;


    public void firstFourProductNames() {
        for (int i = 0; i <= 4; i++) {
            System.out.println(products.get(i).getText());
        }

    }

    public ProductPage firstElectricCarName() {
        for (int i = 0; i < 1; i++) {
            System.out.println(electricCarProducts.get(i).getText());
        }
        carFirstResultClick.click();
        return this;
    }

}
