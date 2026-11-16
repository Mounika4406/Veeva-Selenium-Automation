package org.example.session4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        // CSS Selector using ID
        driver.findElement(By.cssSelector("#user-name"))
                .sendKeys("standard_user");

        // CSS Selector using ID
        driver.findElement(By.cssSelector("#password"))
                .sendKeys("secret_sauce");

        // CSS Selector using Tag Name
        System.out.println(driver.findElement(By.cssSelector("input")).getTagName());

        driver.quit();
    }
}