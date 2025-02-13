fun filterNames(list: List<String>, isTrue: (String) -> Boolean): List<String> {
    return list.filter(isTrue)
}

fun main() {
    val integers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val integersDoubled = integers.map { it * 2 }
    println(integersDoubled)
    val listOfNames = listOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")
    println(filterNames(listOfNames, {it.first() == 'A'}))
}