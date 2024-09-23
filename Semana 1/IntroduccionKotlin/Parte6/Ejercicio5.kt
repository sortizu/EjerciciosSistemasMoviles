fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
/*
1. ¿Puedes determinar el resultado de este código antes de ejecutarlo en Kotlin Playground?
    RESULTADO: Congratulations for your bonus! You will receive a total of 5000 + 1000 (additional bonus).
2. Cuando ejecutas el código en Kotlin Playground, ¿se imprime el resultado que esperabas?
    No, se imprime directamente la operacion '5000 + 1000' pero no el resultado. Esto ocurre porque
    la suma se ha declarado como un literal string y no como una operacion.
*/