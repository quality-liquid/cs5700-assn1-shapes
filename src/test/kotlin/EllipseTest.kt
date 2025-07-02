import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class EllipseTest {

    @Test
    fun testEllipseCreation() {
        val center = Point(0.0, 0.0)
        val ellipse = Ellipse(center, 3.0, 4.0)
        assertNotNull(ellipse)
        assertEquals(3.0, ellipse.radiusX)
        assertEquals(4.0, ellipse.radiusY)
    }

    @Test
    fun testEllipseInheritance() {
        val center = Point(1.0, 1.0)
        val ellipse = Ellipse(center, 2.0, 3.0)
        assertTrue(ellipse is Shape)
    }

    @Test
    fun testGetArea() {
        val center = Point(0.0, 0.0)
        val ellipse = Ellipse(center, 2.0, 3.0)
        val expectedArea = Math.PI * 2.0 * 3.0
        assertEquals(expectedArea, ellipse.getArea(), 0.001)
    }

    @Test
    fun testGetAreaWithSameRadii() {
        val center = Point(0.0, 0.0)
        val ellipse = Ellipse(center, 5.0, 5.0)
        val expectedArea = Math.PI * 25.0
        assertEquals(expectedArea, ellipse.getArea(), 0.001)
    }

    @Test
    fun testTranslate() {
        val center = Point(1.0, 1.0)
        val ellipse = Ellipse(center, 2.0, 3.0)
        
        ellipse.translate(2.0, -1.0)
        val translatedPoints = ellipse.getPoints()
        
        assertEquals(3.0, translatedPoints[0].x)
        assertEquals(0.0, translatedPoints[0].y)
    }

    @Test
    fun testGetPoints() {
        val center = Point(5.0, 7.0)
        val ellipse = Ellipse(center, 1.0, 2.0)
        val points = ellipse.getPoints()
        
        assertEquals(1, points.size)
        assertEquals(5.0, points[0].x)
        assertEquals(7.0, points[0].y)
        assertNotSame(center, points[0])
    }
}
