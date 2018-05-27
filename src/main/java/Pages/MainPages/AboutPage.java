package Pages.MainPages;

import Utilities.WebElementManipulator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutPage extends WebElementManipulator {

    @FindBy (css=".entry-title")
    private WebElement header;

    public AboutPage(WebDriver driver) {
        super(driver);
    }

    public String getHeader() {
        return header.getText();
    }

}
