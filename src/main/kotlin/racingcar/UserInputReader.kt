package racingcar

import camp.nextstep.edu.missionutils.Console
import utils.InputValidator.checkCarName
import utils.InputValidator.checkRoundCnt

class UserInputReader {

    fun getCarName(): List<String> {
        println(CAR_NAME_INPUT_MSG)
        val input = Console.readLine()
        return setCarNames(input)
    }

    fun setCarNames(input: String): List<String> {
        val result = input.split(",")
        checkCarName(result)
        return result
    }

    fun getRoundCount(): Int {
        println(ROUND_INPUT_MSG)
        val input = Console.readLine()
        checkRoundCnt(input)
        return input.toInt()
    }

    companion object {
        const val CAR_NAME_INPUT_MSG = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"
        const val ROUND_INPUT_MSG = "시도할 횟수는 몇 회인가요?"
    }
}