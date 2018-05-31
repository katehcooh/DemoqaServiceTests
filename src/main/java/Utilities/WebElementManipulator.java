package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;


public class WebElementManipulator {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public WebElementManipulator(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void elementIsVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement getRandomElement(List<WebElement> elementsList) {
        Random random = new Random();
        int randomNumber = random.nextInt(elementsList.size()-1);
        return elementsList.get(randomNumber);
    }

    public int getRandomNumber(int bound) {
        Random random = new Random();
        int randomNumber = random.nextInt(bound);
        return randomNumber;
    }

    public void elementIsClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public Select getSelectElement(WebElement element) {
        Select selectElement = new Select(element);
        return selectElement;
    }
}
