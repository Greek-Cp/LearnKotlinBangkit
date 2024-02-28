package oop.inheritance

open class Animal( var weight: Int, var name: String){
    open fun eat(){
        println("eating")
    }
    open fun walking(){
        println("walking")
    }
}

class Cat(var colorCat: String, var pweight: Int, var pname: String) : Animal(pweight,pname){
    fun playWithHuman(){
        println("cat $name play with human")
    }
    override fun eat() {
        super.eat()
    }

    override fun walking() {
        super.walking()
    }

}


fun main(){
    val myCat = Cat("Yellow",19,"Aiko")

    myCat.walking()
    myCat.playWithHuman()

}
