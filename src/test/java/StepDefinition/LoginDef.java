package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utility.BrowserDriver;

public class LoginDef {
    WebDriver driver= BrowserDriver.driver;
    LoginPage loginPage;

    @Then("User must be able to see Login page")
    public void user_should_be_able_to_see_Login_page() {
        loginPage = new LoginPage(driver);
        loginPage.checkLoginPage();
    }

    @When("User enters username {string}")
    public void user_Enters_Username(String username) {
        loginPage.enterUsername(username);
    }


    @And("User enters password {string}")
    public void user_Enters_Password(String password) {
        loginPage.enterPassword(password);
    }

    @And("User hits Login button")
    public void user_Hits_Login_Button() {
        loginPage.hitLoginBtn();
    }

    @When("User clicks Register Here button")
    public void user_Clicks_Register_Here_Button() {
        loginPage.clickRegisterBtn();
    }
}
