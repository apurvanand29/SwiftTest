package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utility.BrowserDriver;
import static org.junit.Assert.assertTrue;

public class LandingPage extends BrowserDriver {
    WebDriver driver;

    // Constructor to initialize elements
    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkLandingPageUrl(String expectedUrl) {
        String currentUrl = driver.getCurrentUrl();
    if(currentUrl !=null){
        // Compare the current URL with the expected URL
        assertTrue("The URL doesn't contain the expected part: " + expectedUrl, currentUrl.contains(expectedUrl));
    }
    else{
    System.out.println("The URL is null/incorrect " + expectedUrl);}
    }
}
