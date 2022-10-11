import commons.Configuration;
import org.openqa.selenium.WebDriver;

public class metodosNavegador {
    public static void main (String [] arg) throws InterruptedException {
        WebDriver driver = Configuration.createChromeDriver();
        driver.get("http://www.google.com");
        driver.get("http://www.amazon.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.quit();

        WebDriver firefox = Configuration.createFirefoxDriver();
        firefox.navigate().to("https://www.amazon.com/");
        firefox.manage().window().fullscreen();
        Thread.sleep(5000);
        firefox.quit();
    }
}
