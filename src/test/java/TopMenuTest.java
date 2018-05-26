import Base.TestBase;
import Models.TopMenu;
import Pages.AboutPage;
import Pages.SideMenuPage;
import Pages.TopMenuPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    TopMenuPage topMenuPage;
    SideMenuPage sideMenuPage;
    AboutPage aboutPage;

    @BeforeMethod
    public void initializePages() {
        topMenuPage = new TopMenuPage(driver);
        sideMenuPage = new SideMenuPage(driver);
        aboutPage = new AboutPage(driver);
    }

    @Test
    public void properPagesOpenCheck() {
        topMenuPage.openMenu(TopMenu.ABOUT);
        Assert.assertEquals("About us", aboutPage.getHeader());
    }

}
