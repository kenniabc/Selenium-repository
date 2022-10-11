package pagina;

import commons.Configuration;
import org.openqa.selenium.WebDriver;
import static commons.Configuration.URL_PAGE;

public class propiedadesPagina {
    public static void main (String [] arg) throws InterruptedException {
        WebDriver driver = Configuration.createChromeDriver();
        driver.get(URL_PAGE);
        //driver.get(Configuration.URL_PAGE);
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.quit();

        WebDriver firefox = Configuration.createFirefoxDriver();
        firefox.get(Configuration.URL_PAGE);
        Thread.sleep(4000);
        System.out.println(firefox.getTitle());
        System.out.println(firefox.getCurrentUrl());
        System.out.println(firefox.getPageSource());
        firefox.quit();
    }
}
