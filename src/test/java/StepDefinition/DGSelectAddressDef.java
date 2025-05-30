package StepDefinition;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.DGSelectAddressPage;
import utility.BrowserDriver;

import java.time.Duration;

public class DGSelectAddressDef {

    WebDriver driver= BrowserDriver.driver;
    DGSelectAddressPage dgSelectAddressPage = new DGSelectAddressPage(driver);

    @When("user clicks Shopping in-store dropdown")
    public void user_clicks_shopping_in_store_dropdown() {
        dgSelectAddressPage.clickCurrentAddress();
    }

    @When("user clicks on Change Address")
    public void user_clicks_on_change_address() {
       dgSelectAddressPage.clickChangeAddress();
    }

    @When("user selects {string}")
    public void user_selects(String address) {
        dgSelectAddressPage.selectAddress(address);
    }
}
