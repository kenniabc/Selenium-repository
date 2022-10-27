package pagina;

import commons.Configuration;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruebaConFixtures {

    WebDriver driver = null;

    @BeforeEach
    void setUp(){
        driver = Configuration.createChromeDriver();
        System.out.println("setup");
    }

    @Test
    void testTituloPagina(){
        driver.get(Configuration.URL_PAGE);
        String expectedTitle = "Swag Labs ";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
        System.out.println("titulo pagina");

    }
    @Test
    void testTituloPagina2(){
        driver.get(Configuration.URL_PAGE);
        String expectedTitle = "Swag Labs";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
        System.out.println("titulo pagina2");


    }

    @BeforeAll
        static void refresh(){
        System.out.println("refresh");
    }

    @AfterEach
    void tearDown(){
        driver.quit();
        System.out.println("quit");
    }
}
