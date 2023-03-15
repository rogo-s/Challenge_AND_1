// Implementasi konsep Inheritance dan Polymorphism
// Class Triangle merepresentasikan bentuk segitiga siku-siku
//class Segitiga(panjangSisi: Int) : Gambar(panjangSisi) {
//    override fun draw() {
//        for (i in 1..panjangSisi) {
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
class Segitiga(lebar: Int, tinggi: Int, karakter: Char = '*') : Gambar(lebar, tinggi, karakter) {
    override fun gambar() {
        for (i in 1..tinggi) {
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