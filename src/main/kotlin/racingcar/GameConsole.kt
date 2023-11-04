package racingcar

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

    companion object {
        const val ROUND_RESULT_MSG = "실행 결과"
        const val WINNER_RESULT_TITLE = "최종 우승자 : "
    }
}