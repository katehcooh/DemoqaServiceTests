package Pages;

import Models.TopMenu;
import Utilities.WebElementManipulator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TopMenuPage extends WebElementManipulator {

    @FindBy (xpath = "//a[@title='Home']")
    private WebElement homeButton;

    @FindBy (xpath = "//a[@title='About us']")
    private WebElement aboutButton;

    @FindBy (xpath = "//a[@title='Services']")
    private WebElement servicesButton;

    @FindBy (xpath = "//a[@title='Demo']")
    private WebElement demoButton;

    @FindBys (@FindBy (xpath = "//ul[@class=' dropdown-menu']//li"))
    private List<WebElement> demoOptions;

    @FindBy (xpath = "//a[@title='Blog']")
    private WebElement blogButton;

    @FindBy (xpath = "//a[@title='Contact']")
    private WebElement contactButton;

    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    public void openMenu(TopMenu item) {
        switch (item) {
            case HOME:
                homeButton.click();
                break;
            case ABOUT:
                aboutButton.click();
                break;
            case SERVICES:
                servicesButton.click();
                break;
            case DRAGGABLE:
                demoButton.click();
                demoOptions.get(0).click();
                break;
            case TABS:
                demoButton.click();
                demoOptions.get(1).click();
                break;
            case BLOG:
                blogButton.click();
                break;
            case CONTACT:
                contactButton.click();
                break;
            default:
                homeButton.click();
        }
    }
}
