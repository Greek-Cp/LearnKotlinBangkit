package control_flow

/**
 * @created 19/02/2024 - 00.06
 * @project LearnKotlinBangkit
 * @author yanuartrilaksono
 */

fun main(){
    var counter = 0;
    while(counter < 10){
        println("number $counter")
        counter++
    }
    counter = 0;
    do{
        println(if(counter == 0) "First Condition Started" else if(counter == 10 - 1) "Loop Ended" else "Current Counter ${counter}")
        counter++ // 1 .. 8
    } while(
        counter < 10
    )
}
