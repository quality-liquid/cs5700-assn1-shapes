import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import kotlin.math.sqrt

class LineTest {

    @Test
    fun testLineCreation() {
        val pointA = Point(0.0, 0.0)
        val pointB = Point(3.0, 4.0)
        val line = Line(pointA, pointB)
        
        assertNotNull(line)
        assertEquals(0.0, line.getPointA().x)
        assertEquals(0.0, line.getPointA().y)
        assertEquals(3.0, line.getPointB().x)
        assertEquals(4.0, line.getPointB().y)
    }

    @Test
    fun testGetPointsReturnCopies() {
        val pointA = Point(1.0, 1.0)
        val pointB = Point(2.0, 2.0)
        val line = Line(pointA, pointB)
        
        val retrievedA = line.getPointA()
        val retrievedB = line.getPointB()
        
        assertNotSame(pointA, retrievedA)
        assertNotSame(pointB, retrievedB)
    }

    @Test
    fun testGetSlope() {
        val line = Line(Point(0.0, 0.0), Point(2.0, 4.0))
        assertEquals(2.0, line.getSlope())
    }

    @Test
    fun testGetSlopeNegative() {
        val line = Line(Point(0.0, 4.0), Point(2.0, 0.0))
        assertEquals(-2.0, line.getSlope())
    }

    @Test
    fun testGetLength() {
        val line = Line(Point(0.0, 0.0), Point(3.0, 4.0))
        assertEquals(5.0, line.getLength(), 0.001)
    }

    @Test
    fun testGetLengthZero() {
        val line = Line(Point(5.0, 5.0), Point(5.0, 5.0))
        assertEquals(0.0, line.getLength())
    }

    @Test
    fun testTranslate() {
        val pointA = Point(1.0, 1.0)
        val pointB = Point(3.0, 3.0)
        val line = Line(pointA, pointB)
        
        line.translate(2.0, -1.0)
        
        assertEquals(3.0, line.getPointA().x)
        assertEquals(0.0, line.getPointA().y)
        assertEquals(5.0, line.getPointB().x)
        assertEquals(2.0, line.getPointB().y)
    }
}
