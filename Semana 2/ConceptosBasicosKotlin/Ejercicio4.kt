class Song(
    val title: String,
    val artist: String,
    val releaseYear: Int,
    val playCount: Int
) {
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, interpretada por $artist, se lanzó en $releaseYear.")
    }
}

fun main() {
    val song = Song("Imagine", "John Lennon", 1971, 1500)
    song.printDescription()
    println("¿Es popular? ${if (song.isPopular) "Sí" else "No"}")
}
