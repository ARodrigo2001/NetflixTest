<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Netflix Automation Testing Project</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            color: #333;
            background-color: #f8f8f8;
            margin: 0;
            padding: 0;
        }
        h1 {
            color: #094fe5;
            text-align: center;
            padding: 20px;
            background-color: #141414;
            margin: 0;
        }
        h2 {
            color: #141414;
            border-bottom: 2px solid #141414;
            padding-bottom: 5px;
        }
        code {
            background-color: #f4f4f4;
            padding: 2px 4px;
            border-radius: 4px;
        }
    </style>
</head>
<body>
    <h1>Netflix Automation Testing Project</h1>

    <div class="section">
        <h2>Project Overview</h2>
        <p>
            This project is designed to perform <span class="highlight">end-to-end automation testing</span> of the Netflix platform using the following tools and technologies:
        </p>
        <ul>
            <li><span class="highlight">Java</span> - Programming Language</li>
            <li><span class="highlight">JUnit</span> - Test Framework</li>
            <li><span class="highlight">Selenium WebDriver</span> - Web Automation Framework</li>
        </ul>
        <p>
            The test suite has been built following the <span class="highlight">Page Object Model (POM)</span>, <span class="highlight">Fluent Pages</span>, and <span class="highlight">Page Factory</span> design patterns to ensure code maintainability, readability, and reusability.
        </p>
    </div>

    <div class="section">
        <h2>Design Patterns</h2>
        <ul>
            <li><span class="highlight">Page Object Model (POM)</span>: This pattern encourages creating a class for each page of the application, encapsulating all the elements and actions related to that page, making the code easy to manage and less prone to changes.</li>
            <li><span class="highlight">Fluent Pages</span>: This approach enables method chaining for better readability and a more fluent syntax when writing tests, allowing for natural language-like statements.</li>
            <li><span class="highlight">Page Factory</span>: A Selenium support library that implements the POM design pattern, simplifying the initialization of web elements and improving code readability.</li>
        </ul>
    </div>

    <div class="section">
        <h2>Project Configuration</h2>
        <p>
            To configure the project, you need to update the <code>config.properties</code> file with a valid Netflix account. The properties file is used to manage environment configurations such as URLs, login credentials, and other settings required for running the tests.
        </p>
        <p class="important">⚠️ Make sure to use a valid Netflix account in the configuration to ensure successful test execution.</p>
    </div>

    <div class="section">
        <h2>How to Run the Tests</h2>
        <ol>
            <li>Clone the repository to your local machine.</li>
            <li>Open the project in your preferred IDE (e.g., Eclipse, IntelliJ).</li>
            <li>Update the <code>config.properties</code> file with valid credentials.</li>
            <li>Run the test suite using <code>JUnit</code> or directly from the IDE.</li>
        </ol>
        <p>
            All tests are organized under the <code>src/test/java</code> directory, following a structured package hierarchy.
        </p>
    </div>
</body>
</html>