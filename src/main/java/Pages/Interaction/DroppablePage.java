package Pages.Interaction;

import Utilities.WebElementManipulator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DroppablePage extends WebElementManipulator {

    @FindBy(css=".entry-title")
    private WebElement header;

    @FindBy(css = "#draggableview > p")
    private WebElement draggableElement;

    @FindBy(xpath = "//div[@id='droppableview']")
    private WebElement target;

    @FindBy(xpath = "//div[@id='droppableview']/p")
    private WebElement targetHeader;

    public DroppablePage(WebDriver driver) {
        super(driver);
    }

    public String getHeader() {
        return header.getText();
    }

    public WebElement getDraggableElement() {
        return draggableElement;
    }

    public WebElement getTarget() {
        return target;
    }

    public String getTargetHeader() {
        return targetHeader.getText();
    }
}
