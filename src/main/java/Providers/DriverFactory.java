package Providers;

import Models.DriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
    public static WebDriver getWebDriver(DriverType browser) {
        String projectDirectory = System.getProperty("user.dir");
        switch(browser) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", projectDirectory + "/src/main/resources/chromedriver.exe");
                return new ChromeDriver();
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", projectDirectory + "/src/main/resources/geckodriver.exe");
                return new FirefoxDriver();
            case IE:
                System.setProperty("webdriver.ie.driver", projectDirectory + "/src/main/resources/IEDriverServer.exe");
                return new InternetExplorerDriver();
            default:
                System.setProperty("webdriver.chrome.driver", projectDirectory + "/src/main/resources/chromedriver.exe");
                return new ChromeDriver();
        }
    }
}
