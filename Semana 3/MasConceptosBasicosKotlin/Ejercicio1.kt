data class Event (
    val titulo: String,
    val descripcion: String,
    val segmentacion: String,
    val duracion: Int
)

fun main() {
    val evento1: Event = Event(titulo="Evento 1", descripcion="Descripcion", segmentacion= "Tarde", duracion=30)
    println(evento1)
}