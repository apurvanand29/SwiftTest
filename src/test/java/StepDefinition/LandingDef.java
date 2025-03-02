package StepDefinition;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.LandingPage;
import utility.BrowserDriver;

public class LandingDef {
    WebDriver driver= BrowserDriver.driver;
    LandingPage landingPage = new LandingPage(driver);

    @Then("User must see {string} url")
    public void user_must_see_url(String url) {
        landingPage.checkLandingPageUrl(url);
    }
}
