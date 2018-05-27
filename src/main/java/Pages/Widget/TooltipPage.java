package Pages.Widget;

import Utilities.WebElementManipulator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TooltipPage extends WebElementManipulator {

    @FindBy(css=".entry-title")
    private WebElement header;

    public TooltipPage(WebDriver driver) {
        super(driver);
    }

    public String getHeader() {
        return header.getText();
    }
}
