enum class Daypart {
    MORNING, AFTERNOON, EVENING
}

data class Event (
    val titulo: String,
    val descripcion: String,
    val segmentacion: Daypart,
    val duracion: Int
)

fun main() {
    val evento1: Event = Event(titulo="Evento 1", descripcion="Descripcion", segmentacion= Daypart.MORNING, duracion=30)
    println(evento1)
}