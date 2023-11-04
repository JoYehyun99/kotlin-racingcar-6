package utils

import camp.nextstep.edu.missionutils.Randoms
import utils.Constants.RANDOM_RANGE_MAX_NUM
import utils.Constants.RANDOM_RANGE_MIN_NUM

object RandomNumGenerator {
    fun getRandomNum(): Int {
        return Randoms.pickNumberInRange(RANDOM_RANGE_MIN_NUM, RANDOM_RANGE_MAX_NUM)
    }
}