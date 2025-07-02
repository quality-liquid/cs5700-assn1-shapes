import kotlin.math.sqrt

class Line(pointA: Point, pointB: Point) {
    val pointA: Point = pointA
        get() {
            return field.clone()
        }
    val pointB: Point = pointB
        get() {
            return field.clone()
        }

    fun getSlope(): Double {
        val deltaX = this.pointB.x - this.pointA.x
        val deltaY = this.pointB.y - this.pointA.y
        val slope = deltaY / deltaX
        return slope
    }

    fun getLength(): Double {
        val deltaX = this.pointB.x - this.pointA.x
        val deltaY = this.pointB.y - this.pointA.y
        val length = sqrt((deltaX * deltaX) + (deltaY * deltaY))
        return length
    }

    fun translate(deltaX: Double, deltaY: Double) {
        this.pointA.translate(deltaX, deltaY)
        this.pointB.translate(deltaX, deltaY)
    }
}
