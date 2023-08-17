package Day_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        //get()metodu sitenin acilmasina yardimci olur
        driver.get("https://www.amazon.com");

        Thread.sleep(2000);
        //get() metodu gibi bizi url e goturur
        driver.navigate().to("https://www.youtube.com");

        Thread.sleep(2000);

        //navigate().back() amazon yani bi onceki sayfaya goturur
        driver.navigate().back();
        Thread.sleep(2000);

        //navigate.forward() youtobe yani bi sonraki sayfaya goturur
        driver.navigate().forward();
        Thread.sleep(2000);

        driver.close();

















    }
}
