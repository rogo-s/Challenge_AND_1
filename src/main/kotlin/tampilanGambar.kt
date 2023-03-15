// Implementasi konsep Single Responsibility Principle dan Open-Close Principle
// Class ShapeDrawer bertanggung jawab untuk menggambar bentuk pada konsol
//class tampilanGambar(private val shapes: List<Gambar>) {
//    fun drawShapes() {
//        for (shape in shapes) {
//            shape.draw()
//            println()
//        }
//    }
//}
// Implementasi kode untuk menggambar semua bentuk yang diminta
//fun main() {
//    // Membuat instance ShapeDrawer dengan list berisi
//    // segitiga siku-siku, segitiga terbalik, belah ketupat,
//    // X, plus, dan segitiga siku-siku terbalik
//    val shapes = listOf(
//        Triangle(15, '*'),
////        InvertedTriangle(15, '*'),
////        Diamond(15, '*'),
////        X(15, '*'),
////        Plus(15, '*'),
////        RightTriangle(15, '*')
//    )
//    val drawer = tampilanGambar(shapes as List<Gambar>)
//
//// Menggambar semua bentuk yang diminta pada konsol
//    drawer.drawShapes()
//}
//object Main {
//    @JvmStatic
//    fun main(args: Array<String>) {
//        println("Hasil : Segitiga")
//        val triangle: Gambar = Triangle(10)
//        triangle.draw()
//        println("Hasil : Segitiga Terbalik")
//        val invertedTriangle: Gambar = InvertedTriangle(10)
//        invertedTriangle.draw()
//        println("Hasil : Belah Ketupat")
//        val diamond: Gambar = Diamond(10)
//        diamond.draw()
//        println("Hasil : X")
//        val x: Gambar = X(10)
//        x.draw()
//        println("Hasil : +")
//        val plus: Gambar = Plus(10)
//        plus.draw()
//        println("Hasil : Segitia Kanan")
//        val rightTriangle: Gambar = RightTriangle(10)
//        rightTriangle.draw()
//    }
//}
fun main() {
    println("Hasil : Segitiga")
    val segitiga = Segitiga(9, 5,'*')
    segitiga.gambar()

    println("Hasil : Segitiga Terbalik")
    val segitigaTerbalik = SegitigaTerbalik(9, 5,'*')
    segitigaTerbalik.gambar()

    println("Hasil : Belah Ketupat")
    val belahKetupat = BelahKetupat(9, 5, '*')
    belahKetupat.gambar()

    println("Hasil : X")
    val x = X(7, 7,'*')
    x.gambar()

    println("Hasil : +")
    val plus = Plus(5, 5,'*')
    plus.gambar()

    println("Hasil : Segitia Kanan")
    val rightTriangle = RightTriangle(5, 5,'*')
    rightTriangle.gambar()
}