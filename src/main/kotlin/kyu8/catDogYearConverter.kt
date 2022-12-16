package kyu8

fun main() {
	println(calculateYears(1))
	println(calculateYears(8))
	println(calculateYears(11))
	println(calculateYears(8)[1])

	println("The cat's age is ${calculateYears(8)[1]} years old.")
	println("Please enter the age of your animal: ")
	val givenAge = readln()
	val gaConv: Int = givenAge.toInt()
	println("Please enter the type of animal: 1 for cat, 2 for dog")
	val whatType = readln()
	val wtConv:Int = whatType.toInt()
	println(calculateYears2(gaConv, wtConv))
}

fun calculateYears(years: Int): List<Int> =
	when (years) {
		1 -> listOf<Int>(1, 15 , 15)
		2 -> listOf(years, 24 , 24)
		else -> listOf(years, 24 + 4 * (years - 2), 24 + 5 * (years - 2))
	}

fun calculateYears2(years: Int, choice: Int): Int {
	var animalAge: Int = 0
	var animalType: String = ""
	if (choice == 1) {
		animalType = "cat"
		if (years == 1) {
			animalAge = 15
		} else if (years == 2) {
			animalAge = 24
		} else if (years > 2) {
			animalAge = (24 + (4*(years - 2)))
		}
	} else if (choice == 2) {
		animalType = "dog"
		if (years == 1) {
			animalAge = 15
		} else if (years == 2) {
			animalAge = 24
		} else if (years > 2) {
			animalAge = (24 + (5*(years - 2)))
		}
	}
	println("Your $animalType is $animalAge years old")
	return animalAge
}
