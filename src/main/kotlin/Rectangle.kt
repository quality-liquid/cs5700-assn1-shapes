open class Rectangle(points: List<Point>) : Shape(points) {
    init {
        // check that there are only two points
        if (points.size != 2) {
            throw IllegalArgumentException("Rectangle must be defined by exactly two points")
        }
        // check that the two points aren't on the same x or y (zero volume)
        // using the checkRectangleHasArea function
        if (!checkRectangleHasArea(points)) {
            throw IllegalArgumentException("Invalid rectangle points")
        }
    }

    private fun checkRectangleHasArea(points: List<Point>): Boolean {
        val (p1, p2) = points
        return p1.x != p2.x && p1.y != p2.y
    }

    override fun getArea(): Double {
        val (p1, p2) = points
        val width = Math.abs(p1.x - p2.x)
        val height = Math.abs(p1.y - p2.y)
        return width * height
    }
}
