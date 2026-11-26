package org.example.session9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/login");

        // 1. IMPLICIT WAIT
        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("tomsmith");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");

        System.out.println("Implicit Wait completed");

        // Set implicit wait to zero before using other waits
        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(0));

        // 2. EXPLICIT WAIT
        WebDriverWait explicitWait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement loginButton = explicitWait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector("button[type='submit']")
                )
        );

        loginButton.click();

        System.out.println("Explicit Wait completed");

        // 3. FLUENT WAIT
        FluentWait<WebDriver> fluentWait =
                new FluentWait<>(driver)
                        .withTimeout(Duration.ofSeconds(15))
                        .pollingEvery(Duration.ofMillis(500))
                        .ignoring(NoSuchElementException.class);

        WebElement message = fluentWait.until(d -> {
            WebElement element = d.findElement(By.id("flash"));

            if (element.isDisplayed()) {
                return element;
            }

            return null;
        });

        System.out.println("Fluent Wait completed");
        System.out.println("Login message: " + message.getText());

        driver.quit();
    }
}
