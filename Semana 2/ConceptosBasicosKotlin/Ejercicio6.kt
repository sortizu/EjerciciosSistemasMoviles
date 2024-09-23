class Phone(var isScreenLightOn: Boolean = false) {
    fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = false, isScreenLightOn: Boolean = false) : Phone(isScreenLightOn) {

    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    fun fold() {
        isFolded = true
    }

    fun unfold() {
        isFolded = false
    }
}

fun main() {
    val phone = FoldablePhone()

    phone.unfold()
    phone.switchOn()
    phone.checkPhoneScreenLight()

    phone.fold()
    phone.switchOn()
    phone.checkPhoneScreenLight()
}
