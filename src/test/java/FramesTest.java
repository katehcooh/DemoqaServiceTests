import Base.TestBase;
import Models.SideMenu;
import Pages.FrameAndWindows.FramesPage;
import Pages.SideMenuPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramesTest extends TestBase {
    SideMenuPage sideMenuPage;
    FramesPage framesPage;

    @BeforeMethod
    public void initializePages() {
        sideMenuPage = new SideMenuPage(driver);
        framesPage = new FramesPage(driver);
    }

    @Test
    public void separateNewWindowTest() {
        sideMenuPage.openMenu(SideMenu.FRAMES);
        framesPage.openMenuSeparateWindow();

        String parentWindowId = driver.getWindowHandle();
        framesPage.openSeparateWindow();

        try {
            driver.switchTo().window("targetWindow");

            try {
                Assert.assertEquals("Page Not Found | TOOLSQA", driver.getTitle());
            }
            finally {
                driver.close();
            }
        }
        finally {
            driver.switchTo().window(parentWindowId);
        }
        Assert.assertEquals("Frames and windows | Demoqa", driver.getTitle());
    }
}
