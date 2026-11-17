package org.example.session5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        // CSS Attribute Selector
        driver.findElement(By.cssSelector("input[placeholder='Username']"))
                .sendKeys("standard_user");

        driver.findElement(By.cssSelector("input[placeholder='Password']"))
                .sendKeys("secret_sauce");

        driver.quit();
    }
}