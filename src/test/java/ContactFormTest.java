import Base.TestBase;
import Models.TopMenu;
import Pages.MainPages.ContactPage;
import Pages.TopMenuPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactFormTest extends TestBase {
    TopMenuPage topMenuPage;
    ContactPage contactPage;

    @BeforeMethod
    public void initializePages() throws Exception {
        topMenuPage = new TopMenuPage(driver);
        contactPage = new ContactPage(driver);
        topMenuPage.openMenu(TopMenu.CONTACT);
    }

    @Test(dataProvider = "Contact")
    public void contactFormFill(String name, String email, String message) {
        contactPage.setName(name);
        contactPage.setEmail(email);
        contactPage.submit();
        Assert.assertEquals(message, contactPage.getAlertMessage());
    }
}
