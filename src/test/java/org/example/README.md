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

### Session 7 – WebElement Methods

In this session, I practised some useful WebElement methods in Selenium WebDriver to get information about webpage elements.

**Topics Covered:**
- `getAttribute()` – To get the value of an element's attribute.
- `getText()` – To get the visible text of an element.
- `getTagName()` – To get the HTML tag name of an element.
- Using the `WebElement` interface
- Finding elements using `By.id()` and `By.className()`
- Printing element details using `System.out.println()`

**Website Used:** https://www.saucedemo.com/

**Learning Outcome:** Learned how to retrieve and verify element attributes, visible text and HTML tag names using Selenium WebDriver.

### Session 8 – Dropdown Handling and Screenshots

In this session, I practised handling dropdown menus and capturing screenshots using Selenium WebDriver.

**Topics Covered:**
- `Select` class for handling dropdowns
- `selectByVisibleText()` method
- Locating dropdown elements using `By.id()`
- `TakesScreenshot` interface
- `getScreenshotAs()` method
- `OutputType.FILE`
- Saving screenshots using `FileUtils.copyFile()`
- Handling `IOException`

**Website Used:** https://the-internet.herokuapp.com/dropdown

**Learning Outcome:** Learned how to select options from dropdown menus and capture and save screenshots of web pages using Selenium.

---

### Session 9 – Waits in Selenium WebDriver

In this session, I practised different types of waits in Selenium WebDriver to handle synchronization between browser actions and webpage loading.

**Topics Covered:**
- Implicit Wait using `implicitlyWait()`
- Explicit Wait using `WebDriverWait`
- `ExpectedConditions.elementToBeClickable()`
- Fluent Wait using `FluentWait`
- `pollingEvery()` method
- `ignoring()` method
- Handling dynamic web elements
- Waiting for elements before performing actions

**Website Used:** https://the-internet.herokuapp.com/login

**Learning Outcome:** Learned the differences between implicit, explicit and fluent waits and how to use them to handle elements that may take time to become available on a webpage.

---

## Session 10 – Frames, Alerts and Windows

### Topics Covered

**1. Frames**
- Learned how to handle frames and nested frames.
- Practiced switching between frames using ID, name and WebElement.
- Used `parentFrame()` and `defaultContent()` to navigate between frame levels.
- Retrieved text from nested frames.

**2. Alerts**
- Learned the three types of JavaScript alerts: Simple, Confirmation and Prompt.
- Used `switchTo().alert()` to handle alerts.
- Practiced `getText()`, `accept()`, `dismiss()` and `sendKeys()`.
- Used Explicit Wait with `alertIsPresent()`.

**3. Windows**
- Learned how to handle multiple browser windows and tabs.
- Used `getWindowHandle()` and `getWindowHandles()`.
- Practiced switching between parent and child windows.
- Used `close()` and `quit()` to close browser windows.

### Practical Implementation
- Combined Frames, Alerts and Windows handling in one Selenium Java program.
- Practiced browser context switching and element interaction using Selenium WebDriver.
