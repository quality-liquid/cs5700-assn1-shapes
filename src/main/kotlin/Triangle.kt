class Triangle(points: List<Point>) : Shape(points) {

    init {
        // check that there are exactly three points
        if (points.size != 3) {
            throw IllegalArgumentException("Triangle must be defined by exactly three points")
        }
        // check that the points are not collinear
        if (checkColinearity(points)) {
            throw IllegalArgumentException("Points are collinear, cannot form a triangle")
        }
    }

    override fun getArea(): Double {
        val (p1, p2, p3) = points
        return Math.abs((p1.x * (p2.y - p3.y) + p2.x * (p3.y - p1.y) + p3.x * (p1.y - p2.y)) / 2.0)
    }

    fun checkColinearity(points: List<Point>): Boolean {
        val (p1, p2, p3) = points
        return (p2.y - p1.y) * (p3.x - p2.x) == (p3.y - p2.y) * (p2.x - p1.x)
    }

}
