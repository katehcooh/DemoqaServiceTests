import Base.TestBase;
import Models.TopMenu;
import Pages.*;
import Pages.Interaction.DraggablePage;
import Pages.MainPages.*;
import Pages.Widget.TabsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    TopMenuPage topMenuPage;
    HomePage homePage;
    AboutPage aboutPage;
    ServicesPage servicesPage;
    DraggablePage draggablePage;
    TabsPage tabsPage;
    BlogPage blogPage;
    ContactPage contactPage;


    @BeforeMethod
    public void initializePages() {
        topMenuPage = new TopMenuPage(driver);
        homePage = new HomePage(driver);
        aboutPage = new AboutPage(driver);
        servicesPage = new ServicesPage(driver);
        draggablePage = new DraggablePage(driver);
        tabsPage = new TabsPage(driver);
        blogPage = new BlogPage(driver);
        contactPage = new ContactPage(driver);
    }

    @Test
    public void properPagesFromTopMenuOpenCheck() {
        topMenuPage.openMenu(TopMenu.ABOUT);
        Assert.assertEquals("About us", aboutPage.getHeader());
        topMenuPage.openMenu(TopMenu.SERVICES);
        Assert.assertEquals("Services", servicesPage.getHeader());
        topMenuPage.openMenu(TopMenu.DRAGGABLE);
        Assert.assertEquals("Draggable", draggablePage.getHeader());
        topMenuPage.openMenu(TopMenu.TABS);
        Assert.assertEquals("Tabs", tabsPage.getHeader());
        topMenuPage.openMenu(TopMenu.BLOG);
        Assert.assertEquals("Blog", blogPage.getHeader());
        topMenuPage.openMenu(TopMenu.CONTACT);
        Assert.assertEquals("Contact", contactPage.getHeader());
        topMenuPage.openMenu(TopMenu.HOME);
        Assert.assertEquals("Home", homePage.getHeader());
    }
}
