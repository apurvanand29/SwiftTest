package utility;



import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BrowserDriver{

    // To ensure 1 browser session
    @BeforeAll
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");
        BrowserDriver.driver = new ChromeDriver();
        BrowserDriver.driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    }


    @AfterAll
    public static void tearDown(){
        if (BrowserDriver.driver != null) {
            BrowserDriver.driver.quit(); // Close and quit the driver after tests
        }
    }
}
