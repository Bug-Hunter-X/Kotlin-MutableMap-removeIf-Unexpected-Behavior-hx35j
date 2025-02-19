fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it % 2 == 0 }
    println(set) // Output: [1, 3, 5]

    //Correct usage of removeIf for maps
    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    map.entries.removeIf { it.key % 2 == 0 }
    println(map) // Output: {1=one, 3=three}
    //Alternative approach
    val map2 = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    val keysToRemove = map2.filter { it.key % 2 == 0 }.keys
    keysToRemove.forEach { map2.remove(it) }
    println(map2) // Output: {1=one, 3=three}
}