# E-Commerce Automation Testing (SCTP)

## Overview

This project automates key user flows for an e-commerce web application using:
- **Selenium WebDriver** for browser automation  
- **Cucumber (BDD)** for feature-driven testing  
- **TestNG** for test orchestration  
- **Maven** for build and dependency management  
- **GitHub Actions** for CI/CD integration  

### Automated Scenarios
1. **User Registration**  
2. **User Login**  
3. **Add Product to Cart**

Each scenario is implemented using the Page Object Model (POM) structure for maintainability and reusability.



##  Setup Instructions

### 1 Prerequisites
- **Java 21** (or compatible JDK)
- **Maven 3.8+**
- **Git**
- **Google Chrome** browser

Verify installations:
```bash
java -version
mvn -version
```

---

### 2 Clone the Repository

```bash
git clone https://github.com/<your-username>/SCTP.git
cd SCTP
```

---

### 3 Install Dependencies

Maven will automatically download dependencies:
```bash
mvn clean compile
```

---

### 4 Run Tests Locally

Execute all tests:
```bash
mvn clean test -Dheadless=false
```

> 💡 Use `-Dheadless=true` to run tests without opening the browser (useful for CI environments).

---

### 5 View the HTML Report

After execution, an HTML report is generated at:

```
target/cucumber-reports.html
```

Open it in a browser to view detailed test results:
```bash
open target/cucumber-reports.html    # macOS
```
or  
```bash
start target/cucumber-reports.html   # Windows
```

---

##  CI/CD with GitHub Actions

This project includes a **GitHub Actions workflow** (`.github/workflows/ci.yml`) that:
1. Builds the project with Maven  
2. Runs Selenium tests in **headless Chrome**  
3. Generates the **Cucumber HTML report**  
4. Uploads the report as a downloadable artifact in the Actions tab  

To trigger CI:
- Push to the `main` branch  
- Or open a pull request targeting `main`

You can download the generated report from:  
➡️ **GitHub → Actions → Your Workflow Run → Artifacts → `cucumber-html-report`**

---

## Key Technologies

| Tool | Purpose |
|------|----------|
| **Selenium WebDriver** | Browser automation |
| **Cucumber (BDD)** | Feature-driven test design |
| **TestNG** | Test runner integration |
| **Maven** | Build management |
| **GitHub Actions** | Continuous Integration pipeline |
| **WebDriverManager** | Automatic driver setup |

---

##  Design Pattern: Page Object Model (POM)

Each page of the application is represented by a separate Java class (e.g., `LoginPage`, `SignUp`, `CatalogPage`), encapsulating:
- Locators for elements  
- Methods for actions and assertions  

This design improves code reusability, readability, and maintenance.

---


