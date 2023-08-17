package com.masterbranchacademy.Day_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextAndPartialLinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
        driver.manage().window().maximize();

        //By.linkText() link textinin UI daki ayni ile kullanilir
        WebElement linkText=driver.findElement(By.linkText("Example 1: Element on page that is hidden"));

        linkText.click();
        
        WebElement linkMessage=driver.findElement(By.tagName("h4"));

        System.out.println("linkMessage.getText() = " + linkMessage.getText());

        Thread.sleep(3000);

        driver.navigate().back();

        WebElement PartialLinkMessage=driver.findElement(By.tagName("h3"));

        System.out.println("PartialLinkMessage = " + PartialLinkMessage.getText());

        Thread.sleep(3000);

        driver.close();



    }
}
