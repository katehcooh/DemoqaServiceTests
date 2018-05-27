package Pages.MainPages;

import Utilities.WebElementManipulator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends WebElementManipulator {

    @FindBy(css=".entry-title")
    private WebElement header;

    @FindBy (name = "your-name")
    private WebElement nameField;

    @FindBy (name = "your-email")
    private WebElement emailField;

    @FindBy (name = "your-subject")
    private WebElement subjectFild;

    @FindBy (name = "your-message")
    private WebElement messageField;

    @FindBy (xpath = "//input[@type='submit']")
    private WebElement submitButton;

    @FindBy (xpath = "//*[@id=\"wpcf7-f375-p28-o1\"]/form/div[2]")
    private WebElement alertMessage;

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public String getHeader() {
        return header.getText();
    }

    public void setName(String name) {
        nameField.sendKeys(name);
    }

    public void clearName() {
        nameField.clear();
    }

    public void setEmail(String email) {
        emailField.sendKeys(email);
    }

    public void clearEmail() {
        emailField.clear();
    }

    public void setSubject(String subject) {
        subjectFild.sendKeys(subject);
    }

    public void setMessage(String message) {
        messageField.sendKeys(message);
    }

    public void submit() {
        submitButton.click();
        elementIsVisible(alertMessage);
    }

    public String getAlertMessage() {
        return alertMessage.getText();
    }
}
