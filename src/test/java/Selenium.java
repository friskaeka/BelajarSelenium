import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Selenium {

    public static WebDriver driver;

    @Test
    public void halloJayJay() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--window-size=1920,1080");

        // inisialisasi browser driver
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // navigasi url
        driver.get("https://jayjay.co");

        Thread.sleep(3000);
        driver.quit();

        //get element attribute
        String text = driver.findElement(By.className("first-course")).getText();

        // assertion / pengecekan
        assertEquals("Gebrakan Kursus Online yang Siap Meroketkan Kariermu", text);

    }

}
