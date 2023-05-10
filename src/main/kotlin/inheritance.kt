open class Wazazi{
    val mama="she likes shopping"
    val baba="He likes watching movies"
}

class boy:Wazazi(){
    fun mvulana(){
        println(baba)
    }


}
class girl:Wazazi(){
    fun msichana(){
        println(mama)
    }
}

fun main(args: Array<String>) {
    val kijanaobj=boy()
    kijanaobj.mvulana()
    val kijanaobj2=girl()
    kijanaobj2.msichana()
}