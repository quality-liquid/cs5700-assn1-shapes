abstract class Shape(points: List<Point>) {
    val points: MutableList<Point> = points as MutableList<Point>
        get() {
            val copies = mutableListOf<Point>()
            for (point in field) {
                copies.add(point.clone())
            }
            return copies
        }

    abstract fun getArea(): Double

    fun translate(deltaX: Double, deltaY: Double) {
        for (point in this.points) {
            point.translate(deltaX, deltaY)
        }
    }
}
