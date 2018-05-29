import Base.TestBase;
import Models.TopMenu;
import Pages.MainPages.ContactPage;
import Pages.SideMenuPage;
import Pages.TopMenuPage;
import Pages.Widget.MenuPage;
import Utilities.WebElementManipulator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactFormTest extends TestBase {
    TopMenuPage topMenuPage;
    ContactPage contactPage;

    @BeforeMethod
    public void initializePages() {
        topMenuPage = new TopMenuPage(driver);
        contactPage = new ContactPage(driver);
        topMenuPage.openMenu(TopMenu.CONTACT);
    }

    @Test
    public void incorrectFormFill() {
        contactPage.clearName();
        contactPage.clearEmail();
        contactPage.submit();
        Assert.assertEquals("Validation errors occurred. Please confirm the fields and submit it again.", contactPage.getAlertMessage());
    }

    @Test
    public void correctFormFill() {
        contactPage.setName("Kate");
        contactPage.setEmail("kate@domain.com");
        contactPage.submit();
        Assert.assertEquals("Your message was sent successfully. Thanks.", contactPage.getAlertMessage());
    }
}
