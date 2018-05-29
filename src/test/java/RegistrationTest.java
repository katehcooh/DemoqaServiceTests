import Base.TestBase;
import Models.SideMenu;
import Pages.Registration.RegistrationPage;
import Pages.SideMenuPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {
    SideMenuPage sideMenuPage;
    RegistrationPage registrationPage;

    @BeforeMethod
    public void initializePages() {
        sideMenuPage = new SideMenuPage(driver);
        registrationPage = new RegistrationPage(driver);
        sideMenuPage.openMenu(SideMenu.REGISTRATION);
    }

    @Test
    public void registrationFormFill() {
        registrationPage.setFirstName("Kate")
                .setLastName("Hcooh")
                .setMaritalStatus()
                .setHobby(0)
                .setHobby(1)
                .setPhone("1234567890")
                .setUsername("Kate")
                .setEmail("kate", "@gmail.com")
                .setPassword("zxcvbnm1234567890")
                .setPasswordConfirm("zxcvbnm1234567890")
                .submitRegistrationForm();
        Assert.assertEquals("Thank you for your registration", registrationPage.getOutputMessage());
    }
}
