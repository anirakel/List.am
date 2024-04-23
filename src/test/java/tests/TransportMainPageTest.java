package tests;
import org.testng.annotations.Test;
import baseInfo.MainPage;
import pages.TransportMainPage;
import util.BaseTest;

public class TransportMainPageTest  extends BaseTest {

    @Test
    public void chooseTransportTypeTest() throws InterruptedException {
        TransportMainPage TransportMainPage = new MainPage()
                .clickToTransport()
                .selectTransportType("Ավտոմեքենաներ");
        Thread.sleep(2000);

    }





}
