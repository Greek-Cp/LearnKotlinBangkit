package oop.delegate

import com.sun.jdi.Value
import java.sql.Ref
import kotlin.reflect.KProperty

/**
 * @created 22/02/2024 - 15.35
 * @project LearnKotlinBangkit
 * @author yanuartrilaksono
 */
class DelegateClassGeneric {
private var value: Any = "Default"

    operator fun getValue(classRef: Any,property:KProperty<*>) : Any{

        return value
    }
    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any){
        value = newValue
    }

}

class Hewan {
    var namaHewan: Any by DelegateClassGeneric()
    var umurHewan: Any by DelegateClassGeneric()
}

fun main(){
    val hewan: Hewan = Hewan()
    hewan.namaHewan = "Kijang"


    println("umur ${hewan.umurHewan}")
    println("nama ${hewan.namaHewan}")

}