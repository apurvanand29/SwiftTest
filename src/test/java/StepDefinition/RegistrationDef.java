package StepDefinition;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.RegistrationPage;
import utility.BrowserDriver;

public class RegistrationDef {

    WebDriver driver = BrowserDriver.driver;
    RegistrationPage registrationPage = new RegistrationPage(driver);

    @Then("User must see User Registration Page")
    public void user_must_see_user_registration_page() {
        registrationPage.checkUserRegistrationPage();
    }
}
