package utilities;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import static org.apache.logging.log4j.LogManager.getLogger;


public class DriverFactory {
    private static Logger logger = getLogger(DriverFactory.class.getName());

    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver_win32//chromedriver.exe");
        String browser = System.getProperty("browser");
        if (browser == null)
            browser = "chrome";
        logger.info("# WebDriver instance for browser: " + browser);

        if (browser.equalsIgnoreCase("chrome"))
            return new ChromeDriver();
        else if (browser.equalsIgnoreCase("ie"))
            return new InternetExplorerDriver();
        else {
           return new ChromeDriver();
        }
    }

}