
# Netflix Automation Testing Project

## Project Overview

Hi, there. I have developed this quick test suite to practice some Web testing knowledge I've acquired.

This project performs **end-to-end automation testing** of the Netflix platform using the following tools and technologies:

- **Java** - Programming Language
- **JUnit** - Test Framework
- **Selenium WebDriver** - Web Automation Framework

The test suite has been built following the **Page Object Model (POM)**, **Fluent Pages**, and **Page Factory** design patterns to ensure code maintainability, readability, and reusability.

## Design Patterns

- **Page Object Model (POM)**: This pattern consists in creating a class for each page of the application, encapsulating all the elements and actions related to that page, making the code easy to manage and read.
- **Fluent Pages**: This approach enables method chaining for better readability and a more fluent syntax when writing tests, allowing for natural language-like statements.
- **Page Factory**: A library that simplifies the mapping and initialization of web elements present on an specific page.

## Project Configuration

To configure the project, you need to update the `config.properties` file with a valid Netflix account.
Make sure to use a valid Netflix account in the configuration to ensure successful test execution.

## How to Run the Tests

1. Clone the repository to your local machine.
2. Open the project in your preferred IDE (e.g., Eclipse, IntelliJ).
3. Update the `config.properties` file with valid credentials.
4. Run the test suite using `JUnit` or directly from the IDE.