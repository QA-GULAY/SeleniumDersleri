package com.masterbranchacademy.PRACTICE.Pratik1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {
    public static void main(String[] args) {
        // 1. chrome driver i olusturun
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        // 2. driver.get ile https://www.selenium.dev/ sitesini acin
        driver.get("https://www.selenium.dev/ ");
        // 3. a) sayfayi kaynak kodunu Stringe yazdirin
        String kaynakKodu = driver.getPageSource();
        // b) kaynak kodun "Getting Started" iceriyor ise test gecti yazdirin
        System.out.println(driver.getPageSource()); //HTML KODUNU GETIRIR

        String pageSource = driver.getPageSource();

        if (pageSource.contains("Getting Started")) {
            System.out.println(" testi basarili");
        } else {
            System.out.println("test basarisiz");
        }
        System.out.println("kaynakKodu = " + kaynakKodu);
        // c) icermiyor ise test basarisiz yazdirin
        // 4 ve chrome driver i kapatin
        driver.close();
    }
}
