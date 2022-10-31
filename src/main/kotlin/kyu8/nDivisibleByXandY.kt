package kyu8

fun main() {
	println(isDivisible(3, 3, 4))
	println(isDivisible(12, 3, 4))
}

fun isDivisible(n: Int, x: Int, y: Int): Boolean {
	return n % x == 0 && n % y == 0
}