import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Selenium {

    @Test
    public void halloJayJay(){
        //inisialisasi browser driver
        WebDriver driver = WebDriverManager.chromedriver().create();

        //navigasi url
        driver.get("https://jayjay.co/");

        //get element atribut
        String text = driver.findElement(By.className("first-course")).getText();

        //assersion atau pengecekan
        assertEquals("Gebrakan Kursus Online Yang Siap Meroketkan Kariermu", text);

    }

}
