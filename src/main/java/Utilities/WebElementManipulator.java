package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class WebElementManipulator {
    protected WebDriver driver;

    public WebElementManipulator(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
