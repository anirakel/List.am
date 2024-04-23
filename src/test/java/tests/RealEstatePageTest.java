package tests;

import org.testng.annotations.Test;
import filterObjects.BaseFilterPage;
import baseInfo.MainPage;
import pages.ProductPage;
import util.BaseTest;

public class RealEstatePageTest extends BaseTest {


//    @Test
//    public void announcementsNamesTest(){
//
////        ArrayList<String> tabs=new ArrayList<>(driver.InitDriver.driver.getWindowHandles());
////    driver.InitDriver.driver.switchTo().window(tabs.get(1));
////    String currentURL=driver.InitDriver.driver.getCurrentUrl();
////
////    if(currentURL.contains("https://www.list.am/category/54")){
////        System.out.println("Test passed");
////    }else{
////        System.out.println("Test failed");
////    }


    @Test
    public void getProductNameTest() throws InterruptedException {
        ProductPage productPage = new MainPage()
                .clickToRealEstate()
                .chooseRegion();
        Thread.sleep(2000);
        productPage.choosePrice("10000","50000")
                .chooseCurrency();
        Thread.sleep(2000);
        productPage.firstFourProductNames();
    }
}
