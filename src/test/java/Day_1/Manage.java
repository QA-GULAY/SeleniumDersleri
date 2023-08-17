package Day_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        //manage() metodu sayfayi maximaze yapar
        driver.manage().window().maximize();

        //getSize() sayfanin pixel olarak buyuklugunu getirir
        System.out.println("driver.manage().window().getSize():"+driver.manage().window().getSize());

        System.out.println(" driver.manage().window().getPosition():"+ driver.manage().window().getPosition());

        //manage().window().setPosition() bize yeniden yeni bir pozisyon ayarlamamiza yarar
        driver.manage().window().setPosition(new Point(15,15));
        System.out.println(" driver.manage().window().setPosition()=" +  driver.manage().window().getPosition());


        driver.manage().window().setSize(new Dimension(900,600));
        Thread.sleep(5000);


        driver.close();
    }
}
