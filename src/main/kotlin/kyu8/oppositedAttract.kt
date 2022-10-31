package kyu8

fun main() {
	println(loveFun(1, 4))
	println(loveFun(0, 1))
}

fun loveFun(flowerA: Int, flowerB: Int): Boolean {
	if ((flowerA % 2 == 0 && flowerB % 2 != 0) ||
		(flowerA % 2 != 0 && flowerB % 2 == 0)
			) {
		return true
	}
	return false
}