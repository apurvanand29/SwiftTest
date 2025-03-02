package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class RegistrationPage extends BrowserDriver {
    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    @FindBy(xpath = "//h1[text()='User Registration Page']")
    public WebElement userRegistrationPage;

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

}
