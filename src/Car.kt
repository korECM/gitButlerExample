class Car private constructor(val model: String) {
    companion object {
        fun create(name: String): Car {
            return Car(name)
        }
    }
}