# KOTLIN
## Basic Syntax
<details>
<summary>Data types</summary>
Integer: `int` indicates a whole number.

Float: `float` indicates a number with a decimal point.

Double: `double` indicates a number with a decimal point.

Character: `char` indicates a single character.

Boolean: `boolean` indicates a true or false value.

String: `String` indicates a sequence of characters.

`\n` is used to indicate a new line.
</details>

<details>
<summary>Variables</summary>
Variables are used to store values. They are declared with the `var` keyword.

```kotlin
var variableName: dataType = value
```

```kotlin
var num: Int = 1
```
Declared a variable called `num` with a value of `1`.
Using it in code:

```kotlin
println(num)
```
You can also declare variables with the val keyword. The difference is that the value of a variable can't be changed.

```kotlin
val num: Int = 1
```
If a variable must be changeable than declare it with the var keyword. Otherwise declare it with the val keyword.

**Type inference**

Kotlin will automatically infer the type of a variable.

```kotlin
var num = 1
```
</details>

<details>
<summary>Operators</summary>
Operators are used to perform actions on variables.

```kotlin
num = num + 1
```
Assignment operator: `=`

```kotlin
num = num + 1
```
Kotlin also supports arithmentic assignment operators: `+=`, `-=`, `*=`, `/=`, `%=`.

```kotlin
num += 1
```
Kotlin also supports increment and decrement operators: `++`, `--`.

**Comparison operators**
```kotlin
num == 1
```
Kotlin also supports comparison operators: `==`, `!=`, `<`, `<=`, `>`, `>=`.
</details>

<details>
<summary>Comments</summary>
Comments are used to explain code.

```kotlin
// This is a comment
```

This is also a comment.

```kotlin
/*
This is also a comment
*/
```
</details>

<details>
<summary>Input</summary>
Input is used to get user input.

```kotlin
var input = readLine()
```
Returns the input as a string to convert to an integer:

```kotlin
var input = readLine()!!.toInt()
```
</details>

<details>
<summary>Control flow</summary>

**If-else**

```kotlin
if (num == 1) {
    println("num is 1")
} else {
    println("num is not 1")
}
```

*Checking multiple conditions*

```kotlin
if (num == 1) {
    println("num is 1")
} else if (num == 2) {
    println("num is 2")
} else {
    println("num is not 1 or 2")
}
```
</details>

<details>
<summary>Conditional Expressions</summary>
A useful feature of Kotlin is the use of if statements to assign a value to a variable.

```kotlin
var num = -5
var result = if (num > 0) {
    "positive"
} else {
    "negative"
}
```
**Note:** If we have only one line of code we can omit the curly braces`{}`
        
```kotlin
var num = -5
var result = if (num > 0) "positive" else "negative"
```

As complexity increases, you can replace if/else with when statements.

```kotlin
var num = -5
var result = when (num) {
    0 -> "zero"
    1 -> "one"
    else -> "other"
}
```

Each branch in a when statement is represented by a condition, an arrow `->`, and a block of code.

You can combine multiple conditions with `&&` and `||`.

```kotlin
var num = -5
if (num >=18 || num <= 7) {
    println("num is between 7 and 18")
}
```
</details>

<details>
<summary>While loops</summary>
A while loop is used to execute a block of code while a condition is true.

```kotlin
var num = 1
while (num <= 10) {
    println(num)
    num++
}
```
*Output:* 1 2 3 4 5 6 7 8 9 10
</details>

<details>
<summary>Break and Continue</summary>
Break is used to exit a loop. Continue is used to skip the current iteration of a loop.

```kotlin
var num = 1
while (num <= 10) {
    if (num == 5) {
        break
    }
    println(num)
    num++
}
```
*Output:* 1 2 3 4
</details>

<details>
<summary>Arrays </summary>
Arrays are used to store a list of values.
An array is declared with the `arrayOf` function.

```kotlin
var nums = arrayOf(1, 2, 3, 4, 5)
```
To output the second element in the array:

```kotlin 
println(nums[1])
```
You can also change the value of an element in the array:

```kotlin
nums[1] = 10
```
</details>

<details>
<summary>For loops</summary>
A for loop is used to iterate over a list of values.

```kotlin
var nums = arrayOf(1, 2, 3, 4, 5)
for (num in nums) {
    println(num)
}
```
For loops can be used to iterate over characters in a string:

```kotlin
var str = "Hello"
for (c in str) {
    println(c)
}
```
</details>
<details>
<summary>forEach loops</summary>
forEach loops are used to iterate over a list of values.

```kotlin
fun main() {
    val nums = arrayOf(1, 2, 3, 4, 5)
    nums.forEach { num ->
        println(num * 2)
    }
}
```
*Output:* 2 4 6 8 10

Kotlin provides a way to shorten the above code by using the `it` keyword.

```kotlin
fun main() {
    val nums = arrayOf(1, 2, 3, 4, 5)
    nums.forEach { 
        println(it * 2)
    }
}
```
</details>

<details>
<summary>Ranges</summary>
Kotlin allows you to easily create ranges of values using the following syntax:

```kotlin
for (i in 1..10) {
    println(i)
}
```
You can also create ranges of characters:

```kotlin
for (c in 'a'..'z') {
    println(c)
}
```

You can check if a number is present in a value using in:

```kotlin
var num = 5
if (num in 1..10) {
    println("num is in the range")
}
```

To iterate a number which does not include it's end element, use until:

```kotlin
for (i in 1 until 10) {
    println(i)
}
```
</details>

<details>
<summary>Functions</summary>
Functions are used to perform actions.
Functions are defined using the `fun` keyword.
After we have defined a function we call it in the code.

```kotlin
fun functionName(parameter: dataType) {
    // function body
}
```
**Function arguments**

Arguments provide input to our functions.

```kotlin
fun functionName(parameter: dataType) {
    // function body
}
```
To call the function we use the function name followed by the arguments.

```kotlin
functionName(argument)
```
We can provide multiple arguments to a function.

```kotlin
fun functionName(parameter1: dataType, parameter2: dataType) {
    // function body
}
```
**Function return values**
Functions can return values using the `return` keyword.

```kotlin
fun sum(a: Int, b: Int): Int {
    return a + b
}
```
</details>

<details>
<summary>Anonymous functions</summary>
Anonymous functions are used to create a function without a name.

```kotlin  
val f: (Int, Int) -> Int = { x, y -> x + y }
```
</details>

<details>
<summary>Higher order functions</summary>
A higher order function is a function that takes a function as an argument.

```kotlin
fun apply(x:Int, action: (Int) -> Int): Int {
    return action(x)
}
```
`filter()` function of an array takes a boolean function and returns the elements that satisfy the condition.

```kotlin
val nums = arrayOf(1, 2, 3, 4, 5)
val evenNums = nums.filter { it % 2 == 0 }
println(evenNums)
```
</details>

<details>
<summary>Classes</summary>
Object Oriented Programming allows us to create objevts and use them in our program
Objects can hold data and have function to model behaviour.
For example: a dog object can have a name and a breed.
and actions like barking, eating, sleeping.

In order to create a class we use the `class` keyword. A class is like a blueprint for an object.
It defines the data and functions that the object will have.
When we have our class defined, we can create objects from it.

```kotlin
class Dog {
    var name = ""
    var breed = ""
    fun bark() {
        println("Woof")
    }
}
```
</details>

<details>
<summary>Constructors</summary>
Constructors are used to initialize the values of the properties of a class.

```kotlin
class User(var name: String, var age: Int) {
    init {
        println("User created: $name, $age")
    }
}
```

Now when creating a new object from the class, we can provide the values for the properties.

```kotlin
val user = User("John", 30)
println(user.name)
```

Kotlin allows you to create multiple constructors using the `constructor` keyword.

```kotlin
class User{
    constructor(name: String) {
        println("User created: $name")
    }
    constructor(name: String, age: Int) {
        println("User created: $name, $age")
    }
}
```
Our user has two constructors
</details>

## Idioms