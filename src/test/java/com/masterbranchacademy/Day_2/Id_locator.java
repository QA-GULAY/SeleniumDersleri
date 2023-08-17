package com.masterbranchacademy.Day_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_locator {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/forgot_password");
        driver.manage().window().maximize();

        WebElement element=driver.findElement(By.id("form_submit"));

        element.click();

        Thread.sleep(3000);

        driver.close();

    }
}
