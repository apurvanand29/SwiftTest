package StepDefinition;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utility.BrowserDriver;

public class LoginDef {
    WebDriver driver= BrowserDriver.driver;
    LoginPage loginPage = new LoginPage(driver);

    @Then("User must be able to see Login page")
    public void user_should_be_able_to_see_Login_page() {
        loginPage.checkLoginPage();
    }
}
