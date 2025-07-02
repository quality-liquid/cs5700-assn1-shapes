class Square(points: List<Point>) : Rectangle(points) {
    init {
        //  verify that the difference between the x values is the same as the difference
        //  between the y values for the two points
        val (p1, p2) = points
        if (Math.abs(p1.x - p2.x) != Math.abs(p1.y - p2.y)) {
            throw IllegalArgumentException("Invalid square points")
        }
    }
}
