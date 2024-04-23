package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TransportMainPage extends ProductPage {
    @FindBy(xpath = "//div[@class='stripc']//div/a")
    List<WebElement> transportTypes;

    @FindBy(xpath = "//div[@class='s']/a[text()='Եվս 18']")
    WebElement moreThan18Button;

    public ProductPage otherType(){
        moreThan18Button.click();
        return  new ProductPage();
}


    public TransportMainPage selectTransportType(String type) {
        otherType();
        for (WebElement element : transportTypes) {
            if (element.getText().equals(type)) {
                element.click();
                break;
            }
        }
return this;
    }
}
