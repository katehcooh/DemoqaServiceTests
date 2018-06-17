package Pages.FrameAndWindows;

import Utilities.WebElementManipulator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPage extends WebElementManipulator {

    @FindBy(css=".entry-title")
    private WebElement header;

    @FindBy(id = "ui-id-2")
    private WebElement menuSeparateWindowButton;

    @FindBy(xpath = "//a[@href='http://toolsqa.com/registration']")
    private WebElement separateWindowLink;

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    public String getHeader() {
        return header.getText();
    }

    public FramesPage openMenuSeparateWindow() {
        menuSeparateWindowButton.click();
        return this;
    }

    public FramesPage openSeparateWindow() {
        separateWindowLink.click();
        return this;
    }


}
