
package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        System.out.println("First website: " + driver.getTitle());

        driver.navigate().to("https://www.wikipedia.org");
        System.out.println("Second website: " + driver.getTitle());

        driver.quit();
    }
}
