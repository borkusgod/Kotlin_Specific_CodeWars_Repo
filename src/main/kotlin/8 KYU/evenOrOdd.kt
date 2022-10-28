package `8 KYU`

fun main() {
	println(evenOrOdd(2))
	println(evenOrOdd(0))
	println(evenOrOdd(7))
	println(evenOrOdd(1))

}

fun evenOrOdd(number: Int): String {
	return if (number % 2 == 0) {
		"Even"
	} else {
		"Odd"
	}
}

// could also add further logic to return back 0 but the instructions say to return it as "even"