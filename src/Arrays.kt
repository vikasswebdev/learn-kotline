fun main() {
    val fruits = arrayOf("Apple", "Banana", "Cherry")
    fruits.forEachIndexed { index, fruit ->
        println("Fruit at index $index is $fruit")
    }

    val doubled = IntArray(5) { it * 2 }
    println(doubled.joinToString()) // Outputs: 0, 2, 4, 6, 8
}
