//parent/super classes
open class Shape {
    open fun draw(){
        println("Drawing shape")
    }

}
//child/subclasses
class Circle:Shape() {
    override fun draw() {
        println("Drawing circle")
    }

}
//child/subclasses
class Square:Shape() {
    override fun draw() {
        println("Drawing square")
    }

}
//child/subclasses
class Triangle:Shape(){
    override fun draw() {
        println("Drawing triangle")
    }

}

fun main(args: Array<String>) {
    val shapes:Array<Shape> = arrayOf(Circle(),Square(),Triangle())
    for (shape in shapes){
        shape.draw()
    }
}
