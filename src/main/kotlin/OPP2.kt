class eMobilis{
    var num:Int=6

    fun Hesabu():Int{
        return num*num
    }
}

class Cars{
    var num:Int=50

    fun Count():Int{
        return num+num
    }
}

fun main(args: Array<String>) {
    //Create object
    val Obj = eMobilis()
    val Cnt = Cars()
    println(Obj.Hesabu())
    println(Cnt.Count())

}
