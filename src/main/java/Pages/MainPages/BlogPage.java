package Pages.MainPages;

import Utilities.WebElementManipulator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends WebElementManipulator {

    @FindBy(xpath = "//span[@property='v:title']")
    private WebElement header;

    public BlogPage(WebDriver driver) {
        super(driver);
    }

    public String getHeader() {
        return header.getText();
    }
}
