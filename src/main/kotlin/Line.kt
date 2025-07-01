import kotlin.math.sqrt

class Line(val pointA: Point, val pointB: Point) {

    fun getPointA(): Point { return this.pointA.clone() }
    fun getPointB(): Point { return this.pointB.clone() }

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