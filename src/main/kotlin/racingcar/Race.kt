package racingcar

import utils.RandomNumGenerator

class Race(private val cars: List<Car>) {
    fun startRound(): List<Car> {
        cars.forEach { car ->
            if (RandomNumGenerator.getRandomNum() >= FORWARD_THRESHOLD) {
                car.goForward(FORWARD_STEP)
            }
        }
        return cars
    }

    fun findWinner(): List<Car> {
        val maxDistance = cars.maxOf { it.distance }
        return cars.filter { car ->
            car.distance == maxDistance
        }
    }

    companion object {
        const val FORWARD_STEP = 1
        const val FORWARD_THRESHOLD = 4
    }
}