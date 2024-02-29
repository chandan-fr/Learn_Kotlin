fun main() {
    // implicit type
    val strArr: Array<String> = arrayOf("str1", "str2", "str3")

//    getting a particular element
    println(strArr[1])
    println(strArr.get(2))

    // setting a value to the array
    strArr.set(2, "str4")

//    size of the array
    println(strArr.size)

    // out of bound error
//    println(strArr[4])


    // Explicit type
    val intArr = arrayOf<Int>(1, 2, 3)

    for((i, element) in strArr.withIndex()){
//        println("$i - $element")
        println("$i - ${strArr[i]}")
    }

    for(i in intArr){
        println(i)
    }
}