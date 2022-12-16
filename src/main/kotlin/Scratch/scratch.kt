package Scratch

fun main() {
	var i = 1
//
//	while (i <= 5) {
//		println("Line $i")
//		++i
//	}
	do {
		println("Line $i")
		i++
	} while (i < 6)
	val intMutableList = mutableListOf(1, 2, 3)

	intMutableList[1] = 4
	println(intMutableList)

	intMutableList.add(1, 6)
	println(intMutableList)

	intMutableList.removeAt(intMutableList.size -1)
	println(intMutableList)

	intMutableList.removeLast()
	println(intMutableList)

	val intMutList2 = mutableListOf<Int>(1, 2, 3, 4, 5)
	println(intMutList2)

	intMutList2.removeAt(2)
	println(intMutList2)

	val emailListTest = mutableListOf(
			"lightraven.bourque@gmail.com",
			"rhonda_bourque@outlook.com",
			"vintage_scorpio@gmail.com"
			)

	val emailTester = mutableListOf(
		"lightraven.bourque@gmail.com",
		"lightraven@yahoo.com"
	)

	println(emailListTest)
	for (each in emailListTest) {
		println(each)
	}


	if ("lightraven.bourque@gmail.com" in emailListTest) {
		println("Email is verified in database")
	}

	val numList1 = listOf<Int>(1, 2, 3, 4, 5)
	val numList2 = listOf<Int>(6, 7, 8, 9, 10)
	val numList3 = listOf<Int>(2, 4, 6)

	val ifCheck = numList3.any { it in numList1 }
	println(ifCheck)

	val nlCopy = numList1.toMutableList()
	println(nlCopy)
	// numList1[2] = 8 will give you a compile error
	nlCopy[2] = 8
	println(nlCopy)
	nlCopy.add(9)
	println(nlCopy)
	nlCopy.add(0, 44)
	println(nlCopy)

	println("Please enter something to output to screen: ")
	val fromUser = readln()
	println(fromUser)

	val nm1: Double = 100.0
	val nm2: Double = 101.0

	println(nm1 % 2)


}




