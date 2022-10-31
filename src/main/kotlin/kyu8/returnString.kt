package kyu8

fun main() {
	println(greet("Bill"))
}

fun greet(name: String): String {
	val stringBack = "Hello, $name how are you doing today?"
	return stringBack
}