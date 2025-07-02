package com.example.myapplication
fun fizz(n: Int): String
{
    var ans = ""
    var arr = arrayOf<String>()
    if (n % 11 == 0 && n % 13 == 0) arr += "FezzBong"
    else
        if (n % 11 == 0) arr += "Bong"
        else {
            if (n % 3 == 0) arr += "Fizz"
            if (n % 13 == 0) arr += "Fezz"
            if (n % 5 == 0) arr += "Buzz"
            if (n % 7 == 0) arr += "Bang"
            if (arr.size ==0) arr += n.toString()
        }

    if (n%17 == 0) arr.reverse()
    return arr.joinToString(separator = "")
}
fun main()
{
    //first 300
    for (i in (1..300))
    {
        println(fizz(i))
    }
    //any number you read now
    var n = readln().toInt()
    println(fizz(n))

//change
}