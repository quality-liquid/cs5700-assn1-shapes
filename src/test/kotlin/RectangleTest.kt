import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows

class RectangleTest {

    @Test
    fun testValidRectangleCreation() {
        val points = listOf(Point(0.0, 0.0), Point(3.0, 4.0))
        val rectangle = Rectangle(points)
        assertNotNull(rectangle)
    }

    @Test
    fun testRectangleWithWrongNumberOfPoints() {
        val points = listOf(Point(0.0, 0.0))
        assertThrows<IllegalArgumentException> {
            Rectangle(points)
        }
    }

    @Test
    fun testRectangleWithSameXCoordinates() {
        val points = listOf(Point(1.0, 0.0), Point(1.0, 4.0))
        assertThrows<IllegalArgumentException> {
            Rectangle(points)
        }
    }

    @Test
    fun testRectangleWithSameYCoordinates() {
        val points = listOf(Point(0.0, 2.0), Point(3.0, 2.0))
        assertThrows<IllegalArgumentException> {
            Rectangle(points)
        }
    }

    @Test
    fun testGetArea() {
        val points = listOf(Point(0.0, 0.0), Point(3.0, 4.0))
        val rectangle = Rectangle(points)
        assertEquals(12.0, rectangle.getArea())
    }

    @Test
    fun testGetAreaNegativeCoordinates() {
        val points = listOf(Point(-2.0, -1.0), Point(1.0, 2.0))
        val rectangle = Rectangle(points)
        assertEquals(9.0, rectangle.getArea())
    }

    @Test
    fun testTranslate() {
        val points = listOf(Point(0.0, 0.0), Point(3.0, 4.0))
        val rectangle = Rectangle(points)
        
        rectangle.translate(1.0, -1.0)
        val translatedPoints = rectangle.getPoints()
        
        assertEquals(1.0, translatedPoints[0].x)
        assertEquals(-1.0, translatedPoints[0].y)
        assertEquals(4.0, translatedPoints[1].x)
        assertEquals(3.0, translatedPoints[1].y)
    }
}
