package kyu8

fun main() {
	//println(summation(2))
	println(summation(8))
	println(summation(36))

}

fun summation(n:Int):Int {
	var eachHolder: Int = 1
	var sepHolder = 0
	for (each in 1..n) {
		var eachAdd = eachHolder ++
		sepHolder += eachAdd
	}
	return sepHolder
}
