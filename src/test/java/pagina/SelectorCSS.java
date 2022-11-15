package pagina;

import commons.ClaseBase1;
import commons.SeleniumUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectorCSS extends ClaseBase1 {

    public void login() throws InterruptedException {
    WebElement username = driver.findElement(By.cssSelector("#user-name"));
    WebElement selectorTypePassword = driver.findElement(By.cssSelector("input[type=\"password\"]"));
    WebElement selectorButon = driver.findElement(By.cssSelector("#login-button"));

    username.sendKeys("standard_user");
    selectorTypePassword.sendKeys("secret_sauce");
    selectorButon.click();
    Thread.sleep(5000);
    }
    @Test
    public void anyTag() throws InterruptedException {
        login();
        WebElement selectorClase = driver.findElement(By.cssSelector("*[class='pricebar']"));
        SeleniumUtils.printElementInfo("buscando con CSS todas la clases", selectorClase);
    }

    @Test
    public void TestUsingType(){
        WebElement selector = driver.findElement(By.cssSelector("input[type]"));
        SeleniumUtils.printElementInfo("usando CSS", selector);
    }
    @Test
    public void TestUsingTypePassword(){
        WebElement selectorType = driver.findElement(By.cssSelector("input[type=\"password\"]"));
        SeleniumUtils.printElementInfo("usando Type especifico",selectorType);
    }
    @Test
    public void TestUsingTypeClass(){
        WebElement selectorClass = driver.findElement(By.cssSelector("input[class=\"input_error form_input\"]"));
        SeleniumUtils.printElementInfo("usando Type especifico para Class",selectorClass);
    }
    @Test
    public void TestByIdUsingCSS(){
        WebElement selectorByID = driver.findElement(By.cssSelector("#user-name"));
        SeleniumUtils.printElementInfo("usando css para buscar Id",selectorByID);
    }
    @Test
    public void TestByClassUsingCSS(){
        WebElement selectorByClass = driver.findElement(By.cssSelector(".submit-button"));
        SeleniumUtils.printElementInfo("usando css para buscar la clase", selectorByClass);
    }
}
