package org.example.session8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dropdown");

        Thread.sleep(2000);

        Select course = new Select(driver.findElement(By.id("dropdown")));

        course.selectByVisibleText("Option 1");

        System.out.println("Option 1 selected successfully!");

        Thread.sleep(2000);

        TakesScreenshot ts = (TakesScreenshot) driver;

        File source = ts.getScreenshotAs(OutputType.FILE);

        File destination = new File("screenshot.png");

        FileUtils.copyFile(source, destination);

        System.out.println("Screenshot saved successfully!");

        Thread.sleep(5000);

        driver.quit();
    }
}

