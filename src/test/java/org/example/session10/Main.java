
package org.example.session10;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        try {

            // =================================
            // PART 1: FRAMES
            // =================================

            System.out.println("----- FRAMES -----");

            driver.get("https://the-internet.herokuapp.com/nested_frames");

            Thread.sleep(3000);

            // Switch to top frame
            wait.until(ExpectedConditions
                    .frameToBeAvailableAndSwitchToIt("frame-top"));

            Thread.sleep(3000);

            // Switch to left frame
            wait.until(ExpectedConditions
                    .frameToBeAvailableAndSwitchToIt("frame-left"));

            Thread.sleep(3000);

            String leftText =
                    driver.findElement(By.tagName("body")).getText();

            System.out.println("Left Frame: " + leftText);

            // Return to top frame
            driver.switchTo().parentFrame();

            Thread.sleep(3000);

            // Switch to middle frame
            wait.until(ExpectedConditions
                    .frameToBeAvailableAndSwitchToIt("frame-middle"));

            Thread.sleep(3000);

            String middleText =
                    driver.findElement(By.id("content")).getText();

            System.out.println("Middle Frame: " + middleText);

            // Return to main page
            driver.switchTo().defaultContent();

            Thread.sleep(3000);

            System.out.println("Frame handling completed");



            System.out.println("----- ALERTS -----");

            driver.get("https://the-internet.herokuapp.com/javascript_alerts");

            Thread.sleep(2000);

// 1. SIMPLE ALERT
            driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

            Alert simpleAlert = wait.until(ExpectedConditions.alertIsPresent());

            System.out.println("Simple Alert: " + simpleAlert.getText());

            Thread.sleep(2000);
            simpleAlert.accept();

// Wait for the result after accepting
            wait.until(ExpectedConditions.textToBePresentInElementLocated(
                    By.id("result"), "You successfully clicked an alert"));

            System.out.println("Simple Alert handled successfully");

            Thread.sleep(2000);

// 2. CONFIRM ALERT
            driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

            Alert confirmAlert = wait.until(ExpectedConditions.alertIsPresent());

            System.out.println("Confirm Alert: " + confirmAlert.getText());

            Thread.sleep(2000);
            confirmAlert.dismiss();

// Wait for the result after clicking Cancel
            wait.until(ExpectedConditions.textToBePresentInElementLocated(
                    By.id("result"), "You clicked: Cancel"));

            System.out.println("Confirm Alert handled successfully");

            Thread.sleep(2000);

// 3. PROMPT ALERT
            driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

            Alert promptAlert = wait.until(ExpectedConditions.alertIsPresent());

            System.out.println("Prompt Alert: " + promptAlert.getText());

            Thread.sleep(2000);
            promptAlert.sendKeys("Hello Selenium");

            Thread.sleep(2000);
            promptAlert.accept();

// Wait for the result after submitting text
            wait.until(ExpectedConditions.textToBePresentInElementLocated(
                    By.id("result"), "You entered: Hello Selenium"));

            System.out.println("Prompt Alert handled successfully");

            System.out.println("Alert handling completed");


            // =================================
            // PART 3: WINDOWS
            // =================================

            System.out.println("----- WINDOWS -----");

            driver.get("https://the-internet.herokuapp.com/windows");

            Thread.sleep(3000);

            // Save parent window ID
            String parentWindow = driver.getWindowHandle();

            System.out.println("Parent Window: " + driver.getTitle());

            // Open child window
            driver.findElement(By.linkText("Click Here")).click();

            wait.until(
                    ExpectedConditions.numberOfWindowsToBe(2));

            Thread.sleep(3000);

            // Get all window IDs
            Set<String> allWindows = driver.getWindowHandles();

            for (String window : allWindows) {

                if (!window.equals(parentWindow)) {

                    driver.switchTo().window(window);

                    Thread.sleep(3000);

                    System.out.println(
                            "Child Window: " + driver.getTitle());

                    Thread.sleep(3000);

                    driver.close();

                    break;
                }
            }

            // Return to parent window
            driver.switchTo().window(parentWindow);

            Thread.sleep(3000);

            System.out.println(
                    "Returned to Parent: " + driver.getTitle());

            System.out.println("Window handling completed");

            // Keep final page visible
            Thread.sleep(5000);

        } finally {

            driver.quit();
        }
    }
}
