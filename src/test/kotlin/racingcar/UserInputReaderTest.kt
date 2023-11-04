package racingcar

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class UserInputReaderTest {

    private val processor = UserInputReader()

    @Test
    fun When_CarNamesWithCommaDelimiter_Expect_ValidList() {
        val input = "pobi,woni,jun"
        val expected = listOf("pobi", "woni", "jun")
        val result = processor.setCarNames(input)
        assertEquals(expected, result)
    }
}