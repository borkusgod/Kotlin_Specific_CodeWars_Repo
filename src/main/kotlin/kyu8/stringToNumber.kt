package kyu8

fun main() {
	println(stringToNumber("1234"))
	println(stringToNumber("605"))
	println(stringToNumber("1405"))
	println(stringToNumber("-7"))

}

fun stringToNumber(str: String): Int {
	return str.toInt()
}