package com.masterbranchacademy.Day_3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");

        driver.manage().window().maximize();

        WebElement userName=driver.findElement(By.name("username"));

        userName.sendKeys("tomsmith ");

        WebElement password=driver.findElement(By.name("password"));

        password.sendKeys("SuperSecretPassword!");

        WebElement loginButton=driver.findElement(By.className("radius"));

        loginButton.click();

        String expectedMessage="Welcome to the Secure Area. When you are done click logout below.";

        WebElement actualText=driver.findElement(By.tagName("h4"));

        String actualMessage=actualText.getText();

        if (actualMessage.equals(expectedMessage)){
            System.out.println("TEST PASS");
        }else {
            System.out.println("TEST FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);

            Thread.sleep(3000);
            driver.close();
        }













    }
}
