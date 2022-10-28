package kyu8

fun main() {
	println(litres(5.5))
	println(litres(10.0))
}

fun litres(time: Double): Int {
	val waterNeeded: Double = time * .5
//	println(waterNeeded)
//	println(waterNeeded.toInt())
	return waterNeeded.toInt()
}