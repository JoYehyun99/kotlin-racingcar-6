package racingcar

import utils.Constants.FORWARD_STEP
import utils.RandomNumGenerator

class Race(private val cars: List<Car>) {
    fun startRound(): List<Car> {
        cars.forEach { car ->
            if (RandomNumGenerator.getRandomNum() > 3) {
                car.goForward(FORWARD_STEP)
            }
        }
        return cars
    }

    fun findWinner(): List<Car> {
        val maxDistance = cars.maxOfOrNull { it.distance }
        return cars.filter { car ->
            car.distance == maxDistance
        }
    }
}