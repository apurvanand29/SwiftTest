package utility;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks extends BrowserDriver {

    // To ensure 1 browser session
    @Before
    public static void setUp() throws MalformedURLException {
        // Set the path to the ChromeDriver executable without Docker
         // System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");
         // BrowserDriver.driver = new ChromeDriver();
         //mvn BrowserDriver.driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

        // Set the path to the ChromeDriver executable with Docker
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized", "disable-infobars", "--disable-extensions");
        URL remoteUrl = new URL("http://localhost:4444/wd/hub");

        BrowserDriver.driver = new RemoteWebDriver(remoteUrl, options);
        BrowserDriver.driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    }

    @After
    public static void tearDown() {
        if (BrowserDriver.driver != null) {
            BrowserDriver.driver.quit(); // Close and quit the driver after tests
        }
    }
}
