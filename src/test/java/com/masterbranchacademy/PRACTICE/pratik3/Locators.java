package com.masterbranchacademy.PRACTICE.pratik3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
    //    1. chrome driver i olusturun
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

    //    2. driver.get ile https://the-internet.herokuapp.com/upload sitesini acin
        driver.get("https://the-internet.herokuapp.com/upload");
    //    3. Choose file elementine By.name metodu ile  web element olusturun
        WebElement choseFile=driver.findElement(By.name("file"));

    //    4. ve bu elemente tilayin
        choseFile.click();
    //    5. ve 3 saniye bekleme ekleyin
        Thread.sleep(3000);
    //    6. ve chrome driver i kapatin
        driver.close();

























    }
}
