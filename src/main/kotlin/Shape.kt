abstract class Shape(val points: List<Point>) {

    abstract fun getArea(): Double

    // returns a list of copies of the actual points
    fun getPoints(): List<Point> {
        val copies = mutableListOf<Point>()
        for (point in this.points) {
            copies.add(point.clone())
        }
        return copies
    }

    fun translate(deltaX: Double, deltaY: Double) {
        for (point in this.points) {
            point.translate(deltaX, deltaY)
        }
    }
}
