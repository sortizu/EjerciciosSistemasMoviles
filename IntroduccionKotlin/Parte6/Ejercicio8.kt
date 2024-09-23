fun main () {
    val steps = 4000
    val caloriesBurned = podometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun podometerStepsToCalories(numberOfSteps: Int) : Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}