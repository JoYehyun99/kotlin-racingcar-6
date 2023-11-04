package utils

import utils.Constants.EMPTY_STRING_ERR_MSG
import utils.Constants.NOT_NUMBER_ERR_MSG
import utils.Constants.STRING_LENGTH_ERR_MSG

object InputValidator {

    fun checkCarName(carNames: List<String>) {
        carNames.forEach { carName ->
            require(carName.isNotEmpty()) { EMPTY_STRING_ERR_MSG }
            require(carName.length < 6) { STRING_LENGTH_ERR_MSG }
        }
    }

    fun checkRoundCnt(input: String) {
        requireNotNull(input.toIntOrNull()) { NOT_NUMBER_ERR_MSG }
    }
}