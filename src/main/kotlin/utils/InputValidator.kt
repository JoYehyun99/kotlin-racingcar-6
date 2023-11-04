package utils

import utils.Constants.EMPTY_STRING_ERR
import utils.Constants.MAX_CAR_NAME_LENGTH
import utils.Constants.NEGATIVE_NUM_ERR
import utils.Constants.NOT_ENOUGH_CARS
import utils.Constants.NOT_NUMBER_ERR
import utils.Constants.NO_DUPLICATE_NAME_ERR
import utils.Constants.NO_WHITESPACE_ERR
import utils.Constants.STRING_LENGTH_ERR

object InputValidator {

    fun checkCarNames(carNames: List<String>) {
        carNames.forEach { carName ->
            require(carName.isNotBlank()) { EMPTY_STRING_ERR }
            require(carName.length <= MAX_CAR_NAME_LENGTH) { STRING_LENGTH_ERR }
            require(!carName.contains(" ")) { NO_WHITESPACE_ERR }
        }
        val namesCnt = carNames.size
        require(namesCnt > 1) { NOT_ENOUGH_CARS }
        require(namesCnt == carNames.toSet().size) { NO_DUPLICATE_NAME_ERR }
    }

    fun checkRoundCnt(input: String) {
        val num = input.toIntOrNull()
        requireNotNull(num) { NOT_NUMBER_ERR }
        require(num > 0) { NEGATIVE_NUM_ERR }
    }
}