package `8 KYU`

fun main() {
	println(returnNegative(1))
	println(returnNegative(-5))
	println(returnNegative(0))
}

fun returnNegative(fromFunc: Int): Int {
	return if (fromFunc < 0) {
		fromFunc
	} else if (fromFunc == 0) {
		fromFunc
	} else {
		fromFunc * -1
	}
}