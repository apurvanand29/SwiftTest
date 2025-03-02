package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class RegistrationSuccessPage extends BrowserDriver {
    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    @FindBy(xpath = "//h1[text()='User Registered Successfully !!!']")
    private WebElement userRegisteredSuccessfully;

    public RegistrationSuccessPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // User verifies successful registration
    public void verifySuccessfulRegistration() {
        String successMessage = userRegisteredSuccessfully.getText();
        assertEquals("User Registered Successfully !!!", successMessage);
    }
}
