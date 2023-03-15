// Class Diamond merepresentasikan bentuk belah ketupat
import kotlin.math.abs
//class BelahKetupat(panjangSisi: Int) : Gambar(panjangSisi) {
//    override fun draw() {
//        val halfSize = (panjangSisi + 1) / 2
//        for (i in 1..halfSize) {
//            for (j in halfSize - i downTo 1) {
//                print(" ")
//            }
//            for (j in 1..2 * i - 1) {
//                print("*")
//            }
//            println()
//        }
//        for (i in halfSize - 1 downTo 1) {
//            for (j in 1..halfSize - i) {
//                print(" ")
//            }
//            for (j in 1..2 * i - 1) {
//                print("*")
//            }
//            println()
//        }
//    }
//}
//class BelahKetupat(lebar: Int, karakter: Char = '*') : Gambar(lebar, lebar, karakter) {
//    init {
//        require(lebar > 0 && lebar % 2 == 1) { "Width must be positive odd number" }
//    }
//
//    override fun gambar() {
//        val tengah = lebar / 2
//        for (i in 0..tengah) {
//            for (j in 0..tengah - i - 1) print(" ")
//            for (j in 1..2 * i - 1) {
//                if (j == 1 || j == 2 * i - 1 || i == tengah) print(karakter)
//                else print(" ")
//            }
//            println()
//        }
//        for (i in tengah + 1 until lebar) {
//            for (j in 0..i - tengah - 1) print(" ")
//            for (j in 0 until 2 * (lebar - i) - 1) {
//                if (j == 0 || j == 2 * (lebar - i) - 2) print(karakter)
//                else print(" ")
//            }
//            println()
//        }
//    }
//}
class BelahKetupat(lebar: Int, tinggi: Int, karakter: Char = '*') : Gambar(lebar, tinggi, karakter) {
    init {
        require(lebar > 0 && lebar % 2 == 1) { "Width must be positive odd number" }
    }

    override fun gambar() {
        val tengah = tinggi / 2 + 3
        for (i in 1..tengah) {
            for (j in 1..tengah - i) print(" ")
            for (j in 1..2 * i - 1) print(karakter)
            println()
        }
        for (i in tengah + 1..lebar) {
            for (j in 1..i - tengah) print(" ")
            for (j in 1..2 * (lebar - i) + 1) print(karakter)
            println()
        }
    }
}