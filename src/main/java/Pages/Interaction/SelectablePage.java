package Pages.Interaction;

import Utilities.WebElementManipulator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class SelectablePage extends WebElementManipulator {

    @FindBy(css=".entry-title")
    private WebElement header;

    @FindBy(linkText = "Default functionality")
    private WebElement defaultFuncButton;

    @FindBy(linkText = "Display as grid")
    private WebElement gridButton;

    @FindBy(linkText = "Serialize")
    private WebElement serializeButton;

    @FindBys(@FindBy(xpath = "//ol[@id='selectable']/li"))
    private List<WebElement> defaultItemList;

    @FindBys(@FindBy(xpath = "//ol[@id='selectable_grid']/li"))
    private List<WebElement> gridItemList;

    @FindBys(@FindBy(xpath = "//ol[@id='selectable-serialize']/li"))
    private List<WebElement> serializeItemList;

    public SelectablePage(WebDriver driver) {
        super(driver);
    }

    public String getHeader() {
        return header.getText();
    }

    public WebElement getDefaultFuncButton() {
        return defaultFuncButton;
    }

    public WebElement getGridButton() {
        return gridButton;
    }

    public WebElement getSerializeButton() {
        return serializeButton;
    }

    public List<WebElement> getDefaultItemList() {
        return defaultItemList;
    }

    public List<WebElement> getGridItemList() {
        return gridItemList;
    }

    public List<WebElement> getSerializeItemList() {
        return serializeItemList;
    }

    public SelectablePage openMenu(WebElement menuItem) {
        menuItem.click();
        return this;
    }

    public SelectablePage chooseListItem(List<WebElement> list, int itemNumber) {
        list.get(itemNumber-1).click();
        return this;
    }

    public String getItemName(List<WebElement> list, int itemNumber) {
        return list.get(itemNumber-1).getText();
    }

}
