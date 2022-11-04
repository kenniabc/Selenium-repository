package commons;

import org.openqa.selenium.WebElement;

public class SeleniumUtils {

    public static void printElementInfo(String nombre, WebElement element) {
        String separator = "------------------";
        System.out.println(separator);
        System.out.println("Informacion del elemento : " + nombre);
        System.out.println(separator);
        System.out.println("Objecto WebElement : " + element);
        System.out.println("HTML Externo : " + element.getAttribute("outerHTML"));
        System.out.println("HTML Interno : " + element.getAttribute("innerHTML"));
        System.out.println("Texto : " + element.getText());
        System.out.println("Value : " + element.getAttribute("value"));
        System.out.println("Tag : " + element.getTagName());
        System.out.println("Displayed? : " + element.isDisplayed());
        System.out.println("Selected? : " + element.isSelected());
        System.out.println("Enabled? : " + element.isEnabled());
    }
}