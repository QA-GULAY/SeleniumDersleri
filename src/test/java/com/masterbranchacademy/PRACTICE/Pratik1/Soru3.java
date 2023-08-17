package com.masterbranchacademy.PRACTICE.Pratik1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Soru3 {
    public static void main(String[] args) throws InterruptedException {
        //   1. chrome driver i olusturun
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        // 2. driver.get ile https://www.etsy.com/ sitesini acin
        driver.navigate().to("https://www.etsy.com/");
        //  3. sonra https://www.selenium.dev/ sitesine gidin
        driver.navigate().to("https://www.selenium.dev/");
        Thread.sleep(3000);
        //4. https://www.etsy.com/ sitesine geri donun
        driver.navigate().back();
        Thread.sleep(3000);
        //  5. https:www.selenium.dev/ sitesine tekrar acin
        driver.navigate().forward();
        Thread.sleep(3000);
        //   6. sayfayi yenileyin (refresh)
        driver.navigate().refresh();
        //   7. sayfanin basligini alin ve yazdirin
        driver.getTitle();
        System.out.println("driver = " + driver);
        //   8. ve chrome driver i kapatin
        driver.close();
/*
        1. chrome driver i olusturun
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//      2. driver.get ile https://www.etsy.com/ sitesini acin
        driver.get("https://www.etsy.com/");
//      3. sonra https://www.selenium.dev/ sitesine gidin
        driver.navigate().to("https://www.selenium.dev/");
        Thread.sleep(2000);
//      4. https://www.etsy.com/ sitesine geri donun
        driver.navigate().back();
        Thread.sleep(2000);
//      5. https://www.selenium.dev/ sitesine tekrar acin
        driver.navigate().forward();
//      6. sayfayi yenileyin (refresh)   driver.navigate().refresh();
        driver.navigate().refresh();
        Thread.sleep(2000);
//      7. sayfanin basligini alin ve yazdirin
        String title = driver.getTitle();
        System.out.println("title = " + title);
//      8. ve chrome driver i kapatin
        driver.quit();*/


    }
}
