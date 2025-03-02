package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class RegistrationPage extends BrowserDriver {
    WebDriver driver;

    @FindBy(xpath = "//h1[text()='User Registration Page']")
    public WebElement userRegistrationPage;

    // Constructor to initialize elements
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // User verifies current page is Registration page
    public void checkUserRegistrationPage(){
        String actualTitle = userRegistrationPage.getText();
        assertEquals("User Registration Page", actualTitle);
    }

}
