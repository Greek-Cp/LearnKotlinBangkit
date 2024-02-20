package control_flow

/**
 * @created 20/02/2024 - 13.39
 * @project LearnKotlinBangkit
 * @author yanuartrilaksono
 */
fun main(){
    var rangeNumber = 1..10 step 1
    //step down
    var num = 10.downTo(1)
    var array = mutableListOf("abc",1,2)
    num.forEach {
        println(it)
    }
    var index1 = 1.rangeTo(10) step 1
    var intex2 = 1.rangeTo(10) step 1
   for((inde,value)in index1.withIndex()){
        for(index in value.rangeTo(10)){
            print(index)
        }
       println(" ")
   }
    for((index, value) in array.withIndex()){
        println(" data ${array.get(index)}")
    }

}