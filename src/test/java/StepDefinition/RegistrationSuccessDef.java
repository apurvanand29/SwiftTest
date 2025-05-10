package StepDefinition;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.RegistrationSuccessPage;
import utility.BrowserDriver;

public class RegistrationSuccessDef {
    WebDriver driver = BrowserDriver.driver;
    RegistrationSuccessPage registrationSuccessPage;

    @Then("User must see User Registered Successfully")
    public void user_must_see_User_Registered_Successfully() {
        registrationSuccessPage = new RegistrationSuccessPage(driver);
        registrationSuccessPage.verifySuccessfulRegistration();
    }
}
