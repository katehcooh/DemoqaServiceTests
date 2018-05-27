package Base;

import Models.DriverType;
import Pages.FrameAndWindows.FramesPage;
import Pages.Interaction.*;
import Pages.MainPages.*;
import Pages.Registration.RegistrationPage;
import Pages.SideMenuPage;
import Pages.TopMenuPage;
import Pages.Widget.*;
import Providers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.getWebDriver(DriverType.CHROME);
        driver.get("http://demoqa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
