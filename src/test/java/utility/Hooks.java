package utility;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BrowserDriver{


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");
        BrowserDriver.driver = new ChromeDriver();
        BrowserDriver.driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    }


    @After
    public void tearDown(){
        if (BrowserDriver.driver != null) {
            BrowserDriver.driver.quit(); // Close and quit the driver after tests
        }
    }
}
