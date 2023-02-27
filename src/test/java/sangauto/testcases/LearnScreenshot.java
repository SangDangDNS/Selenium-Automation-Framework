package sangauto.testcases;

import sangauto.Base.BaseTest;
import sangauto.driver.DriverManager;
import sangauto.supports.CaptureSupports;
import sangauto.utils.WebUI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LearnScreenshot extends BaseTest {


    @BeforeClass
    public void setUpClass() {
        CaptureSupports.startRecord("LearnScreenshot");
    }

//    @Test(priority = 1, dataProvider = "data_provider_login", dataProviderClass = DataProviderManager.class)
//    public void testLoginFromDataProvider(String username, String password) {
//        getLoginPage().logIn(username, password);
//        dangXuat();
//    }

    @Test(priority = 2)
    public void homePage() throws Exception {
        WebUI.openURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //step này cố tình Fail để chụp màn hình lại
        Assert.assertEquals(DriverManager.getDriver().getTitle(), "OrangeHRMS");
    }

    @AfterClass
    public void afterClass() {
        CaptureSupports.stopRecord();
    }

}