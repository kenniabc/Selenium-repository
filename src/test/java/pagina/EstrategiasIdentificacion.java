package pagina;
import commons.ClaseBase1;
import commons.SeleniumUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EstrategiasIdentificacion extends ClaseBase1 {
    @Test
    public void testByID(){
        WebElement element = driver.findElement(By.id("password"));
        SeleniumUtils.printElementInfo("campo de contrasen;a",element);
    }
    @Test
    public void testByClassName(){
        WebElement user = driver.findElement(By.className("input_error"));
        SeleniumUtils.printElementInfo("campo username ",user);
    }
    @Test
    public void testByName(){
        WebElement password = driver.findElement(By.name("password"));
        SeleniumUtils.printElementInfo("campo de password",password);
    }
    @Test
    public void testByClassN(){
        WebElement login = driver.findElement(By.className("submit-button"));
        SeleniumUtils.printElementInfo("submit-button",login);
    }
    @Test
    public void testByTag(){
        WebElement user = driver.findElement(By.tagName("input"));
        SeleniumUtils.printElementInfo("info de user por TagName", user);
    }
}
