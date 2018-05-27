package Pages.FrameAndWindows;

import Utilities.WebElementManipulator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPage extends WebElementManipulator {

    @FindBy(css=".entry-title")
    private WebElement header;

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    public String getHeader() {
        return header.getText();
    }
}
