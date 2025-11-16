# WebApp Automation Project - Swag Labs

This project is an automation testing framework for the [Swag Labs demo app](https://www.saucedemo.com/) using **Selenium WebDriver**, **TestNG**, and **Page Object Model (POM)** pattern in **Java**.  

---

## 🛠 Technologies Used

- Java 21
- Selenium WebDriver 4.x
- TestNG
- Page Object Model (POM)
- Maven
- ChromeDriver (or any WebDriver)
- dotenv-java for configuration management


---

## ⚡ Key Features

- Uses **Page Object Model** for maintainable and reusable code
- **Method chaining** implemented for cleaner test steps
- Validates login scenarios:  
  - Valid login  
  - Invalid login with proper error messages
- Product and logout functionality verification
- Uses **Dotenv** for storing environment variables like URLs and credentials

---


Run tests via TestNG:

Right-click test class → Run

Or using Maven command:

mvn test

⚠️ Notes

Ensure ChromeDriver matches your installed Chrome version.

Keep .env file secure — do not commit credentials to version control.

If you encounter NoSuchElementException, check that the correct page is loaded before locating elements.


