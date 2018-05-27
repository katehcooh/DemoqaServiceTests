package Pages.Interaction;

import Utilities.WebElementManipulator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectablePage extends WebElementManipulator {

    @FindBy(css=".entry-title")
    private WebElement header;

    public SelectablePage(WebDriver driver) {
        super(driver);
    }

    public String getHeader() {
        return header.getText();
    }
}
