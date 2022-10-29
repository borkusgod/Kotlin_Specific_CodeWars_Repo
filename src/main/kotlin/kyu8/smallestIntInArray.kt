package kyu8

fun main() {
	val arrayTest = listOf(1, 2, 3, 4, 5, 6, 7, 8)
	val arrayTest2 = listOf(1, 2, 3, 4, 5, -6, 7, 8)
	val arrayTest3 = listOf(15, 20, 10, 17, 22, 9001)
	println(findSmallestInt(arrayTest))
	println(findSmallestInt(arrayTest2))
	println(findSmallestInt(arrayTest3))
}

fun findSmallestInt(nums: List<Int>): Int {
//	val arrayTest = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
//	val arr2list = arrayTest.toList()
	val listMin: Int = nums.min()
	return listMin
}
// the above works but doesn't work on the site. One accpeted solutions:
/*
class SmallestIntegerFinder {

  fun findSmallestInt(nums: List<Int>): Int {
        return nums.sorted().get(0)
  }

}
 */