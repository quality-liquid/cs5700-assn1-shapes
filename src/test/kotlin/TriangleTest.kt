import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows

class TriangleTest {

    @Test
    fun testValidTriangleCreation() {
        val points = listOf(Point(0.0, 0.0), Point(3.0, 0.0), Point(0.0, 4.0))
        val triangle = Triangle(points)
        assertNotNull(triangle)
    }

    @Test
    fun testTriangleWithWrongNumberOfPoints() {
        val points = listOf(Point(0.0, 0.0), Point(3.0, 0.0))
        assertThrows<IllegalArgumentException> {
            Triangle(points)
        }
    }

    @Test
    fun testTriangleWithTooManyPoints() {
        val points = listOf(Point(0.0, 0.0), Point(3.0, 0.0), Point(0.0, 4.0), Point(1.0, 1.0))
        assertThrows<IllegalArgumentException> {
            Triangle(points)
        }
    }

    @Test
    fun testTriangleWithCollinearPoints() {
        val points = listOf(Point(0.0, 0.0), Point(1.0, 1.0), Point(2.0, 2.0))
        assertThrows<IllegalArgumentException> {
            Triangle(points)
        }
    }

    @Test
    fun testGetArea() {
        val points = listOf(Point(0.0, 0.0), Point(3.0, 0.0), Point(0.0, 4.0))
        val triangle = Triangle(points)
        assertEquals(6.0, triangle.getArea(), 0.001)
    }

    @Test
    fun testGetAreaDifferentTriangle() {
        val points = listOf(Point(1.0, 1.0), Point(4.0, 1.0), Point(2.5, 4.0))
        val triangle = Triangle(points)
        assertEquals(4.5, triangle.getArea(), 0.001)
    }

    @Test
    fun testTranslate() {
        val points = listOf(Point(0.0, 0.0), Point(3.0, 0.0), Point(0.0, 4.0))
        val triangle = Triangle(points)
        
        triangle.translate(1.0, 1.0)
        val translatedPoints = triangle.getPoints()
        
        assertEquals(1.0, translatedPoints[0].x)
        assertEquals(1.0, translatedPoints[0].y)
        assertEquals(4.0, translatedPoints[1].x)
        assertEquals(1.0, translatedPoints[1].y)
    }
}
