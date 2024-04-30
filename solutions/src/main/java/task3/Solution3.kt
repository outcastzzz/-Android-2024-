package task3

// [TASK]
// Реализуйте иерархию классов трехмерных фигур с функциями для вычисления объема, площади основания

open class Shape {
    open fun getVolume(): Double = 0.0
    open fun getArea(): Double = 0.0
}

class Cone(private val radius: Double, private val height: Double): Shape() {
    override fun getVolume(): Double = (1.0 / 3.0) * Math.PI * radius * radius * height
    override fun getArea(): Double = Math.PI * radius * radius
}

class Cylinder(private val radius: Double, private val height: Double) : Shape() {
    override fun getVolume(): Double = Math.PI * radius * radius * height
    override fun getArea(): Double = Math.PI * radius * radius
}

class Sphere(private val radius: Double) : Shape() {
    override fun getVolume(): Double = (4.0 / 3.0) * Math.PI * radius * radius * radius
    override fun getArea(): Double = 0.0
}

class Cube(private val side: Double) : Shape() {
    override fun getVolume(): Double = side * side * side
    override fun getArea(): Double = side * side
}

class TriangularPrism(
    private val baseWidth: Double,
    private val baseHeight: Double,
    private val height: Double
) : Shape() {
    override fun getVolume(): Double = (1.0 / 2.0) * baseWidth * baseHeight * height
    override fun getArea(): Double = (1.0 / 2.0) * baseWidth * baseHeight
}

class TriangularPyramid(
    private val baseWidth: Double,
    private val baseHeight: Double,
    private val height: Double
) : Shape() {
    override fun getVolume(): Double = (1.0 / 6.0) * baseWidth * baseHeight * height
    override fun getArea(): Double = (1.0 / 2.0) * baseWidth * baseHeight
}

class RectangularParallelepiped(
    private val length: Double,
    private val width: Double,
    private val height: Double
) : Shape() {
    override fun getVolume(): Double = length * width * height
    override fun getArea(): Double = length * width
}

class RectangularPrism(
    private val length: Double,
    private val width: Double,
    private val height: Double
) : Shape() {
    override fun getVolume(): Double = length * width * height
    override fun getArea(): Double = length * width
}

class QuadrilateralPyramid(
    private val baseWidth: Double,
    private val baseHeight: Double,
    private val height: Double
) : Shape() {
    override fun getVolume(): Double = (1.0 / 3.0) * baseWidth * baseHeight * height
    override fun getArea(): Double = baseWidth * baseHeight
}
