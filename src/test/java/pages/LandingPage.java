package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class LandingPage extends BrowserDriver {
    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait for 10 seconds

    @FindBy(xpath = "//font[contains(text(),'Ace Online Shoe Portal')]")
    private WebElement pageTitle;

    @FindBy(xpath = "//div[@id= \"menuToggle\"]/input[@type='checkbox']")
    private WebElement hamburgerMenu;

    @FindBy(xpath ="//ul/a/li[text()='Sign In Portal']")
    private WebElement signInPortal;

    // Constructor to initialize elements
    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize WebElements
    }

    // This method helps to check if user landed on Landing page and can see the page title
    public void checkLandingPageTitle() throws InterruptedException {
        String actualTitle = pageTitle.getText();
        assertEquals("Ace Online Shoe Portal", actualTitle);
    }

    // Click on hamburger menu
    public void clickHamburgerMenu() {
        try {
            hamburgerMenu.click();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Click on Sign in portal
    public void clickOnSignInPortal() {
        try {
            // Wait until specific element is visible
            wait.until(ExpectedConditions.visibilityOf(signInPortal));
            signInPortal.click();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
