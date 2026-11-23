package org.example.session7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // Locate username field
        WebElement username = driver.findElement(By.id("user-name"));

        // getAttribute()
        System.out.println("Attribute: " +
                username.getAttribute("placeholder"));

        // getText()
        WebElement heading = driver.findElement(By.className("login_logo"));

        System.out.println("Text: " + heading.getText());

        // getTagName()
        System.out.println("Tag Name: " + username.getTagName());

        driver.quit();
    }
}
