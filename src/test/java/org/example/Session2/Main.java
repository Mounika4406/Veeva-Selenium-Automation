
package org.example.session2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Step 1: Setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Step 2: Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Step 3: Open Aditya University website
        driver.get("https://maya.adityauniversity.in/");

        // Step 4: Maximize browser window
        driver.manage().window().maximize();

        // Step 5: Wait for 3 seconds
        Thread.sleep(3000);

        // Step 6: Click Login link using XPath
        driver.findElement(By.xpath("//a[.='Login']")).click();

        // Step 7: Wait for 4 seconds
        Thread.sleep(4000);

        // Step 8: Create JavascriptExecutor object
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Step 9: Scroll down by 200 pixels
        js.executeScript("window.scrollBy(0,200)");

        // Step 10: Wait for 2 seconds
        Thread.sleep(2000);

        // Step 11: Find Roll Number field using Name locator
        driver.findElement(By.name("roll_no")).click();

        // Step 12: Wait for 5 seconds
        Thread.sleep(5000);

        // Step 13: Find Password field using XPath and enter sample text
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abc");

        // Step 14: Close browser
        driver.quit();
    }
}
