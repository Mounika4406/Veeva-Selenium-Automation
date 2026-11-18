# Selenium Automation Practice with Java

This repository contains my Selenium WebDriver practice sessions using Java. I created this repository to maintain the programs I practise during my learning journey and to track my progress in automation testing.

Each session covers different Selenium concepts with practical examples. I will continue updating this repository as I learn new topics.

## Technologies Used

- Java
- Selenium WebDriver
- Maven
- Chrome Browser
- Microsoft Edge
- Mozilla Firefox
- IntelliJ IDEA
- WebDriverManager

---

## Session 1 – Selenium WebDriver Basics

### Overview

In this session, I learned the basics of Selenium WebDriver and how to control a browser using Java.

### Concepts Covered

- Creating a WebDriver instance
- Launching Google Chrome using ChromeDriver
- Opening websites using `driver.get()`
- Navigating between websites using `driver.navigate().to()`
- Retrieving webpage titles using `driver.getTitle()`
- Closing the browser using `driver.quit()`

### Websites Practised

- https://www.google.com
- https://www.wikipedia.org

### Learning Outcome

Learned how to launch a browser, open websites, navigate between pages, retrieve webpage titles, and close the browser using Selenium WebDriver.

---

## Session 2 – Selenium Locators

### Overview

In this session, I practised identifying web elements on a webpage and performing basic browser interactions using Selenium.

### Concepts Covered

- Setting up ChromeDriver using WebDriverManager
- Initializing Selenium WebDriver
- Using the `By` class to locate web elements
- Working with Selenium locators
- Using JavaScriptExecutor
- Using `Thread.sleep()` to add execution delays
- Performing browser interactions

### Learning Outcome

Understood how Selenium identifies webpage elements using locators and how to perform basic interactions with those elements.

---

## Session 3 – Cross Browser Automation

### Overview

In this session, I learned how to launch and automate different browsers using Selenium WebDriver. I practised opening the same website in Chrome, Edge, and Firefox.

### Concepts Covered

- Working with ChromeDriver
- Working with EdgeDriver
- Working with FirefoxDriver
- Launching multiple browsers
- Using static WebDriver variables
- Creating and using methods in Java
- Using `ArrayList` to store multiple WebDriver instances
- Using `List<WebDriver>` to manage browser instances
- Maximizing browser windows using `manage().window().maximize()`
- Using `Thread.sleep()` to add delays
- Closing all opened browsers using a `for-each` loop and `quit()`
- Clearing the browser list using `clear()`

### Website Practised

- https://maya.adityauniversity.in/

### Learning Outcome

Learned how to perform cross-browser automation by launching Chrome, Edge, and Firefox, managing multiple browser instances, and closing all browsers after execution.

---

## Session 4 – CSS Selectors

### Overview

In this session, I learned how to identify webpage elements using CSS Selectors in Selenium WebDriver.

### Concepts Covered

- Introduction to CSS Selectors
- CSS Selector using ID (`#`)
- CSS Selector using Class (`.`)
- CSS Selector using Tag Name
- Using `By.cssSelector()`
- Finding and interacting with web elements
- Entering values into input fields using `sendKeys()`

### Website Practised

- https://www.saucedemo.com/

### Learning Outcome

Learned how to locate webpage elements using different CSS Selector techniques and interact with input fields using Selenium.

---

## Session 5 – CSS Attribute Selectors

### Overview

In this session, I learned how to locate web elements using CSS Attribute Selectors. I practised identifying elements based on their HTML attributes and attribute values.

### Concepts Covered

- Introduction to CSS Attribute Selectors
- Selecting elements using exact attribute values (`=`)
- Selecting elements using starts with (`^=`)
- Selecting elements using ends with (`$=`)
- Selecting elements using contains (`*=`)
- Using attribute selectors with `By.cssSelector()`

### Learning Outcome

Understood how to locate webpage elements based on their attributes and values using different CSS Attribute Selector techniques.

---

## My Learning Journey

Through these practice sessions, I am building my knowledge of Java and Selenium WebDriver step by step. I am focusing on understanding the concepts and implementing them through hands-on practice.

I will keep updating this repository with my upcoming Selenium sessions, programs, and learning progress.

---

## Session 6 – XPath Locators

### Overview

In this session, I learned how to identify webpage elements using XPath in Selenium WebDriver. I practised different XPath expressions to locate input fields and buttons on a webpage.

### Concepts Covered

- Introduction to XPath
- Absolute XPath
- Relative XPath
- XPath using ID
- XPath using Name
- XPath using Class
- XPath using Text
- XPath using `contains()`
- XPath using `starts-with()`
- Using `By.xpath()` to locate web elements
- Performing browser interactions using XPath

### Website Practised

- https://www.saucedemo.com/

### Learning Outcome

Learned how to identify and interact with webpage elements using different XPath expressions. Also understood the difference between absolute and relative XPath and how to use attributes and text to locate elements.
