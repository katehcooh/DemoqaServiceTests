import Base.TestBase;
import Models.SideMenu;
import Pages.FrameAndWindows.FramesPage;
import Pages.Interaction.*;
import Pages.Registration.RegistrationPage;
import Pages.SideMenuPage;
import Pages.Widget.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SideMenuTest extends TestBase {
    SideMenuPage sideMenuPage;
    RegistrationPage registrationPage;
    DraggablePage draggablePage;
    DroppablePage droppablePage;
    ResizablePage resizablePage;
    SelectablePage selectablePage;
    SortablePage sortablePage;
    AccordionPage accordionPage;
    AutocompletePage autocompletePage;
    DatepickerPage datepickerPage;
    MenuPage menuPage;
    SliderPage sliderPage;
    TabsPage tabsPage;
    TooltipPage tooltipPage;
    FramesPage framesPage;

    @BeforeMethod
    public void initializePages() {
        sideMenuPage = new SideMenuPage(driver);
        registrationPage = new RegistrationPage(driver);
        draggablePage = new DraggablePage(driver);
        droppablePage = new DroppablePage(driver);
        resizablePage = new ResizablePage(driver);
        selectablePage = new SelectablePage(driver);
        sortablePage = new SortablePage(driver);
        accordionPage = new AccordionPage(driver);
        autocompletePage = new AutocompletePage(driver);
        datepickerPage = new DatepickerPage(driver);
        menuPage = new MenuPage(driver);
        sliderPage = new SliderPage(driver);
        tabsPage = new TabsPage(driver);
        tooltipPage = new TooltipPage(driver);
        framesPage = new FramesPage(driver);
    }

    @Test
    public void properPagesFromSideMenuOpenCheck() {
        sideMenuPage.openMenu(SideMenu.REGISTRATION);
        Assert.assertEquals("Registration", registrationPage.getHeader());
        sideMenuPage.openMenu(SideMenu.DRAGGABLE);
        Assert.assertEquals("Draggable", draggablePage.getHeader());
        sideMenuPage.openMenu(SideMenu.DROPPABLE);
        Assert.assertEquals("Droppable", droppablePage.getHeader());
        sideMenuPage.openMenu(SideMenu.RESIZABLE);
        Assert.assertEquals("Resizable", resizablePage.getHeader());
        sideMenuPage.openMenu(SideMenu.SELECTABLE);
        Assert.assertEquals("Selectable", selectablePage.getHeader());
        sideMenuPage.openMenu(SideMenu.SORTABLE);
        Assert.assertEquals("Sortable", sortablePage.getHeader());
        sideMenuPage.openMenu(SideMenu.ACCORDION);
        Assert.assertEquals("Accordion", accordionPage.getHeader());
        sideMenuPage.openMenu(SideMenu.AUTOCOMPLETE);
        Assert.assertEquals("Autocomplete", autocompletePage.getHeader());
        sideMenuPage.openMenu(SideMenu.DATEPICKER);
        Assert.assertEquals("Datepicker", datepickerPage.getHeader());
        sideMenuPage.openMenu(SideMenu.MENU);
        Assert.assertEquals("Menu", menuPage.getHeader());
        sideMenuPage.openMenu(SideMenu.SLIDER);
        Assert.assertEquals("Slider", sliderPage.getHeader());
        sideMenuPage.openMenu(SideMenu.TABS);
        Assert.assertEquals("Tabs", tabsPage.getHeader());
        sideMenuPage.openMenu(SideMenu.TOOLTIP);
        Assert.assertEquals("Tooltip", tooltipPage.getHeader());
        sideMenuPage.openMenu(SideMenu.FRAMES);
        Assert.assertEquals("Frames and windows", framesPage.getHeader());
    }
}
