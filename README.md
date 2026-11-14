\# Java Calculator – DevOps Project



A simple Java calculator project developed as part of a hands-on DevOps learning exercise.



\## Features



\- Addition

\- Subtraction

\- Multiplication

\- Division

\- Division-by-zero validation

\- Unit testing with JUnit 5



\## Technologies Used



| Technology | Purpose |

|---|---|

| Java 21 | Programming language |

| Maven 3.9.16 | Build and dependency management |

| JUnit 5 | Unit testing |

| Git | Version control |

| Jenkins | Continuous integration |

| Docker | SonarQube deployment |

| SonarQube Community Build | Code quality analysis |



\## Project Structure



```text

simple-calculator/

├── src/

│   ├── main/java/com/arshu/calculator/

│   │   └── Calculator.java

│   └── test/java/com/arshu/calculator/

│       └── CalculatorTest.java

├── .gitignore

└── pom.xml

```



\## Requirements



\- JDK 21

\- Apache Maven 3.9.16 or compatible version



\## Build and Test



Run the following commands from the project directory.



Run unit tests:



```bash

mvn clean test

```



Build the project:



```bash

mvn clean package

```



\## DevOps Workflow



1\. Manage source code using Git.

2\. Build and test the project using Maven.

3\. Use Jenkins to automate the build process.

4\. Analyse source code using SonarQube.

5\. Inspect and correct code quality issues.

6\. Apply a custom SonarQube Quality Profile.

7\. Evaluate the project using a custom Quality Gate.

8\. Publish the source code to GitHub.



\## SonarQube Configuration



\- Project: Simple Calculator

\- Quality Profile: Arshu Java Custom

\- Quality Gate: Arshu Quality Gate



\## Repository



\[GitHub – Java Calculator DevOps](https://github.com/Arshuz/Java-calculator-Devops)

