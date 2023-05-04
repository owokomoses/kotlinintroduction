fun main(args: Array<String>) {
// This is a for loop

    for (i in 5..12){
        println("Loop : $i")
    }
    val myarr= arrayOf("ab","be","cd","ef","gh",2.45
    )

    for (n in myarr){
        println(n)
    }

    //This is a while loop

    var num = 10
    while (num>=0){
        println("Loop : $num")
        num--
    }

    var num2=0
    while (num>=10){
        println("Loop : $num")
        num++
    }

    //This is a Do-While-Loop

    var num3 =100

    do {
        println("Loop : $num3")
        num3++
    }while (num3<=105)
}