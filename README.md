
# ✅ Selenium Automation Framework | Java + TestNG + Extent Reports (POM + PageFactory)

This repository contains an end-to-end **Selenium Automation Hybrid Testing Framework** developed using **Java**, **TestNG**, and **Extent Reports**, following **Page Object Model (POM)** architecture with **PageFactory Design Pattern**.

📌 The automation suite is implemented for **The Internet (Herokuapp)**  website:  
🔗 https://the-internet.herokuapp.com/

---

## 📌 Tech Stack & Tools Used

- **Language:** Java
- **Automation Tool:** Selenium WebDriver
- **Test Framework:** TestNG
- **Design Pattern:** Page Object Model (POM)
- **Page Initialization:** PageFactory
- **Reporting:** Extent Reports
- **Build Tool:** Maven
- **IDE:** IntelliJ IDEA / Eclipse

---

## ✅ Key Features of Framework

✅ Page Object Model (POM) structure for clean maintainable code  
✅ PageFactory for element initialization and better readability  
✅ TestNG annotations + assertions  
✅ Extent Report generation with test status (Pass/Fail/Skip)   
✅ Reusable utility methods  
✅ Scalable project structure for adding more modules  
✅ Suitable for real company project-level automation

---

## 📂 Project Structure

```

📦 selenium-testng-extent-pom
┣ 📂 src/test/java
┃ ┣ 📂 base
┃ ┃ ┗ 📄 BaseTest.java
┃ ┣ 📂 pages
┃ ┃ ┣ 📄 LoginPage.java
┃ ┃ ┣ 📄 HomePage.java
┃ ┃ ┗ 📄 (Other Pages...)
┃ ┣ 📂 tests
┃ ┃ ┣ 📄 LoginTest.java
┃ ┃ ┗ 📄 (Other Tests...)
┃ ┣ 📂 utilities
┃ ┃ ┣ 📄 WaitUtils.java
┃ ┃ ┣ 📄 ScreenshotUtils.java
┃ ┃ ┗ 📄 ExtentReportManager.java
┗ 📄 pom.xml

````

## 🧪 Automated Test Scenarios

This automation framework covers test cases for **The Internet Herokuapp Website**, such as:

- ✅ Login Functionality (valid/invalid credentials)
- ✅ Dropdown
- ✅ Checkboxes
- ✅ JavaScript Alerts
- ✅ Frames / iFrames
- ✅ File Upload
- ✅ Dynamic Loading
- ✅ Basic Auth 
- ✅ Other modules as per implementation

---

## ⚙️ Prerequisites

Make sure you have installed:

- ✅ Java (JDK 8 or above)
- ✅ Maven
- ✅ Chrome Browser
- ✅ ChromeDriver (or WebDriverManager setup)

---

## 🚀 How to Run the Project

### ✅ 1) Clone Repository
```bash
git clone https://github.com/<your-username>/<repo-name>.git
````

### ✅ 2) Open in IDE

Open project in:

* IntelliJ IDEA / Eclipse

### ✅ 3) Install Maven Dependencies

```bash
mvn clean install
```

### ✅ 4) Run TestNG Suite

Run using:

* `testng.xml` file in IDE
  OR

```bash
mvn test
```

---

## 📊 Extent Report

After execution, Extent Report will be generated.

📌 Location (example):

```
/test-output/ExtentReport.html
```

Open the report in browser to view:
✅ Test Summary
✅ Passed/Failed test cases
✅ Logs
✅ Screenshots (if enabled)

---

## 🧠 Framework Design (Concepts Used)

### ✅ Page Object Model (POM)

* Each web page has its own class
* Tests call page methods (not direct locators)

### ✅ PageFactory

* WebElements initialized using:

```java
PageFactory.initElements(driver, this);
```

---

## 👤 Author

**Abhishek Giri**
Automation Test Engineer | Selenium + Java + TestNG
📌 GitHub: https://github.com/abhishekgiri93/seleniumHybridFramework-TheInternetHerokuapp-.git

---

## ⭐ Support

If you found this project helpful, please ⭐ star this repository!

```
