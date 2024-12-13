fun main() {
    val person = Person("Bob", 30)
    person.displayInfo() // Outputs: Name: Bob, Age: 30
}

class Person(val name: String, var age: Int) {
    fun displayInfo() {
        println("Name: $name, Age: $age")
    }
}
