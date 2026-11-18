
package org.example.session6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // XPath using ID
        driver.findElement(By.xpath("//input[@id='user-name']"))
                .sendKeys("standard_user");

        // XPath using Name
        driver.findElement(By.xpath("//input[@name='password']"))
                .sendKeys("secret_sauce");

        // XPath using Class
        driver.findElement(By.xpath("//input[contains(@class,'form_input')]"));

        // XPath using Contains
        driver.findElement(By.xpath("//input[contains(@id,'user')]"));

        // XPath using Starts With
        driver.findElement(By.xpath("//input[starts-with(@id,'user')]"));

        // XPath using Text
        String heading = driver.findElement(
                By.xpath("//div[text()='Swag Labs']")
        ).getText();

        System.out.println(heading);

        // Click Login button
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        Thread.sleep(3000);

        driver.quit();
    }
}

