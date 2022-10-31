package kyu8

fun main() {
	println(abbrevName("Sam Harris"))
	println(abbrevName("Patrick Feenan"))
	println(abbrevName("Evan Cole"))
	println(abbrevName("P Favuzzi"))
	println(abbrevName("David Mendieta"))

}

// not mine. crafty from solutions
fun abbrevName(name: String): String {
	val v = name.indexOf(" ")
	return "${name[0]}.${name[v + 1]}".toUpperCase()
}