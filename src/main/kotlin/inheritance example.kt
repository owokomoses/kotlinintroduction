open class Animal(colour:String,age:Int){
    init {
        println("Colour is: $colour")
        println("Age is: $age")
    }
}

class Dog(colour: String, age:Int): Animal(colour, age){
    fun woof(){
        println("Dog makes sound of woof")
    }
}

class  Cat(colour: String, age: Int): Animal(colour,age){
    fun Meow(){
        println("Cat makes sound of meow")
    }
}

class Horse(colour: String,age: Int): Animal(colour,age){
    fun neigh(){
        println("Horse makes sound of neigh")
    }
}


class Lion(colour: String,age: Int): Animal(colour,age){
    fun roar(){
        println("Lion makes sound of roar")
    }
}
fun main(args: Array<String>) {
    val d=Dog("Black",30)
    d.woof()
    val c=Cat("white",25)
    c.Meow()
    val h=Horse("brown",40)
    h.neigh()
    val l=Lion("brown",48)
    l.roar()
}