package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Configuration {
    public static String CHROME_DRIVER_PATH = "drivers/chromedriver.exe";
    public static String GECKO_DRIVER_PATH = "drivers/geckodriver.exe";
    public static String URL_PAGE = "https://www.saucedemo.com/";
    public static WebDriver createChromeDriver() {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
        return new ChromeDriver();
    }

         public static WebDriver createFirefoxDriver() {
            System.setProperty("webdriver.gecko.driver", GECKO_DRIVER_PATH);
            return new FirefoxDriver();
        }

    }


