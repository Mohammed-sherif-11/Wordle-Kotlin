import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.collections.shouldNotContain
import io.kotest.matchers.shouldBe

class WordleTest : FunSpec({

    test("isValid returns true for a 5-letter word") {
        isValid("apple") shouldBe true
    }

    test("isValid returns false for words with wrong length") {
        isValid("cat") shouldBe false
        isValid("bananas") shouldBe false
    }

    test("isValid returns false when word has non-letters") {
        isValid("ab1de") shouldBe false
    }

    test("evaluateGuess returns all 1s when guess equals target") {
        val result = evaluateGuess("apple", "apple")
        result shouldBe listOf(1, 1, 1, 1, 1)
    }

    test("evaluateGuess returns 1 only where letters match") {
        val result = evaluateGuess("apple", "angle")
        // a p p l e
        // a n g l e
        // 1 0 0 1 1
        result shouldBe listOf(1, 0, 0, 1, 1)
    }

    test("pickRandomWord returns a word from the list and removes it") {
        val words = mutableListOf("apple", "bread", "candy")
        val chosen = pickRandomWord(words)

        listOf("apple", "bread", "candy").shouldContain(chosen)
        words.size shouldBe 2
        words.shouldNotContain(chosen)
    }

    test("readWordList loads at least one word from file") {
        val words = readWordList("data/words.txt")
        (words.size > 0) shouldBe true
    }
})
