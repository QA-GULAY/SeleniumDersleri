package com.masterbranchacademy.etut2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLink {
    public static void main(String[] args) {
        //     1. chrome driver i olusturun
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        //     2. driver.get ile https://demoqa.com/links sitesini acin
        driver.get("https://demoqa.com/links");
        //     3. Bad Request linkini By.partialLinkText metodu ve "Bad" ile  web element olusturun
        WebElement partialMessage = driver.findElement(By.partialLinkText("Request"));
        //     4. ve bu elemente tilayin
        partialMessage.click();
        //     5. ve chrome driver i kapatin
        driver.close();
    }
}
