/* Problem
* Each day a family consumes 15 litres of water
* Given the number of years as input, you need to calculate and output the amount of water
* consumed in that period*/
fun main() {
    /* val name = readln()
    //println("Hello, $name!")
    val age = readLine()!!.toInt()
    println("My name is $name and I'm $age years old.") */

    val years = readLine()!!.toInt()
    val water = 15 * 365 * years
    println("The water consumption is $water litres.")
}