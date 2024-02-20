package control_flow

fun main(){
 var myName: String = "Andi"
    /*
    When expressio
     */

 val getDetail = when(myName){
     "Andi"-> """
         Nama: $myName
         Asal: Amerika
         Hobi: Selancar
         Biografi: Seorang aktor pemain kartun Toy Story
     """.trimIndent()
     "Denis"->"""
         Nama: Denis Sopo Adit
         Asal: Antartika
         Hobi: Wibu
         Biografi: Seorang aktor pemain komedi 
     """.trimIndent()
     else -> "Maaf Identitas Tidak Ditemukan"
 }
    println(getDetail)
}