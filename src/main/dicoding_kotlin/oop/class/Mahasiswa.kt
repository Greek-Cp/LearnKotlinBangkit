package oop.`class`

/**
 * @created 22/02/2024 - 11.22
 * @project LearnKotlinBangkit
 * @author yanuartrilaksono
 */
class Mahasiswa() {
    var namaMahasiswa: String = "Denis"
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var nim: String = "E41210753"
        get() {
            return field
        }
        set(value) {
            field = nim
        }
    val alamat : String by lazy {
        "Florida"
    }
    lateinit var umur: String
    fun initializeUmur(){
        umur = "20"
    }
    fun getUmur(): Int{
        if(::umur.isInitialized){
             return umur.toInt()
        }
        return 0
    }
    fun printDetailInformation(){
        println("""
            Name : $namaMahasiswa
            Alamat : $alamat
            Kelas : $umur
        """.trimIndent())
    }

}


val header: String by lazy {
    println("Header Called")
    "Header Program"
}
fun main(){
    println("$header")

    println("$header")
    val mhs1 = Mahasiswa()
    mhs1.initializeUmur()
    mhs1.printDetailInformation()

    mhs1.printDetailInformation()

}