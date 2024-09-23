fun main() {
    // Prueba 1
    printWeatherDetails("Ankara", 27, 31, 82)
    // Prueba 2
    printWeatherDetails("Tokyo", 32, 36, 10)
    // Prueba 3
    printWeatherDetails("Cape Town", 59, 64, 2)
    // Prueba 3
    printWeatherDetails("Guatemala City", 50, 55, 7)
}

fun printWeatherDetails(city: String, low_temp: Int, high_temp: Int, rain: Int) {
    println("City: $city")
    println("Low temperature: $low_temp, High temperature: $high_temp")
    println("Chance of rain: $rain%")
    println()
}