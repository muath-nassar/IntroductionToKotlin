fun main() {
    /*
 A temperature expressed in °C can be converted to °F by multiplying by 1.8 then
incrementing by 32. In this challenge, do the reverse: convert a temperature from
°F to °C. Declare a constant named fahrenheit of type Double and assign it a
value. Calculate the corresponding temperature in °C and store the result in a
constant named celcius.
     */
    val fahrenheit: Double = 50.6
    val celcius = (fahrenheit - 32.0) / 1.8
    println("the temperature in  °C = $celcius")

/*
A circle is made up of 2! radians, corresponding with 360 degrees. Declare a
constant degrees of type Double and assign it an initial value. Calculate the
corresponding angle in radians and store the result in a constant named
radians.
 */
    val degAngle = 50.2
    val radAngle: Double = degAngle * 2.0 * Math.PI / 360.0
    println(radAngle)
    /*
Create a constant named range and set it equal to a range starting at 1 and
ending with 10 inclusive. Write a for loop which iterates over this range and
prints the square of each number.
     */
    val range = 1..10
    for (i in range) {
        println(i * i)
    }

}

