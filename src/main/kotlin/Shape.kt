abstract class Shape(points: List<Point>) {
    private val _points: MutableList<Point> = points.toMutableList()
    
    val points: MutableList<Point>
        get() {
            val copies = mutableListOf<Point>()
            for (point in _points) {
                copies.add(point.clone())
            }
            return copies
        }

    abstract fun getArea(): Double

    fun translate(deltaX: Double, deltaY: Double) {
        for (point in _points) {
            point.translate(deltaX, deltaY)
        }
    }
}
