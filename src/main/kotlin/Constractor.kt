class Students(val name:String,val gender:String,val age:Int) {


}
fun main(args: Array<String>) {
    //This is an object
    val myObj=Students("Moses","Male",18)
    val mydtls=Students("bryiana","Female",17)
    println("Student Name is ${myObj.name} and he is ${myObj.gender} of ${myObj.age} years old")
    println("Student Name is ${mydtls.name} and she is ${mydtls.gender} of ${mydtls.age} years old")
}