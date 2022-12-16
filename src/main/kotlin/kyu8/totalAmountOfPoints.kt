package kyu8

fun main() {
	val test1 = listOf<String>(
		"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"
	)
	val test2 = listOf<String>(
		"1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4"
	)
	val test3 = listOf<String>(
		"0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4"
	)
	val test4 = listOf<String>(
		"1:0", "2:0", "3:0", "4:0", "2:1", "1:3", "1:4", "2:3", "2:4", "3:4"
	)
	val test5 = listOf<String>(
		"1:0", "2:0", "3:0", "4:4", "2:2", "3:3", "1:4", "2:3", "2:4", "3:4"
	)

//	println(point(test1))
//	println(point(test2))
//	println(point(test3))
//	println(point(test4))
//	println(point(test5))

	// test for funcs
	if (point(test1) == 30) {
		println("Test passed")
	}
	if (point(test2) == 10) {
		println("Test passed")
	}
	if (point(test3) == 0) {
		println("Test passed")
	}
	if (point(test4) == 15) {
		println("Test passed")
	}
	if (point(test5) == 12) {
		println("Test passed")
	}

}

fun point(games: List<String> ): Int {
	var winScore = 0
	for (each in games) {
		val firstChar = each[0]
		val fc2Int: Int = firstChar.toInt()
		val secChar = each.last()
		val sc2Int: Int = secChar.toInt()
		if (fc2Int > sc2Int) {
			winScore += 3
		} else if (fc2Int == sc2Int) {
			winScore += 1
		}
	}
	return winScore
}