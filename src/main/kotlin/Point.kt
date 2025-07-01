class Point(x: Double, y: Double) {
    var x: Double = x
        private set
    var y: Double = y
        private set

    fun clone(): Point {
        return Point(this.x, this.y)
    }

    fun translate(deltaX: Double, deltaY: Double) {
        this.x += deltaX
        this.y += deltaY
    }
}
