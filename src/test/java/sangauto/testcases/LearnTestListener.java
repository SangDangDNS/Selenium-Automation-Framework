package sangauto.testcases;

import sangauto.driver.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LearnTestListener {

    WebDriver driver;

    @BeforeClass
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        DriverManager.setDriver(driver);
    }

    @Test(priority = 1) //Success Test
    public void gotoPage() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 2) //Failed Test
    public void checkTitle() {
        String expectedTitle = "OrangeHRM";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, expectedTitle, "Title of the website do not match");
    }

    @Test(priority = 4) //Failed Test
    public void checkURL() {
        String expectedTitle = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        String originalTitle = driver.getCurrentUrl();
        Assert.assertEquals(originalTitle, expectedTitle, "URL of the website do not match");
    }

    @Test(priority = 3)  //Skip Test
    public void skipTest() {
        throw new SkipException("Skipping The Test Method ");
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }

}

