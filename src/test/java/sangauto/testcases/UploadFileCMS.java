package sangauto.testcases;

import sangauto.Base.BaseTest;
import sangauto.supports.Supports;
import sangauto.pages.UploadFileCMSPage;
import sangauto.utils.WebUI;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Epic("Regression Test")
@Feature("Upload Test")
public class UploadFileCMS extends BaseTest {

    @Test
    public void testUploadFileWithSendKeys() throws InterruptedException {
        WebUI.openURL("https://cgi-lib.berkeley.edu/ex/fup.html");
        WebUI.waitForPageLoaded();
        By inputFileUpload = By.xpath("//input[@name='upfile']");

        //DriverManager.getDriver().findElement(inputFileUpload).sendKeys(Helpers.getCurrentDir() + "datatest/Selenium4_Upload.png");
        WebUI.setText(inputFileUpload, Supports.getCurrentDir() + "datatest/Selenium4_Upload.png");
        Thread.sleep(3000);
    }

    @Test
    public void testUploadFileInCategoryCMS() {
        UploadFileCMSPage uploadFileCMSPage = new UploadFileCMSPage();
        uploadFileCMSPage.loginCMS();
        uploadFileCMSPage.uploadFileInCategory();
    }

}

