# Wordle – Kotlin

A text-based Wordle-style game developed in Kotlin as part of my university programming coursework.

The project applies object-oriented programming, structured game logic, input validation, automated testing and code-quality tools to create a playable command-line word game.

## Features

* Accepts and validates player guesses
* Compares each guess against the target word
* Identifies correct, present and absent letters
* Loads valid words from a text file
* Organises the game using modular Kotlin classes
* Handles invalid user input
* Includes automated unit tests
* Uses automated formatting and static-analysis checks

## Technologies

* **Kotlin** – application development
* **Gradle** – build automation and dependency management
* **Kotest** – automated testing
* **ktlint** – Kotlin formatting and style checks
* **detekt** – static code analysis

## Project Structure

```text
Wordle-Kotlin/
├── data/
│   └── words.txt
├── src/
│   ├── main/kotlin/
│   │   ├── Main.kt
│   │   └── Wordle.kt
│   └── test/
│       ├── kotlin/
│       │   ├── KotestProjectConfig.kt
│       │   └── WordleTest.kt
│       └── resources/
├── build.gradle.kts
├── settings.gradle.kts
├── gradlew
└── gradlew.bat
```

## Running the Application

Clone the repository:

```bash
git clone https://github.com/Mohammed-sherif-11/Wordle-Kotlin.git
```

Move into the project directory:

```bash
cd Wordle-Kotlin
```

Run the application on macOS or Linux:

```bash
./gradlew run
```

On Windows Command Prompt:

```bat
gradlew run
```

On Windows PowerShell:

```powershell
.\gradlew run
```

## Testing

Run the automated tests on macOS or Linux:

```bash
./gradlew test
```

On Windows PowerShell:

```powershell
.\gradlew test
```

## Code-Quality Checks

Run the ktlint style checks:

```bash
./gradlew ktlintCheck
```

Run detekt static analysis:

```bash
./gradlew detekt
```

Run all tests and code-quality checks together:

```bash
./gradlew check
```

## What I Learned

Through this project, I developed practical experience with:

* Object-oriented programming in Kotlin
* Separating application logic into maintainable components
* Validating and processing user input
* Reading application data from files
* Writing automated tests
* Using Gradle for building and running applications
* Applying automated formatting and static-analysis tools
