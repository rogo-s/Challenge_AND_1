// Class InvertedTriangle merepresentasikan bentuk segitiga terbalik
//class SegitigaTerbalik(panjangSisi: Int) : Gambar(panjangSisi) {
//    override fun draw() {
//        for (i in panjangSisi downTo 1) {
//            for (j in 1..2 * panjangSisi - 1) {
//                if (j <= panjangSisi - i || j >= panjangSisi + i) {
//                    print(" ")
//                } else {
//                    print("*")
//                }
//            }
//            println()
//        }
//    }
//}
class SegitigaTerbalik(lebar: Int, tinggi: Int, karakter: Char = '*') : Gambar(lebar, tinggi, karakter) {
    override fun gambar() {
        for (i in tinggi downTo 1) {
            for (j in 1..lebar) {
                if (j <= tinggi - i) {
                    printKarakter(' ')
                } else if (j >= tinggi + i) {
                    break
                } else {
                    printKarakter(karakter)
                }
            }
            println()
        }
    }
}
