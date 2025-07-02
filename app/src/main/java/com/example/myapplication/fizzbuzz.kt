package com.example.myapplication
fun fizz(n: Int): String
{
    var ans = "";
    if (n %17 != 0){
        if (n %143 == 0) ans = ans + "FezzBong";
        else
            if (n % 11 == 0) ans = ans + "Bong";
            else {
                if (n % 3 == 0) ans = ans + "Fizz";
                if (n % 13 == 0) ans = ans + "Fezz";
                if (n % 5 == 0) ans = ans + "Buzz";
                if (n % 7 == 0) ans = ans + "Bang";

                if (n % 3 != 0 && n % 5 != 0 && n % 7 != 0 && n % 13 != 0) ans=n.toString();

            }
        }
    else
    {
        if (n %143 == 0) ans = ans + "BongFezz";
        else
            if (n % 11 == 0) ans = ans + "Bong";
            else {
                if (n % 7 == 0) ans = ans + "Bang";
                if (n % 5 == 0) ans = ans + "Buzz";
                if (n % 13 == 0) ans = ans + "Fezz";
                if (n % 3 == 0) ans = ans + "Fizz";


                if (n % 3 != 0 && n % 5 != 0 && n % 7 != 0 && n % 13 != 0) ans = n.toString();

            }
    }
    return ans;
}
fun main()
{
    //first 300
    var index = 1;
    while (index <= 300)
    {
        println(fizz(index));
        index +=1;
    }
    //any number you read
    var n = readln().toInt();
    println(fizz(n));


}