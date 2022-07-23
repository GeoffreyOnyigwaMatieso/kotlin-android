# KOTLIN BASICS

## Data types
Integer: `int` indicates a whole number.

Float: `float` indicates a number with a decimal point.

Double: `double` indicates a number with a decimal point.

Character: `char` indicates a single character.

Boolean: `boolean` indicates a true or false value.

String: `String` indicates a sequence of characters.

`\n` is used to indicate a new line.

## Variables
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

## Operators
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

## Comments
Comments are used to explain code.

```kotlin
// This is a comment
```

## Input
Input is used to get user input.

```kotlin
var input = readLine()
```
Returns the input as a string to convert to an integer:

```kotlin
var input = readLine()!!.toInt()
```

## Control flow
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

## Conditional Expressions
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

## While loops
A while loop is used to execute a block of code while a condition is true.

```kotlin
var num = 1
while (num <= 10) {
    println(num)
    num++
}
```
*Output:* 1 2 3 4 5 6 7 8 9 10

## Break and Continue
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