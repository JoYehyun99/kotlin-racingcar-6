package racingcar

class GameManager {

    private val gameConsole = GameConsole()
    private lateinit var racingGame: Race

    fun runGame() {
        val userInputReader = UserInputReader()
        val cars = initializeCarList(userInputReader.getCarName())
        val roundCnt = userInputReader.getRoundCount()

        racingGame = Race(cars)
        startRace(roundCnt)
        setWinner()
    }

    private fun initializeCarList(carNames: List<String>): List<Car> {
        return carNames.map { carName ->
            Car(carName)
        }.toList()
    }

    private fun startRace(roundCnt: Int) {
        gameConsole.printRoundResultTitle()
        repeat(roundCnt) {
            gameConsole.printRoundResult(racingGame.startRound())
        }
    }

    private fun setWinner() {
        val winners = racingGame.findWinner()
        gameConsole.printWinner(winners)
    }
}