package StepDefinition;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.LandingPage;
import utility.BrowserDriver;

public class LandingDef {
    WebDriver driver= BrowserDriver.driver;
    LandingPage landingPage;

    @Then("User must see {string} url")
    public void user_must_see_url(String url) {
        landingPage = new LandingPage(driver);
        landingPage.checkLandingPageUrl(url);
    }
}
