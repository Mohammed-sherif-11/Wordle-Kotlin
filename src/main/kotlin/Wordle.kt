import java.io.File

// 1. Check if a word is valid for Wordle
fun isValid(word: String): Boolean {
    // Word must be exactly 5 characters
    if (word.length != 5) {
        return false
    }

    // Make sure every character is a letter
    for (ch in word) {
        if (!ch.isLetter()) {
            return false
        }
    }

    return true
}

// 2. Read all the words from a file into a list
fun readWordList(filename: String): MutableList<String> {
    val words = mutableListOf<String>()

    // Read the file line by line
    File(filename).forEachLine { line ->
        val word = line.trim()
        if (word.isNotEmpty()) {
            words.add(word.lowercase())
        }
    }

    return words
}

// 3. Pick a random word from the list and remove it
fun pickRandomWord(words: MutableList<String>): String {
    val index = (0 until words.size).random()
    return words.removeAt(index)
}

// 4. Ask the user for a guess
fun obtainGuess(attempt: Int): String {
    while (true) {
        println("Attempt $attempt - Enter a 5-letter word:")
        val input = readLine() ?: ""
        val guess = input.trim().lowercase()

        if (isValid(guess)) {
            return guess
        } else {
            println("That is not a valid 5-letter word. Please try again.")
        }
    }
}

// 5. Compare guess with target
//    0 = letter here is wrong
//    1 = letter here is correct
fun evaluateGuess(guess: String, target: String): List<Int> {
    val result = mutableListOf<Int>()

    for (i in 0 until 5) {
        if (guess[i] == target[i]) {
            result.add(1)
        } else {
            result.add(0)
        }
    }

    return result
}

// 6. Display the guess using matches list

fun displayGuess(guess: String, matches: List<Int>) {
    for (i in 0 until 5) {
        if (matches[i] == 1) {
            print(guess[i])
        } else {
            print('?')
        }
    }
    println()
}

