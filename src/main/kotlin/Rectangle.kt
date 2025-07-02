open class Rectangle(points: List<Point>) : Shape(points) {
    init {
        // check that there are only two points
        // check that the two points aren't on the same x or y (zero volume)
    }

    private fun checkRectangleHasArea(points: List<Point>): Boolean {
        //todo
    }

    override fun getArea(): Double {
        //todo
    }
}
