fun main() {
    // Read words from the file in the data folder
    val words = readWordList("data/words.txt")

    if (words.isEmpty()) {
        println("No words found in data/words.txt")
        return
    }

    // Pick a random secret word
    val target = pickRandomWord(words)

    val maxAttempts = 10
    var attempt = 1
    var guessedCorrectly = false

    println("Welcome to simple Wordle!")
    println("You have $maxAttempts attempts to guess the word.\n")

    while (attempt <= maxAttempts && !guessedCorrectly) {
        val guess = obtainGuess(attempt)

        val matches = evaluateGuess(guess, target)

        displayGuess(guess, matches)

        if (guess == target) {
            println("Congratulations! You guessed the word in $attempt attempts.")
            guessedCorrectly = true
        } else {
            attempt++
        }
    }

    if (!guessedCorrectly) {
        println("Sorry, you ran out of attempts. The word was: $target")
    }
}
