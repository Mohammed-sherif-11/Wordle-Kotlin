# Portfolio Assignment 1: Wordle

Full instructions for this assignment are provided separately in Minerva.

## Running Gradle

This assignment is managed by the [Gradle][gra] build tool. You can execute
a Gradle task on the Linux or macOS command line by entering `./gradlew`
followed by a space and then the task name.

(On Windows systems whose command line is provided by `cmd.exe`, omit the
`./` from the start of this command; on Windows systems whose command line
is provided by Powershell, use `.\gradlew`)

| Task Name     | Purpose                                               |
|---------------|-------------------------------------------------------|
| `test`        | Runs unit tests                                       |
| `ktlintCheck` | Checks code quality using [ktlint][ktl]               |
| `detekt`      | Checks code quality using [detekt][det]               |
| `check`       | Checks quality using ktlint & detekt *and* runs tests |
| `run`         | Runs main program                                     |
| `distZip`     | Packages application for distribution                 |
| `clean`       | Removes all build artifacts                           |

Note: if you see a 'Permission denied' error when attempting to run Gradle
on a Linux or macOS system, fix the script permissions with

    chmod u+x gradlew

## Using IntelliJ

To do this assignment in IntelliJ on your own PC, use the *Open Project*
button on the Welcome screen to open this directory as an IntelliJ project.

After the project has imported fully, you will be able to interact with
Gradle via IntelliJ's Gradle tool window. After you have run a task for the
first time, it will add a **run configuration** for that task to the drop-down
menu at the top of the window. You can then use that menu and the *Run* button
to run the task.


[gra]: https://gradle.org/
[ktl]: https://pinterest.github.io/ktlint/latest/
[det]: https://detekt.dev/
