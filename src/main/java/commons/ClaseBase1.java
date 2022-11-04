package commons;

import commons.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class ClaseBase1 {

    protected static WebDriver driver = null;

    @BeforeAll
    public static void launchBrowser() throws InterruptedException {
        driver = Configuration.createChromeDriver();
        driver.get(Configuration.URL_PAGE);
        Thread.sleep(2000);
    }

    @AfterAll
    public static void closeBrowser() {
        driver.quit();
    }
}