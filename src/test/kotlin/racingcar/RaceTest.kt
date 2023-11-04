package racingcar

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RaceTest {

    private val participants = listOf(Car("pobi", 3), Car("woni", 6), Car("jun", 7))
    private val race = Race(participants)

    @Test
    fun When_LessThan4_Expect_Stop() {
        val input = 3
        val participant = participants[0]
        val expected = participant.distance

        race.moveOrStop(input, participant)
        val result = participant.distance
        assertEquals(expected, result)
    }

    @Test
    fun When_GreaterThanOrEqualTo4_Expect_Move() {
        val input = 8
        val participant = participants[0]
        val expected = participant.distance + 1

        race.moveOrStop(input, participant)
        val result = participant.distance
        assertEquals(expected, result)
    }

    @Test
    fun When_DifferentDistances_Cars_Expect_OneWinnerCar() {
        val expected = listOf(Car("jun", 7))
        val result = race.findWinner()
        assertEquals(expected, result)
    }

    @Test
    fun When_SameDistances_Cars_Expect_AllMaxDistanceCars() {
        race.moveOrStop(5, participants[1])
        val expected = listOf(Car("woni", 7), Car("jun", 7))
        val result = race.findWinner()
        assertEquals(expected, result)
    }

}