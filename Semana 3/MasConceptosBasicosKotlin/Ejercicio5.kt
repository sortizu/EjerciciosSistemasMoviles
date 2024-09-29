enum class Daypart {
    MORNING, AFTERNOON, EVENING
}

data class Event (
    val titulo: String,
    val descripcion: String? = null,
    val segmentacion: Daypart,
    val duracion: Int = 0
)

fun main() {
    val event1 = Event(titulo = "Wake up", descripcion = "Time to get up", segmentacion = Daypart.MORNING, duracion = 0)
    val event2 = Event(titulo = "Eat breakfast", segmentacion = Daypart.MORNING, duracion = 15)
    val event3 = Event(titulo = "Learn about Kotlin", segmentacion = Daypart.AFTERNOON, duracion = 30)
    val event4 = Event(titulo = "Practice Compose", segmentacion = Daypart.AFTERNOON, duracion = 60)
    val event5 = Event(titulo = "Watch latest DevBytes video", segmentacion = Daypart.AFTERNOON, duracion = 10)
    val event6 = Event(titulo = "Check out latest Android Jetpack library", segmentacion = Daypart.EVENING, duracion = 45)
    val listOfEvents = mutableListOf<Event>(event1,event2,event3,event4,event5,event6)
    // Filtrar por eventos cortos
    val eventosXDaypart = listOfEvents.groupBy{
        it.segmentacion
    }
    eventosXDaypart.forEach { (daypart, events) ->
    println("$daypart: ${events.size} events")
}
}
