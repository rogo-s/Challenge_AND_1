// Class X merepresentasikan bentuk X
//class X(panjangSisi: Int) : Gambar(panjangSisi) {
//    override fun draw() {
//        for (i in 1..panjangSisi) {
//            for (j in 1..panjangSisi) {
//                if (i == j || i == panjangSisi - j + 1) {
//                    print("*")
//                } else {
//                    print(" ")
//                }
//            }
//            println()
//        }
//    }
//}
class X(lebar: Int, tinggi: Int, karakter: Char) : Gambar(lebar, tinggi, karakter) {
    override fun gambar() {
        for (i in 0 until tinggi) {
            for (j in 0 until lebar) {
                if (i == j || i + j == tinggi - 1) {
                    printKarakter(karakter)
                } else {
                    printKarakter(' ')
                }
            }
            println()
        }
    }
}