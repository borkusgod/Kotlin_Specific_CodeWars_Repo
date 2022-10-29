package kyu8

fun main() {
	val array1 = intArrayOf(1, 2, 3, 4, 5)
	val array2 = intArrayOf(1, -2, 3, 4, 5)
	val array3 = intArrayOf()
	val array4 = intArrayOf(-1, -2, -3, -4, -5)
	val array5 = intArrayOf(-1, 2, 3, 4, -5)

	println(sum(array1))
	println(sum(array2))
	println(sum(array3))
	println(sum(array4))
	println(sum(array5))
}

fun sum(numbers: IntArray): Int {
	val arrayContainer = mutableListOf<Int>()
	for (each in numbers) {
		if (each > 0) {
			arrayContainer += each
		}

	}
	println(arrayContainer)
	return arrayContainer.sum()
}