import Base.TestBase;
import Models.SideMenu;
import Pages.Interaction.SelectablePage;
import Pages.SideMenuPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectableTest extends TestBase {
    SideMenuPage sideMenuPage;
    SelectablePage selectablePage;

    @BeforeMethod
    public void initializePages() {
        sideMenuPage = new SideMenuPage(driver);
        selectablePage = new SelectablePage(driver);
        sideMenuPage.openMenu(SideMenu.SELECTABLE);
    }

    @Test
    public void selectItemTest() {
        selectablePage.openMenu(selectablePage.getDefaultFuncButton())
                .chooseListItem(selectablePage.getDefaultItemList(),7);
        Assert.assertEquals("Item 7", selectablePage.getItemName(selectablePage.getDefaultItemList(), 7));

        selectablePage.chooseListItem(selectablePage.getDefaultItemList(),4);
        Assert.assertEquals("Item 4", selectablePage.getItemName(selectablePage.getDefaultItemList(), 4));

        selectablePage.openMenu(selectablePage.getGridButton())
                .chooseListItem(selectablePage.getGridItemList(),12);
        Assert.assertEquals("12", selectablePage.getItemName(selectablePage.getGridItemList(), 12));

        selectablePage.chooseListItem(selectablePage.getGridItemList(),6);
        Assert.assertEquals("6", selectablePage.getItemName(selectablePage.getGridItemList(), 6));

        selectablePage.openMenu(selectablePage.getSerializeButton())
                .chooseListItem(selectablePage.getSerializeItemList(), 6);
        Assert.assertEquals("Item 6", selectablePage.getItemName(selectablePage.getSerializeItemList(), 6));

        selectablePage.chooseListItem(selectablePage.getSerializeItemList(), 3);
        Assert.assertEquals("Item 4", selectablePage.getItemName(selectablePage.getSerializeItemList(), 4));
    }

    @Test
    public void selectedItemColorChange() {
        selectablePage.openMenu(selectablePage.getDefaultFuncButton())
                .chooseListItem(selectablePage.getDefaultItemList(),7);
        Assert.assertEquals("rgba(243, 152, 20, 1)", selectablePage.getItemBgColor(selectablePage.getDefaultItemList(), 7));

        selectablePage.chooseListItem(selectablePage.getDefaultItemList(),4);
        Assert.assertEquals("rgba(243, 152, 20, 1)", selectablePage.getItemBgColor(selectablePage.getDefaultItemList(), 4));

        selectablePage.openMenu(selectablePage.getGridButton())
                .chooseListItem(selectablePage.getGridItemList(),12);
        Assert.assertEquals("rgba(243, 152, 20, 1)", selectablePage.getItemBgColor(selectablePage.getGridItemList(), 12));

        selectablePage.chooseListItem(selectablePage.getGridItemList(),6);
        Assert.assertEquals("rgba(243, 152, 20, 1)", selectablePage.getItemBgColor(selectablePage.getGridItemList(), 6));

        selectablePage.openMenu(selectablePage.getSerializeButton())
                .chooseListItem(selectablePage.getSerializeItemList(), 6);
        Assert.assertEquals("rgba(243, 152, 20, 1)", selectablePage.getItemBgColor(selectablePage.getSerializeItemList(), 6));

        selectablePage.chooseListItem(selectablePage.getSerializeItemList(), 3);
        Assert.assertEquals("rgba(243, 152, 20, 1)", selectablePage.getItemBgColor(selectablePage.getSerializeItemList(), 3));
    }

}
