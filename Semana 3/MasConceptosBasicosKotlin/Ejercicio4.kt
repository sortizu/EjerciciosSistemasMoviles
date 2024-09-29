enum class segmentacion {
    MORNING, AFTERNOON, EVENING
}

data class Event (
    val titulo: String,
    val descripcion: String? = null,
    val segmentacion: segmentacion,
    val duracion: Int = 0
)

fun main() {
    val event1 = Event(titulo = "Wake up", descripcion = "Time to get up", segmentacion = segmentacion.MORNING, duracion = 0)
    val event2 = Event(titulo = "Eat breakfast", segmentacion = segmentacion.MORNING, duracion = 15)
    val event3 = Event(titulo = "Learn about Kotlin", segmentacion = segmentacion.AFTERNOON, duracion = 30)
    val event4 = Event(titulo = "Practice Compose", segmentacion = segmentacion.AFTERNOON, duracion = 60)
    val event5 = Event(titulo = "Watch latest DevBytes video", segmentacion = segmentacion.AFTERNOON, duracion = 10)
    val event6 = Event(titulo = "Check out latest Android Jetpack library", segmentacion = segmentacion.EVENING, duracion = 45)
    val listOfEvents = mutableListOf<Event>(event1,event2,event3,event4,event5,event6)
    // Filtrar por eventos cortos
    val eventosCortos = listOfEvents.filter{
        it.duracion<60
    }
    println("Eventos cortos (<60): ${eventosCortos.size} eventos")
    eventosCortos.forEach{
        println(it)
    }
}
