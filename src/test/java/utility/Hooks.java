package utility;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DGSelectAddressPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Hooks extends BrowserDriver {

    // To ensure 1 browser session
    @Before
    public static void setUp() throws MalformedURLException {
        // Set the path to the ChromeDriver executable without Docker
         // System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");
         // BrowserDriver.driver = new ChromeDriver();
         //mvn BrowserDriver.driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

        // Set the path to the ChromeDriver executable with Docker
        String useGrid = System.getProperty("useGrid", "false");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized", "disable-infobars");

        if (useGrid.equalsIgnoreCase("true")) {
            // Run using Selenium Grid (e.g., Docker)
            //BrowserDriver.driver = new RemoteWebDriver(new URL("http://selenium-hub:4444/wd/hub"), options);
            // Run on Azure public IP using docker
            BrowserDriver.driver = new RemoteWebDriver(new URL("http://135.119.197.200:4444/"), options);
        } else {
            // Run locally using ChromeDriver
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");
            BrowserDriver.driver = new ChromeDriver(options);
        }

        //BrowserDriver.driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BrowserDriver.driver.get("https://www.dollargeneral.com");
    }

    @After
    public static void tearDown() {
        if (BrowserDriver.driver != null) {
            BrowserDriver.driver.quit(); // Close and quit the driver after tests
        }
    }
}
