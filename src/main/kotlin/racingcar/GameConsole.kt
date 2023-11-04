package racingcar

import utils.Constants.WINNER_RESULT_TITLE
import utils.Constants.ROUND_RESULT_MSG

class GameConsole {

    fun printRoundResultTitle() {
        println()
        println(ROUND_RESULT_MSG)
    }

    fun printRoundResult(cars: List<Car>) {
        cars.forEach { car -> println(car) }
        println()
    }

    fun printWinner(winners: List<Car>) {
        print(WINNER_RESULT_TITLE)
        print(winners.joinToString(", ") { it.name })
    }
}