// Class Plus merepresentasikan bentuk plus
//class Plus(panjangSisi: Int) : Gambar(panjangSisi) {
//    override fun draw() {
//        val halfSize = (panjangSisi + 1) / 2
//        for (i in 1..panjangSisi) {
//            for (j in 1..panjangSisi) {
//                if (j == halfSize || i == halfSize) {
//                    print("*")
//                } else {
//                    print(" ")
//                }
//            }
//            println()
//        }
//    }
//}
class Plus(lebar: Int, tinggi: Int, karakter: Char) : Gambar(lebar, tinggi, karakter) {
    override fun gambar() {
        for (i in 0 until tinggi) {
            for (j in 0 until lebar) {
                if (i == tinggi / 2 || j == lebar / 2) {
                    printKarakter(karakter)
                } else {
                    printKarakter(' ')
                }
            }
            println()
        }
    }
}