package Pages;

import Models.SideMenu;
import Utilities.WebElementManipulator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SideMenuPage extends WebElementManipulator {

    @FindBy (linkText = "Registration")
    private WebElement registrationButton;

    @FindBy (linkText = "Draggable")
    private WebElement draggableButton;

    @FindBy (linkText = "Droppable")
    private WebElement droppableButton;

    @FindBy (linkText = "Resizable")
    private WebElement resizableButton;

    @FindBy (linkText = "Selectable")
    private WebElement selectableButton;

    @FindBy (linkText = "Sortable")
    private WebElement sortableButton;

    @FindBy (linkText = "Accordion")
    private WebElement accordionButton;

    @FindBy (linkText = "Autocomplete")
    private WebElement autocompleteButton;

    @FindBy (linkText = "Datepicker")
    private WebElement datepickerButton;

    @FindBy (linkText = "Menu")
    private WebElement menuButton;

    @FindBy (linkText = "Slider")
    private WebElement sliderButton;

    @FindBy (linkText = "Tabs")
    private WebElement tabsButton;

    @FindBy (linkText = "Tooltip")
    private WebElement tooltipButton;

    @FindBy (linkText = "Frames and windows")
    private WebElement framesButton;

    public SideMenuPage(WebDriver driver) {
        super(driver);
    }

    public void openMenu(SideMenu item) {
        switch (item) {
            case REGISTRATION:
                registrationButton.click();
                break;
            case DRAGGABLE:
                draggableButton.click();
                break;
            case DROPPABLE:
                droppableButton.click();
                break;
            case RESIZABLE:
                resizableButton.click();
                break;
            case SELECTABLE:
                selectableButton.click();
                break;
            case SORTABLE:
                sortableButton.click();
                break;
            case ACCORDION:
                accordionButton.click();
                break;
            case AUTOCOMPLETE:
                autocompleteButton.click();
                break;
            case DATEPICKER:
                datepickerButton.click();
                break;
            case MENU:
                menuButton.click();
                break;
            case SLIDER:
                sliderButton.click();
                break;
            case TABS:
                tabsButton.click();
                break;
            case TOOLTIP:
                tooltipButton.click();
                break;
            case FRAMES:
                framesButton.click();
                break;
            default:
                registrationButton.click();
                break;
        }
    }
}
