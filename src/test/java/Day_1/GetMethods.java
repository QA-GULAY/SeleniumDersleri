package Day_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println("driver.getTitle()= " + driver.getTitle());

        //getTitle()metodu bize sayfanin basligini getirir
        String actualTitle=driver.getTitle();

        String expectedTitle="Amazon.com. Spend less. Smile more.";

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Title testi gecti");
        }else {
            System.out.println("Title testi gecemedi");
        }

        //getCurrentUrl() sayfanin url ini getirir
        System.out.println("driver.getCurrentUrl():" + driver.getCurrentUrl());

        String actualUrl=driver.getCurrentUrl();

        String expectedUrl="https://www.amazon.com/";

        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url testi gecti");
        }else {
            System.out.println("Url testi gecemedi");
        }
        //getWindowHandle()metodu bize degisken bi ID getirir.her browseri acip kapadagimizda yeni id getirir
        System.out.println("driver.getWindowHandle():"+driver.getWindowHandle());

        System.out.println(driver.getPageSource()); //HTML KODUNU (( KAYNAK KODU ))  GETIRIR

        String pageSource= driver.getPageSource();

        if (pageSource.contains(expectedUrl)){
            System.out.println("page source testi gecti");
        }else {
            System.out.println("page source testi gecemedi");
        }



        driver.close();












    }
}
