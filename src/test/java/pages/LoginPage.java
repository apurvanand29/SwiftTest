package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class LoginPage extends BrowserDriver {
    WebDriver driver;

    @FindBy(xpath = "//h4/label[text()='Username:']")
    private static WebElement loginPageTitle;

    @FindBy(id = "usr")
    private static WebElement usernameVal;

    @FindBy(id = "pwd")
    private static WebElement passwordVal;

    @FindBy(xpath = "//input[@type='submit']")
    private static WebElement loginBtn;

    // Constructor to initialize elements
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize WebElements
    }

    // Validate user is on Login page
    public void checkLoginPage() {
         assertEquals("Username:", loginPageTitle.getText());
    }

    // User enter username
    public void enterUsername(String username) {
        try{
            usernameVal.sendKeys(username);
        }catch(NoSuchElementException nse){
            nse.printStackTrace();
        }
    }

    // User enter password
    public void enterPassword(String password) {
        try{
            passwordVal.sendKeys(password);
        }catch(NoSuchElementException nse){
            nse.printStackTrace();
        }
    }

    // User hits Login button
    public void hitLoginBtn() {
        try{
            loginBtn.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
