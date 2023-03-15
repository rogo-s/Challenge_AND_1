// Implementasi konsep Encapsulation dan Abstraction
// Class Shape merepresentasikan bentuk pada koordinat (i, j)
//abstract class Gambar(val size: Int, val symbol: Char) {
//    // Metode untuk mendapatkan simbol pada koordinat (i, j)
//    protected abstract fun getSymbol(i: Int, j: Int): Char
//
//    // Metode untuk menggambar bentuk pada konsol
//    fun draw() {
//        for (i in 0 until size) {
//            for (j in 0 until size) {
//                print(getSymbol(i, j))
//            }
//            println()
//        }
//    }
//}
//abstract class Gambar(val panjangSisi: Int) {
//    abstract fun draw()
//
//    protected fun printSpace(jumlah: Int) {
//        repeat(jumlah) { print(" ") }
//    }
//
//    protected fun printStar(jumlah: Int) {
//        repeat(jumlah) { print("*") }
//    }
//}
abstract class Gambar(
    protected val lebar: Int,
    protected val tinggi: Int,
    protected val karakter: Char
) {
    init {
        require(lebar > 0 && tinggi > 0) { "Lebar dan tinggi harus lebih besar dari 0" }
    }

    constructor(lebar: Int, tinggi: Int) : this(lebar, tinggi, '*')
    constructor() : this(5, 5)

    abstract fun gambar()

    protected fun printKarakter(karakter: Char) {
        print(karakter)
    }
}
