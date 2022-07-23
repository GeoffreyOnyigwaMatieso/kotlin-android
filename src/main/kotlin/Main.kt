/* Problem
* Each day a family consumes 15 litres of water
* Given the number of years as input, you need to calculate and output the amount of water
* consumed in that period*/
/*fun main() {
    /* val name = readln()
    //println("Hello, $name!")
    val age = readLine()!!.toInt()
    println("My name is $name and I'm $age years old.") */

    val years = readLine()!!.toInt()
    val water = 15 * 365 * years
    println("The water consumption is $water litres.")
    if (water >= 2000) {
        println("You are a very efficient person!")
    } else {
        println("You are not an efficient person!")
    }
}*/

/*Problem
* You are making a program for a security system that opens/closes the door based on the time
* of the day. Your program needs to take the hour as input
* (from 0 to 24) and output "Open", if it's less than or equal to 18, and "Closed" in other cases.*/

/*fun main(){
    val hour = readLine()!!.toInt()
    if (hour <=18) {
        println("Open")
    }
    else {
        println("Closed")
    }
}*/

/*Problem
* Given an age as input, you need to output the age group according to the following categories:
* 0-2: "Still in Mama's arms"
* 3-4: "Preschool Maniac"
* 5-11: "Elementary school"
* 12-14: "Middle school"
* 15-18: "High school"
* 19-22: "College"
*
* In case the age is negative, output "This is not possible".*/

/*fun main() {
    val age = readLine()!!.toInt()
    if (age in 0..2){
        println("Still in Mama's arms")
    }
    else if (age in 3..4){
        println("Preschool Maniac")
    }
    else if (age in 5..11){
        println("Elementary school")
    }
    else if (age in 12..14){
        println("Middle school")
    }
    else if (age in 15..18){
        println("High school")
    }
    else if (age in 19..22){
        println("College")
    }
    else {
        println("This is not possible")
    }
}*/

/*Problem
* Given a number as input, calculate and output its digit sum
 */
/*fun main () {
    var number = readLine()!!.toInt()
    var sum = 0
    while (number > 0){
        sum += number % 10
        number /= 10
    }
    println(sum)
}*/

/*Problem
* The given code uses an infinite while loop. to take continouous input,
* You need to fix the program to stop the loop when the user enters 0 and output the number of inputs taken.*/

/*fun main() {
    var number = readLine()!!.toInt()
    var count = 0
    while (number != 0) {
        number = readLine()!!.toInt()
        count++
    }
    println(count)
}*/

/*fun main() {
    var r = 2..6
    for (x in r) {
        if (10 % x in r) {
            println(x)
        }
    }
}*/

/*Problem
8 You are making a car parking software that needs to calculate and output the amount due based on the number
* of hours parked. The following are the rules:
* The first 5 hours are billed at $1 per hour
* after that, each hour is billed at $0.5 per hour
* for each 24 hours, there is a flat fee of $15
 */

/*fun main() {
    val hours = readLine()!!.toInt()
    var sum = 0.0
    if (hours >= 24) {
        sum+=15
        var rem = hours - 24
        while(rem >= 24){
            sum += 15
            rem -= 24
        }
        sum+= rem * 0.5
    }
    else if (hours <= 5) {
        sum+=hours*1
    }
    else if(hours>5 && hours<24){
        sum+=5
        val rem = hours - 5
        sum+= rem * 0.5
    }
    println(sum)
}*/

/*Problem
* Function that takes a letter and a text as arguments and returns the number of times the letter appears in the text*/
fun letter_count(letter: Char, text: String): Int {
    var count = 0
    for (x in text) {
        if (x == letter) {
            count++
        }
    }
    return count
}
fun main() {
    val letter: Char = readLine()!![0]
    val text: String = readLine()!!
    val result = letter_count(letter, text)
    println(result)
}