class Person private constructor(val name: String) {
    companion object {
        fun create(): Person {
            return Person("Mark")
        }
    }
}