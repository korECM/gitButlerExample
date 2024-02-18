import java.util.*

fun generateRandomString(length: Int): String {
    val leftLimit = 'a'.code
    val rightLimit = 'z'.code
    val random = Random()
    return (1..length)
        .map { random.nextInt(rightLimit - leftLimit + 1) + leftLimit }
        .map { it.toChar() }
        .joinToString("")
}