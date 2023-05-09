<p align="center">
  <img alt="Selenium" src="https://www.perfecto.io/sites/default/files/image/2020-10/social-blog-selenium-vs-cucumber.jpg">
</p>

[![Java Version](https://img.shields.io/badge/java-11-blue)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) [![Gradle Version](https://img.shields.io/badge/gradle-8.1.1-green)](https://gradle.org/releases/) [![Selenium Version](https://img.shields.io/badge/selenium-3.141.59-brightgreen)](https://selenium.dev/documentation/en/) [![Cucumber Version](https://img.shields.io/badge/cucumber-4.2.0-yellowgreen)](https://cucumber.io/docs/cucumber/) [![License: ISC](https://img.shields.io/badge/License-ISC-blue.svg)](https://opensource.org/licenses/ISC)

## What is selenium-java-course ? ☕ + 🥒

<b>selenium-java-course</b> is a project that contains tests made with the Selenium Java and Cucumber

## Building and installation 🔧

To build and install this project, follow these steps:

1. First you need to install Java 11 JDK

https://www.oracle.com/es/java/technologies/javase/jdk11-archive-downloads.html

2. Download Gradle and extract the content in C: 

https://gradle.org/install/

3. Add C:\gradle\bin to PATH variable

4. Download chromedriver and extract it in a directory:

https://chromedriver.chromium.org/downloads

5. Finally if you want to execute the tests you can do it using your IDE o manually with this example command:

```sh
gradle test -Dcucumber.options="--tags @TradMe"
```

You can change the tag in the command or in the Runner.java file

## Additional Information 💡

To clean and build the project, you can run these commands, but you don't have to.

```sh
gradle clean 
```

```sh
gradle build 
```

## Contribution 🤝

 If you want to contribute to this project, follow these steps:

1. Make a fork of this repository.

2. Create a branch for your changes.

3. Make the necessary changes.

4. Submit a pull request.

## License 📝 

This project is distributed under the ISC license.

## Status 🚀 

This project is currently finished, but new tests can be added at any time. If you find any errors or problems, please open an issue so it can be fixed.
