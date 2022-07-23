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