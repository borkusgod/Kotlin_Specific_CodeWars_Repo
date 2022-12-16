package kyu8

fun main() {
	val test1 = listOf<Int>(0, 1, 1) // 61000
	val test2 = listOf<Int>(1, 1, 1) // 3661000
	val test3 = listOf<Int>(0, 0, 0) // 0
	val test4 = listOf<Int>(1, 0, 1) // 3601000
	val test5 = listOf<Int>(1, 0, 0) // 3600000
	println(returnMilliSeconds(test1))
	println(returnMilliSeconds(test2))
	println(returnMilliSeconds(test3))
	println(returnMilliSeconds(test4))
	println(returnMilliSeconds(test5))
}

fun returnMilliSeconds(varargs: List<Int> ): Int {
	val hours2ms: Int = varargs[0] * 3600000
	val mins2ms: Int = varargs[1] * 60000
	val secs2ms: Int = varargs[2] * 1000
	return hours2ms + mins2ms + secs2ms
}