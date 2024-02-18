class Person private constructor(val name: String) {
    companion object {
        fun born(): Person {
            return Person("Mark")
        }
    }
}