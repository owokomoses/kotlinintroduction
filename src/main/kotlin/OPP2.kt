class eMobilis{
    var num:Int=6

    fun Hesabu():Int{
        return num*num
    }
}

fun main(args: Array<String>) {
    //Create object
    val Obj=eMobilis()
    println(Obj.Hesabu())
}