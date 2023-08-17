package com.masterbranchacademy.etut2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {
    public static void main(String[] args) {
      //  1. chrome driver i olusturun
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        //  2. driver.get ile https://the-internet.herokuapp.com/windows sitesini acin
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

      //  3. Opening a new window elementine By.tagName metodu ile  web element olusturun
        WebElement element=driver.findElement(By.tagName("h3"));
      //  4. ve bu elementin textini bir String`e alin
        String actualTitle=element.getText();
        System.out.println("actualTitle = " + actualTitle);
      //  5. ve bu textin Opening a new window oldugunu dogrulayin
        String expectedTitle="Opening a new window";
        if (expectedTitle.equals(actualTitle)){
            System.out.println("Title testi gecti");
        }else {
            System.out.println("Title testi gecemedi");
        }
      //  6. ve chrome driver i kapatin
        driver.close();

    }
}
