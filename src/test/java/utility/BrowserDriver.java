package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    public WebDriver driver;
    public ChromeOptions options;

    public BrowserDriver(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "srv/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    public void close(){
        this.driver.close();
    }
}
