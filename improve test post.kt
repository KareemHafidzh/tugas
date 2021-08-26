fun main() {

    val nama = arrayOf("michael", "Hygra", "Slovoski", "Muhammad")
    val umur = arrayOf(20, 22, 21, 19)
    val negara = arrayOf("usa", "cambodia", "russia", "indonesia")
    val merge = arrayOf("Nama",nama,"Umur",umur,"Negara",negara)

    println("nama")
    nama.forEach {
        println(it)
    }
    println("------------")
    println("Umur")
    for (ulang in umur.indices){
        if (umur[ulang]>15){
            println(umur[ulang])
        }
    }
    println("------------")
    println("Negara")
    negara.forEach {
        println(it)
    }

}