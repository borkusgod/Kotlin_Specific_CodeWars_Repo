package kyu8

fun main() {
	println(removeChar("eloquent"))
	println(removeChar("country"))
	println(removeChar("person"))
	println(removeChar("place"))

}

fun removeChar(str: String): String {
	val char = ""
	val firstOff = str.drop(1)
	val lastOff = firstOff.dropLast(1)
	return lastOff
}
