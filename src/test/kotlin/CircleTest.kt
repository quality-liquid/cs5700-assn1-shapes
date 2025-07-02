import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class CircleTest {

    @Test
    fun testCircleCreation() {
        val center = Point(0.0, 0.0)
        val circle = Circle(center, 5.0)
        assertNotNull(circle)
        assertEquals(5.0, circle.radiusX)
        assertEquals(5.0, circle.radiusY)
    }

    @Test
    fun testCircleInheritance() {
        val center = Point(1.0, 1.0)
        val circle = Circle(center, 3.0)
        assertTrue(circle is Ellipse)
        assertTrue(circle is Shape)
    }

    @Test
    fun testGetArea() {
        val center = Point(0.0, 0.0)
        val circle = Circle(center, 3.0)
        val expectedArea = Math.PI * 9.0
        assertEquals(expectedArea, circle.getArea(), 0.001)
    }

    @Test
    fun testGetAreaUnitCircle() {
        val center = Point(0.0, 0.0)
        val circle = Circle(center, 1.0)
        assertEquals(Math.PI, circle.getArea(), 0.001)
    }

    @Test
    fun testTranslate() {
        val center = Point(2.0, 3.0)
        val circle = Circle(center, 4.0)
        
        circle.translate(-1.0, 2.0)
        val translatedPoints = circle.points
        
        assertEquals(1.0, translatedPoints[0].x)
        assertEquals(5.0, translatedPoints[0].y)
    }

    @Test
    fun testGetPoints() {
        val center = Point(3.0, 4.0)
        val circle = Circle(center, 2.0)
        val points = circle.points
        
        assertEquals(1, points.size)
        assertEquals(3.0, points[0].x)
        assertEquals(4.0, points[0].y)
        assertNotSame(center, points[0])
    }
}
