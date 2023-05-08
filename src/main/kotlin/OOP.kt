class Sturborn{
    //data member
   private var nambari:Int=5
    //member function

    fun calculate():Int{
        return nambari *nambari

    }
}

fun main(args: Array<String>) {
    //This is an object
    val myobje=Sturborn()
    println(myobje.calculate())
}