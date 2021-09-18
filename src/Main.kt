fun main() {
    //Data types
    val numInt: Int = 5
    val numFloat: Float = 5.2F // = 5.2f
    val numDouble: Double = 5.2
    val char: Char = 'A'
    val numShort: Short = 200
    val numLong: Long = 5241L
    val logical: Boolean = true

    // To change between types you can use toInt() | toDouble() ,etc ...
    println(numDouble.toInt()) // will print 5

    // String type

    // to make a string variable
    val text: String = "I love Kotlin"
    val multiLineText = """
        This type of string can be 
        multiline, So you can write multiline paragraph  easily 
    """.trimIndent()
    //You can use $ to include variables inside a string like shown below
    val name = "Muath"
    val order = 5
    println(" $name has bought $order sandwiches ")


    //------- Specifying data type is not necessary -------

    val text2 = "I like Android development" // text2 will be String
    val age = 28 // age will be Int

    //-----------------val or var
    var collage = "Engineering" // var can be reassigned
    collage = "Information Technology" // this is okay

    val university = "Azhar" // val can't be reassigned
    // university = "IUG" , this is not okay because we can't reassign university

    //------------------- to get data from console like Scanner in Java, you can use readLine()
    println("Please Enter Student Name ........")
    val stdName = readLine()
    println("the student name is $stdName")

    //---------------------Loops-----------------
    for (i in 1..10) {
        println(i)
    }
    // to do steps
    println("to do steps")
    for (i in 1..10 step 2) {
        println(i)
    }
    // to do back counter
    println("to do back counter ")
    for (i in 10 downTo 1) {
        println(i)
    }
    // to iterate with neglecting last element
    println("neglect last ")
    for (i in 1 until 10) {
        println(i)
    }

    //while loop is just like while in Java
    println("normal while")
    var max = 0
    while (max <= 5) {
        println(max++)
    }
    //do while
    println("do while")
    do {
        println("do while iteration ${max++}")
    } while (max <= 10)

    // instead of switch in Java, Kotlin has when
    val j = 5
    when (j) {
        1 -> {
            println("case 1")
        }
        2, 3, 4 -> {
            println("case 2")
        }
        in 5..100 -> {
            println("case 3")
        }
        5 ->{
            println("case 4")
        }
        else ->{
            println("case 5")
        }
    }
}