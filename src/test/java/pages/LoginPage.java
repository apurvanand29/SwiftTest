package pages;

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

    // Constructor to initialize elements
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize WebElements
    }

    // Validate user is on Login page
    public void checkLoginPage() {
         assertEquals("Username:", loginPageTitle.getText());
    }

}
