package Pages.Registration;

import Utilities.WebElementManipulator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegistrationPage extends WebElementManipulator {

    @FindBy(css=".entry-title")
    private WebElement header;

    @FindBy(name = "first_name")
    private WebElement firstName;

    @FindBy(name = "last_name")
    private WebElement lastName;

    @FindBys(@FindBy(xpath = "//input[@type='radio']"))
    private List<WebElement> maritalStatus;

    @FindBys(@FindBy(xpath = "//input[@type='checkbox']"))
    private List<WebElement> hobby;

    /*@FindBy(xpath = "//select[@id='dropdown_7']")
    private WebElement country;
    Select selectCountry = new Select(country);

    @FindBy(id = "mm_date_8")
    private WebElement month;
    Select selectMonth = new Select(month);

    @FindBy(id = "dd_date_8")
    private WebElement day;
    Select selectDay = new Select(day);

    @FindBy(id = "yy_date_8")
    private WebElement year;
    Select selectYear = new Select(year);*/

    @FindBy(id = "phone_9")
    private WebElement phone;

    @FindBy(id = "username")
    private WebElement username;

    @FindBy(id = "email_1")
    private WebElement email;

    @FindBy(id = "profile_pic_10")
    private WebElement picture;

    @FindBy(id = "description")
    private WebElement aboutText;

    @FindBy(id = "password_2")
    private WebElement password;

    @FindBy(id = "confirm_password_password_2")
    private WebElement confirmPassword;

    @FindBy(xpath = "//input[@name='pie_submit']")
    private WebElement submitButton;

    @FindBy(className = "piereg_message")
    private WebElement outputMessage;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public String getHeader() {
        return header.getText();
    }

    public RegistrationPage setFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
        return this;
    }

    public RegistrationPage setLastName(String lastName) {
        this.lastName.sendKeys(lastName);
        return this;
    }

    public RegistrationPage setMaritalStatus() {
        getRandomElement(maritalStatus).click();
        return this;
    }

    public RegistrationPage setHobby(int index) {
        hobby.get(index).click();
        return this;
    }

    /*public RegistrationPage setCountry(String country) {
        selectCountry.selectByValue(country);
        return this;
    }

    public RegistrationPage setDate(String month, String day, String year) {
        selectMonth.selectByValue(month);
        selectDay.selectByValue(day);
        selectYear.selectByValue(year);
        return this;
    }*/

    public RegistrationPage setPhone(String number) {
        phone.sendKeys(number);
        return this;
    }

    public RegistrationPage setUsername(String name) {
        username.sendKeys(name + getRandomNumber(1000));
        return this;
    }

    public RegistrationPage setEmail(String email, String domain) {
        this.email.sendKeys(email + getRandomNumber(1000) + domain);
        return this;
    }

    public RegistrationPage setPassword(String password) {
        this.password.sendKeys(password);
        return this;
    }

    public RegistrationPage setAboutText(String text) {
        aboutText.sendKeys(text);
        return this;
    }

    public RegistrationPage setPasswordConfirm(String confirmPassword) {
        this.confirmPassword.sendKeys(confirmPassword);
        return this;
    }

    public RegistrationPage submitRegistrationForm() {
        submitButton.click();
        return this;
    }

    public String getOutputMessage() {
        return outputMessage.getText();
    }

}
