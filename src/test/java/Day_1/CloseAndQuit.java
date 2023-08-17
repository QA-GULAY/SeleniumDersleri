package Day_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        //get()metodu sitenin acilmasina yardimci olur
        driver.get("https://www.amazon.com");

        Thread.sleep(2000);
        //close() mevcut tarayici kapatir
        driver.close();

        driver = new ChromeDriver();

        driver.get("https://www.youtube.com");
        //quit() butun tarayicilari sonlandirir
        Thread.sleep(2000);
        driver.quit();
    }

}
