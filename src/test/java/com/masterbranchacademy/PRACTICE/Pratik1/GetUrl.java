package com.masterbranchacademy.PRACTICE.Pratik1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrl {
    public static void main(String[] args) {
        //  1. chrome driver i olusturun
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        //2. driver.get ile https://demoqa.com/ sitesini acin
        driver.get("https://demoqa.com/");
        //  3. a) sayfanin url`ini bir String e alin
        driver.getCurrentUrl();
        //  b) url`in "demoqa" iceriyor ise test gecti yazdirin
        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        if (actualUrl.contains("demoqa")) {
            System.out.println("Url testi gecti");
        } else {
            System.out.println("Url testi gecemedi");
        }
        //  c) icermiyor ise test basarisiz yazdirin
        //  4. ve chrome driver i kapatin
        driver.close();
    }
}
