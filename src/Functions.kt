//fun main() {
//    fun functionName(parameters): ReturnType {
//        // Function body
//        return value // Optional if the return type is Unit
//    }


//    fun greet(name: String = "Guest") {
//        println("Hello, $name!")
//    }
//
//        greet()          // Output: Hello, Guest!
//        greet("Vinod")   // Output: Hello, Vinod!

//    printMessage("Kotlin is awesome!") // Output: Kotlin is awesome!

//    Single-Expression Functions *****
//fun square(number: Int): Int = number * number
//    println(square(5)) // Output: 25

//    Inline Functions -> Small functions can be declared inline for better performance in some scenarios.
// inline fun multiply(a: Int, b: Int): Int = a * b
//    println(multiply(3, 4)) // Output: 12

//    Extension Functions -> Kotlin allows adding new functions to existing classes without modifying their source code.
//    fun String.firstChar(): Char = this[0]
//    println("Kotlin".firstChar()) // Output: K


//    Higher-Order Functions -> Functions that take other functions as parameters or return functions.
//    fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
//         return operation(a, b)
//    }
//    val result = calculate(5, 3) { x, y -> x + y }
//    println(result) // Output: 8


//    Lambda Expressions -> Anonymous functions that can be passed as arguments or assigned to variables.
//    val greet: (String) -> String = { name -> "Hello, $name!" }
//    println(greet("Vinod")) // Output: Hello, Vinod!

//    Functions: Reusable blocks of code with optional parameters and return values.
//    Default Arguments: Provide fallback values for parameters.
//    Named Arguments: Increase readability when calling functions.
//    Extension Functions: Add functionality to existing classes.
//    Higher-Order Functions: Use functions as parameters or return them.
//    Lambdas: Anonymous functions for concise syntax.

//}

fun printMessage(message: String) {
    println(message)
}

fun main() {

}