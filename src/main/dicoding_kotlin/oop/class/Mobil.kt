package oop.`class`

import oop.delegate.DelegateClassGeneric
import java.sql.Ref
import javax.swing.UIDefaults.LazyValue
import kotlin.reflect.KProperty

/**
 * @created 22/02/2024 - 16.55
 * @project LearnKotlinBangkit
 * @author yanuartrilaksono
 */
class DelegeateMobil{
    private var value: Any = "Defaultq"


    operator fun getValue(classRef: Any,property:KProperty<*>) : Any{
        println("Get Value ${value}")
        return value
    }
    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any){
        println("Set Value ${newValue}")
        value = newValue
    }
}
data class Mobil(var pNamaMobil: String?, var pJumlahBensin: Int){
    var namaMobil: Any by DelegeateMobil()
    var jumlahBensin: Any by DelegeateMobil()
    var warnaMobil: Any by DelegeateMobil()
    init{
        namaMobil = pNamaMobil?.takeIf { it.isNotEmpty() } ?: "Empty"
        jumlahBensin = if(pJumlahBensin < 0) 0 else pJumlahBensin
    }
    constructor( pNamaMobil: String?,  pJumlahBensin: Int,  warnaMobil: String?) : this(pNamaMobil,pJumlahBensin){
        this.warnaMobil = warnaMobil?.takeIf { it.isNotEmpty() } ?: "Empty"

    }

}


fun main(){
    val header: String by lazy {
        println("Header Called")
        "Header Program"
    }
    println(header)

    println(header)
    val nissanGtr: Mobil =  Mobil(pNamaMobil = null, pJumlahBensin = 0, warnaMobil = "Hijau")
    println("""toString: ${nissanGtr.toString()}""") 
}