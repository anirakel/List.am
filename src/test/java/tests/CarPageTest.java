package tests;

import enums.EngineType;

import org.testng.annotations.Test;

import pages.ProductPage;

import util.BaseTest;

public class CarPageTest extends BaseTest {

    @Test
    public void selectEngineType() throws InterruptedException {
        ProductPage productPage = new ProductPage()
                .clickToTransport()
                .selectTransportType("Ավտոմեքենաներ")
                .chooseRegion();
        Thread.sleep(2000);
        productPage.choosePrice("100000", "5000000")
                .chooseCurrency();
        Thread.sleep(2000);
        productPage.selectEngineType(EngineType.ELECTRIIC);
        Thread.sleep(5000);
        productPage.firstElectricCarName();


    }
}
