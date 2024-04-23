package tests;

import enums.MadeInArmType;
import org.testng.annotations.Test;
import pages.MadeInArmPage;
import util.BaseTest;

public class MadeInArmPageTest extends BaseTest {
    @Test
    public void selectMadiInArmenia() throws InterruptedException {
      MadeInArmPage productPage=new MadeInArmPage();
      productPage.MadeInArmPage();

    }
}
