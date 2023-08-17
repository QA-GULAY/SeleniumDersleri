package com.masterbranchacademy.Day_3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_relative {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");

        driver.manage().window().maximize();

        // WebElement userName = driver.findElement(By.xpath("//div/input"));

        //   userName.sendKeys("Xpath");

        //  WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        //  WebElement password=driver.findElement(By.xpath("//*[@type='password']"));
        // WebElement password = driver.findElement(By.xpath("//input[@*='password']"));
        // //*[@*='password']  --> boylede bi formatta var fakat kullanisli degil.
        //WebElement password = driver.findElement(By.xpath("//*[@*='password'and@name='password']"));
        //  WebElement password = driver.findElement(By.xpath("//*[@*='password'][@name='password']"));
      /*  WebElement password = driver.findElement(By.xpath("//input[@*='password'or@name='password']"));

        password.sendKeys("21547");
*/
        //reletive Xpath in Text() metodu ile locator bulma!!!
        WebElement textTitle = driver.findElement(By.xpath("//*[text()='Login Page']"));

        System.out.println(textTitle.getText());

        //  //contains() metodu ile locator bulma
        System.out.println(driver.findElement(By.xpath("//*[contains(text(),'This is where yo')]")).getText());

        /*WebElement password= driver.findElement(By.xpath("//*[contains(@id,'wo')]"));
        password.sendKeys("54896");*/

        //starts-with()
       /* WebElement password = driver.findElement(By.xpath("//*[starts-with(@id,'pass')]"));
        password.sendKeys("5478");*/

        //babadan child a  -->//div/a     veya    //div//a  ,  //div/../
        //child dan parent a gitme  -->  /..
        WebElement button = driver.findElement(By.xpath("//*[@class='fa fa-2x fa-sign-in']/.."));
        button.click();

        //Sibling (Akraba) yolu ile locate etme
        //  -->  xpath=//*[@type='text']//following::input

      /*  WebElement username= driver.findElement(By.xpath("//*[@class='subheader']/following::input"));
        username.sendKeys("Xpath");*/

        //  -->  //input[@id='username']/following-sibling:input[1]  (ilerideki inputlara bakar)

        WebElement username= driver.findElement(By.xpath("//form[@name='login']//following-sibling::input"));

        username.sendKeys("xpath");


        //  -->  xpath=//*[@type='submit']//preceding::input  (PRECEDING gerideki inputlara bakar)

       /* WebElement password1 = driver.findElement(By.xpath("//button//preceding::input"));
        password1.sendKeys("34232");
*/

        //INDEX ile -->  xpath=(//body/div)[2]      ve      xpath=//body/div[2]


        WebElement password= driver.findElement(By.xpath(" (//div/input)[2]"));

        password.sendKeys("xpath");


        Thread.sleep(3000);

        driver.close();


    }
}
