package newBlock

abstract class Shape(val char: Char) {
    abstract fun draw()
    abstract fun drawFull()
}

class Triangle(val height: Int, char: Char) : Shape(char) {
    init {
        require(height > 0) { "Height must be positive" }
    }

    override fun draw() {
        for (i in 1..height) {
            for (j in 1..height - i) print(" ")
            for (j in 1..2 * i - 1) {
                if (j == 1 || j == 2 * i - 1 || i == height) print(char)
                else print(" ")
            }
            println()
        }
    }

    override fun drawFull() {
        for (i in 1..height) {
            for (j in 1..height - i) print(" ")
            for (j in 1..2 * i - 1) print(char)
            println()
        }
    }
}

class InvertedTriangle(val height: Int, char: Char) : Shape(char) {
    init {
        require(height > 0) { "Height must be positive" }
    }

    override fun draw() {
        for (i in height downTo 1) {
            for (j in 1..height - i) print(" ")
            for (j in 1..2 * i - 1) {
                if (j == 1 || j == 2 * i - 1 || i == 1) print(char)
                else print(" ")
            }
            println()
        }
    }

    override fun drawFull() {
        for (i in height downTo 1) {
            for (j in 1..height - i) print(" ")
            for (j in 1..2 * i - 1) print(char)
            println()
        }
    }
}

class Diamond(val width: Int, char: Char) : Shape(char) {
    init {
        require(width > 0 && width % 2 == 1) { "Width must be positive odd number" }
    }

    override fun draw() {
        val half = width / 2 + 1
        for (i in 1..half) {
            for (j in 1..half - i) print(" ")
            for (j in 1..2 * i - 1) {
                if (j == 1 || j == 2 * i - 1) print(char)
                else print(" ")
            }
            println()
        }
        for (i in half + 1..width) {
            for (j in 1..i - half) print(" ")
            for (j in 1..2 * (width - i) + 1) {
                if (j == 1 || j == 2 * (width - i) + 1) print(char)
                else print(" ")
            }
            println()
        }
    }
    override fun drawFull() {
        val half = width / 2 + 1
        for (i in 1..half) {
            for (j in 1..half - i) print(" ")
            for (j in 1..2 * i - 1) print(char)
            println()
        }
        for (i in half + 1..width) {
            for (j in 1..i - half) print(" ")
            for (j in 1..2 * (width - i) + 1) print(char)
            println()
        }
    }
}

class X(val width: Int, char: Char) : Shape(char) {
    init {
        require(width > 0 && width % 2 == 1) { "Width must be positive odd number" }
    }
    override fun draw() {
        for (i in 1..width) {
            for (j in 1..width) {
                if (i == j || i == width - j + 1) print(char)
                else print(" ")
            }
            println()
        }
    }
    override fun drawFull() {
        for (i in 1..width) {
            for (j in 1..width) {
                if (i == j || i == width - j + 1 || j == width / 2 + 1 || i == width / 2 + 1) print(char)
                else print(" ")
            }
            println()
        }
    }
}

class Plus(private val height: Int, char: Char) : Shape(char) {
    override fun draw() {
        for (i in 1..height) {
            for (j in 1..height) {
                if (i == height / 2 + 1 || j == height / 2 + 1) {
                    print("*")
                } else {
                    print(" ")
                }
            }
            println()
        }
    }

    override fun drawFull() {
        TODO("Not yet implemented")
    }
}

class RightTriangle(val height: Int, char: Char) : Shape(char) {
    init {
        require(height > 0) { "Height must be positive" }
    }
    override fun draw() {
        for (i in 1..height) {
            for (j in 1..i) print(char)
            println()
        }
    }

    override fun drawFull() {
        for (i in 1..height) {
            for (j in 1..i) {
                if (j == 1 || j == i || i == height) print(char)
                else print(" ")
            }
            println()
        }
    }
}

fun main() {
    val triangle = Triangle(5, '*')
    println("Full Triangle:")
    triangle.drawFull()
    println()

    val invertedTriangle = InvertedTriangle(5, '*')
    println("Full Inverted Triangle:")
    invertedTriangle.drawFull()
    println()

    val diamond = Diamond(7, '*')
    println("Full Diamond:")
    diamond.drawFull()
    println()

    val x = X(7, '*')
    println("X:")
    x.draw()

    val plus = Plus(7, '*')
    println("Plus:")
    plus.draw()

    val rightTriangle = RightTriangle(5, '*')
    println("Right Triangle:")
    rightTriangle.draw()
}