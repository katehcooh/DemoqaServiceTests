package Base;
import Models.DriverType;
import Providers.DriverFactory;
import Utilities.ExcelReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

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

    @DataProvider
    public Object[][] Contact() throws Exception {
        Object[][] contactData = ExcelReader.getTableArray(System.getProperty("user.dir")+"/src/main/resources/testdata/contactData.xlsx","Arkusz1", 3);
        return contactData;
    }
}
