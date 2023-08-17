package com.masterbranchacademy.etut2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
    public static void main(String[] args) throws InterruptedException {
        //    1. chrome driver i olusturun
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
       //  2. driver.get ile https://amazon.com/ sitesini acin
        driver.get("https://amazon.com/");
        driver.manage().window().maximize();

        //  3. All elementine By.id metodu ile  web element olusturun
        WebElement allElement=driver.findElement(By.id("searchDropdownBox"));
        //  a. elementin textini bir stringe alin
        String actualText=allElement.getText();
        //  b. ve o textin "All" oldugunu dogrulayin
        String expectedText="All";
        if (expectedText.equals(actualText)){
            System.out.println("Text gecti");
        }else {
            System.out.println("Text gecemedi");
        }
        //    4. ve bu elemente tilayin
        allElement.click();
        //  5. ve 3 saniye bekleme ekleyin
        Thread.sleep(3000);
        //  6. ve chrome driver i kapatin
        driver.close();
    }
}
