package com.masterbranchacademy.PRACTICE.pratik3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class soru2 {
    public static void main(String[] args) throws InterruptedException {

        //      1. chrome driver i olusturun
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//      2. driver.get ile https://amazon.com/ sitesini acin
        driver.get("https://amazon.com/");
//      3. searchbox elementine By.xpath metodu ile  web element olusturun
        WebElement searchBox = driver.findElement(By.xpath("//input[contains(@id,nav-search-submit-button)]"));
//      4. ve bu elemente sendKey() metodu ile "Man Hats" yazdirin
        searchBox.sendKeys("Man Hats");
        WebElement searchButton = driver.findElement(By.xpath("//input[contains(@id,twotabsearchtextbox)]"));
        searchButton.click();
//      5. ve 3 saniye bekleme ekleyin
        Thread.sleep(3000);
//      6. cikan neticeyi bir string e alin
        WebElement result = driver.findElement(By.xpath("//span[text()='\"Man Hats\"']"));
        String actualMessage = result.getText();
        String expectedText = "Man Hats";
//         a. netice (result) de "Man Hats" kelimesinin gectigini dogrulayin
//         b. eger geciyor ise consola "Test Gecti" yazdirin
//         c. gecmiyor ise consola "Test Basarisiz" yazdirin
        if (actualMessage.contains(expectedText)){
            System.out.println("Test Gecti");
        }else {
            System.out.println("Test Basarisiz");
        }
//      7. ve chrome driver i kapatin
        driver.quit();










//a[text()='Elemental Selenium']

















    }
}
