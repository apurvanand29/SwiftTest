package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

public class DGSelectAddressPage extends BrowserDriver {

    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Wait for 10 seconds

    // Locators
    @FindBy(xpath="//template//following::span[@aria-label=\"change address\"]")
    private WebElement changeAddress;

    @FindBy(xpath="//span[@class='menu-toggle__orderType-label']//parent::div")
    private WebElement currentAddress;

    // Constructor to initialize elements
    public DGSelectAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize WebElements
    }

    public void selectAddress(String address) {
        try {
            driver.findElement(By.xpath("//li/div/ul/following::button[contains(@aria-label,'" + address + "')]")).click();
        }catch(NoSuchElementException e){
            System.out.println(address+" not found on the webpage");
        }
    }

    public void clickCurrentAddress() {
        wait.until(ExpectedConditions.visibilityOf(currentAddress));
        currentAddress.click();
    }

    public void clickChangeAddress() {
        changeAddress.click();
    }
}
