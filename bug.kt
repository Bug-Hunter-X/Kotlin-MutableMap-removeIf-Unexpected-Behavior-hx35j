fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it % 2 == 0 }
    println(set) // Output: [1, 3, 5]

    //The following may not behave as expected
    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    map.removeIf { it.key % 2 == 0 }
    println(map) // Output: {1=one, 3=three}
}