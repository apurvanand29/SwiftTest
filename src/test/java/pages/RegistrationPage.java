package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class RegistrationPage extends BrowserDriver {
    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    @FindBy(xpath = "//h1[text()='User Registration Page']")
    private WebElement userRegistrationPage;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitBtn;

    @FindBy(xpath = "//select/option")
    private WebElement salutationDropdown;

    @FindBy(xpath = "//label[@for='firstname']//following::input[@id='firstname']")
    private WebElement firstNameVal;

    @FindBy(xpath = "//label[@for='lastname']//following::input[@id='lastname']")
    private WebElement lastNameVal;

    @FindBy(xpath = "//label[@for='emailId']//following::input[@id='emailId']")
    private WebElement emailVal;

    @FindBy(xpath = "//label[@for='contactNumber']//following::input[@id='contactNumber']")
    private WebElement contactNumberVal;

    @FindBy(xpath = "//input[@id='usr']")
    private WebElement usernameVal;

    @FindBy(xpath = "//input[@id='pwd']")
    private WebElement passwordVal;

    // Constructor to initialize elements
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // User verifies current page is Registration page
    public void checkUserRegistrationPage(){
        wait.until(ExpectedConditions.visibilityOf(userRegistrationPage));
        String actualTitle = userRegistrationPage.getText();
        assertEquals("User Registration Page", actualTitle);
    }

    //User enters registration data
    public void enterRegistrationDetails(String salutation, String firstName, String lastName, String emailId, String contactNumber, String username, String password){
        // Select the Salutation from the dropdown
        Select salutationSelect = new Select(salutationDropdown);
        salutationSelect.selectByVisibleText(salutation);
        firstNameVal.sendKeys(firstName);
        lastNameVal.sendKeys(lastName);
        emailVal.sendKeys(emailId);
        contactNumberVal.sendKeys(contactNumber);
        usernameVal.sendKeys(username);
        passwordVal.sendKeys(password);
    }

    // User hits submit button on registration page
    public void clickSubmitBtn() {
        try{
            submitBtn.click();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
