package com.masterbranchacademy.etut2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main(String[] args) {
    //    1. chrome driver i olusturun
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
    //    2. driver.get ile https://demoqa.com/links sitesini acin
        driver.get("https://demoqa.com/links");
    //    3. Home linkini By.linkText metodu ile web element olusturun
        WebElement homeLink=driver.findElement(By.linkText("Home"));
    //    4. ve bu elemente tilayin
        homeLink.click();

    //    5. ve chrome driver i kapatin
        driver.close();
    }
}
