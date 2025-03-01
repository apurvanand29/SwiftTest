package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LandingPage;
import static org.junit.Assert.assertTrue;

public class LandingDef {
WebDriver driver;
LandingPage landingPage=new LandingPage(driver);

    @Given("User is on Landing page")
    public void user_is_on_landing_page() {
        assertTrue("User is not the Landing page", landingPage.checkLandingPageTitle());
    }

    @When("User clicks hamburger menu")
    public void user_clicks_hamburger_menu() {
        landingPage.clickHamburgerMenu();
    }

}
