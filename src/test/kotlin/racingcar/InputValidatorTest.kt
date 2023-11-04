package racingcar

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import utils.InputValidator.checkCarNames
import utils.InputValidator.checkRoundCnt

class InputValidatorTest {

    @Test
    fun When_CarNameLengthLessThanOrEqualTo5_Expect_Valid() {
        val input = listOf("pobi", "woni", "jun")
        assertDoesNotThrow { checkCarNames(input) }
    }

    @Test
    fun When_CarNameLengthExceed5_Expect_Invalid() {
        val input = listOf("yehyun", "woni", "jun")
        assertThrows<IllegalArgumentException> { checkCarNames(input) }
    }

    @Test
    fun When_CarNameIsEmpty_Expect_Invalid() {
        val input = listOf("", "woni", "jun")
        assertThrows<IllegalArgumentException> { checkCarNames(input) }
    }

    @Test
    fun When_OnlyOneCarInput_Expect_Invalid() {
        val input = listOf("pobi")
        assertThrows<IllegalArgumentException> { checkCarNames(input) }
    }

    @Test
    fun When_DuplicateCarNames_Expect_Invalid() {
        val input = listOf("pobi", "pobi")
        assertThrows<IllegalArgumentException> { checkCarNames(input) }
    }

    @Test
    fun When_RoundCountIsInteger_Expect_Valid() {
        val input = "4"
        assertDoesNotThrow { checkRoundCnt(input) }
    }

    @Test
    fun When_RoundCountIsNonInteger_Expect_Invalid() {
        val input = "hello"
        assertThrows<IllegalArgumentException> { checkRoundCnt(input) }
    }

    @Test
    fun When_RoundCountIsNegative_Expect_Invalid() {
        val input = "-10"
        assertThrows<IllegalArgumentException> { checkRoundCnt(input) }
    }

    @Test
    fun When_RoundCountIsZero_Expect_Invalid() {
        val input = "0"
        assertThrows<IllegalArgumentException> { checkRoundCnt(input) }
    }
}