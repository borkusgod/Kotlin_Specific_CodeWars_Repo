package kyu8

fun main() {
	val firstSet: Int = 35231
	revArray(firstSet)
}

fun revArray(fromFunc: Int): ArrayList<String> {
	var outputContainer = ""
	val firstSet: Int = 35231
	val secondSet: Int = 0

	val fsToString: String = firstSet.toString()
	for (each in fsToString) {
		outputContainer += each
	}
	println(outputContainer)
	val string2reverse = outputContainer.reversed()
	println(string2reverse)
	val reversedList: ArrayList<String> = ArrayList()
	for (each in string2reverse) {
		reversedList.add(each.toString())
	}
	//val testIntArray = IntArray
	println(reversedList)
	return reversedList
}