fun filterNames(list: List<String>, isTrue: (String) -> Boolean): List<String> {
    return list.filter(isTrue)
}

fun customFilter(numbers: List<Int>, filter: (Int) -> Boolean): List<Int> {
    return numbers.filter(filter)
}

fun processNumbers(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 != 0 }.map { it * it }
}

fun processNumbersMod(numbers: List<Int>, filters: (Int) -> Boolean, transforms: (Int) -> Int): List<Int> {
    return numbers.filter(filters).map(transforms)
}

fun main() {
    val integers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val integersDoubled = integers.map { it * 2 }
    println(integersDoubled)
    val listOfNames = listOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")
    println(filterNames(listOfNames, {it.first() == 'A'}))
    val listOfWords = listOf("apple", "banana", "kiwi", "strawberry", "grape")
    val descendingOrder = listOfWords.sortedByDescending { it.length }
    println(descendingOrder)
    println(customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it > 5 })
    println(customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it % 2 == 0 })
    println(customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it % 3 == 0 })
    println(processNumbers(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
    println(processNumbersMod(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), filters = { it % 2 != 0 }, transforms = { it * it }))
}