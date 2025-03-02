package StepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utility.BrowserDriver;

public class HomeDef {
    WebDriver driver= BrowserDriver.driver;
    HomePage landingPage = new HomePage(driver);

    @Given("User is on Home page")
    public void user_is_on_Home_page() throws InterruptedException {
        landingPage.checkHomePageTitle();
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
