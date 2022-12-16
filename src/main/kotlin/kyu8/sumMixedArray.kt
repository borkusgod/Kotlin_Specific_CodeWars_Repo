package kyu8

fun main() {
	val mixedArray1 = mutableListOf<Any>(1, 2, 3, "4", 5, "6")
	val mixedArray2 = mutableListOf<Any>(5, "5")
	println(sumGivenArray(mixedArray1))
	println(sumGivenArray(mixedArray2))
}

fun sumGivenArray(mixed: List<Any>): Int {
	var evalContainer = mutableListOf<Int>()
	//val mixedArray1 = mutableListOf<Any>(1, 2, 3, '4', 5, '6')
	for (each in mixed) {
		if (each is Int) {
			//println("Number detected")
			evalContainer +=  each
		} else if (each is String) {
			//println("Char detected")
			val convEach: Int = each.toInt()
			evalContainer += convEach

		}
	}
//	for (each in evalContainer) {
//		println(each)
//	}
	return evalContainer.sum()
}