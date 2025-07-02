import kotlin.math.sqrt

class Line(pointA: Point, pointB: Point) {
    private val _pointA: Point = pointA
    private val _pointB: Point = pointB
    
    val pointA: Point
        get() {
            return _pointA.clone()
        }
    val pointB: Point
        get() {
            return _pointB.clone()
        }

    fun getSlope(): Double {
        val deltaX = _pointB.x - _pointA.x
        val deltaY = _pointB.y - _pointA.y
        val slope = deltaY / deltaX
        return slope
    }

    fun getLength(): Double {
        val deltaX = _pointB.x - _pointA.x
        val deltaY = _pointB.y - _pointA.y
        val length = sqrt((deltaX * deltaX) + (deltaY * deltaY))
        return length
    }

    fun translate(deltaX: Double, deltaY: Double) {
        _pointA.translate(deltaX, deltaY)
        _pointB.translate(deltaX, deltaY)
    }
}
