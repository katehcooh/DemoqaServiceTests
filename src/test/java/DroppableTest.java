import Base.TestBase;
import Models.SideMenu;
import Pages.Interaction.DroppablePage;
import Pages.SideMenuPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DroppableTest extends TestBase {
    SideMenuPage sideMenuPage;
    DroppablePage droppablePage;
    Actions actions;

    @BeforeMethod
    public void initializePages() {
        sideMenuPage = new SideMenuPage(driver);
        droppablePage = new DroppablePage(driver);
        actions = new Actions(driver);
    }

    @Test
    public void dragAndDropTest() {
        sideMenuPage.openMenu(SideMenu.DROPPABLE);
        actions.dragAndDrop(droppablePage.getDraggableElement(), droppablePage.getTarget()).perform();
        Assert.assertEquals("Dropped!", droppablePage.getTargetHeader());
    }

}
