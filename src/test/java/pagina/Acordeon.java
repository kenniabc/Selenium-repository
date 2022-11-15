package pagina;

import com.sun.org.apache.xpath.internal.operations.Equals;
import commons.ClaseBase2;
import commons.SeleniumUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Acordeon extends ClaseBase2 {
@Test
public void acordeon (){
    WebElement element = driver.findElement(By.id("link_content_section_responsivegrid_responsivegrid_accordion_1"));
    String accordeonS = element.getAttribute("aria-expanded");
    assertEquals("true",accordeonS);

}


}
