package tests;

import enums.EngineType;
import enums.MarkType;
import org.testng.annotations.Test;
import pages.ProductPage;
import pages.TransportMainPage;
import util.BaseTest;

public class BusPageTest extends BaseTest {


    @Test
    public void selectBusType() throws InterruptedException {
        ProductPage productPage = new TransportMainPage()
                .clickToTransport()
                .selectTransportType("Ավտոբուսներ");
        Thread.sleep(6000);
        productPage.selectMarkType(MarkType.QAXAQAYINAVTOBUS);
//        Thread.sleep(2000);
//        productPage.choosePrice("100000", "5000000")
//                .chooseCurrency();
//        Thread.sleep(2000);
//        productPage.selectEngineType(EngineType.DIZEL);
    }
}
