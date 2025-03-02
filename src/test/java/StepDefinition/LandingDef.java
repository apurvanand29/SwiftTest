package StepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LandingPage;
import utility.BrowserDriver;

public class LandingDef {
    WebDriver driver= BrowserDriver.driver;
    LandingPage landingPage = new LandingPage(driver);

    @Given("User is on Landing page")
    public void user_is_on_Landing_page() throws InterruptedException {
        landingPage.checkLandingPageTitle();
    }

    @Given("User clicks hamburger menu")
    public void user_clicks_hamburger_menu() {
        landingPage.clickHamburgerMenu();
    }


    @When("User clicks on SignIn Portal")
    public void user_clicks_on_SignIn_Portal() {
        landingPage.clickOnSignInPortal();
    }

}
