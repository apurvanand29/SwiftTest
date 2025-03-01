package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    WebDriver driver;

    @FindBy(xpath = "//h1/font[text()='Ace Online Shoe Portal']")
    private WebElement title;

    @FindBy(xpath = "//div[@id= \"menuToggle\"]/input[@type='checkbox']")
    private WebElement hamburgerMenu;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // This method helps to check if user landed on Landing page and can see the page title
    public boolean checkLandingPageTitle() {
     return title.isDisplayed();
    }

    public void clickHamburgerMenu() {
        try {
            hamburgerMenu.click();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
