open class Ellipse(center: Point, val radiusX: Double, val radiusY: Double) : Shape(listOf(center)) {

    override fun getArea(): Double {
        return Math.PI * radiusX * radiusY
    }
}
