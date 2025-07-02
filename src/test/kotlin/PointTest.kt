import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class PointTest {

    @Test
    fun testPointCreation() {
        val point = Point(3.0, 4.0)
        assertEquals(3.0, point.x)
        assertEquals(4.0, point.y)
    }

    @Test
    fun testClone() {
        val original = Point(5.0, 7.0)
        val cloned = original.clone()
        
        assertEquals(original.x, cloned.x)
        assertEquals(original.y, cloned.y)
        assertNotSame(original, cloned)
    }

    @Test
    fun testTranslate() {
        val point = Point(1.0, 2.0)
        point.translate(3.0, -1.0)
        
        assertEquals(4.0, point.x)
        assertEquals(1.0, point.y)
    }

    @Test
    fun testTranslateWithZero() {
        val point = Point(5.0, 5.0)
        point.translate(0.0, 0.0)
        
        assertEquals(5.0, point.x)
        assertEquals(5.0, point.y)
    }
}
