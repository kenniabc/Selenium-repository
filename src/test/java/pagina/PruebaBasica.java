package pagina;

import commons.Configuration;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruebaBasica {
    @Test
    void testTituloPagina() {
        WebDriver driver = Configuration.createChromeDriver();
        driver.get(Configuration.URL_PAGE);
        String expectedTitle = "Swag Labs";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle, "El titulo de la pagina no es el esperado");
        driver.quit();
    }
}
