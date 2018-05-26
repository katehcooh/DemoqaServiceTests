package Base;

import Models.DriverType;
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
