package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.RegistrationPage;
import utility.BrowserDriver;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class RegistrationDef {

    WebDriver driver = BrowserDriver.driver;
    RegistrationPage registrationPage = new RegistrationPage(driver);

    @When("User enters following on Registration page")
    public void user_Enters_Following_On_Registration_Page(DataTable dataTable) {
        // Convert DataTable to a List of Maps (Key-Value Pairs)
        List<Map<String, String>> registrationData = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> data : registrationData) {
            registrationPage.enterRegistrationDetails(data.get("Field"), data.get("Value"));
        }
    }

    @And("User hits Submit button")
    public void user_hits_submit_button() {
        registrationPage.clickSubmitBtn();
    }

    @Then("User must see User Registration Page")
    public void user_must_see_user_registration_page() {
        registrationPage.checkUserRegistrationPage();
    }
}
