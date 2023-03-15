// Class RightTriangle merepresentasikan bentuk segitiga siku-siku terbalik
//class RightTriangle(panjangSisi: Int) : Gambar(panjangSisi) {
//    override fun draw() {
//        for (i in 1..panjangSisi) {
//            printStar(i)
//            println()
//        }
//    }
//}
class RightTriangle(lebar: Int, tinggi: Int, karakter: Char) : Gambar(lebar, tinggi, karakter) {
    override fun gambar() {
        for (i in 0 until tinggi) {
            for (j in 0 until lebar) {
                if (j <= i) {
                    printKarakter(karakter)
                } else {
                    printKarakter(' ')
                }
            }
            println()
        }
    }
}