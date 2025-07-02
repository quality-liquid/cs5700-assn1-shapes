import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows

class SquareTest {

    @Test
    fun testValidSquareCreation() {
        val points = listOf(Point(0.0, 0.0), Point(3.0, 3.0))
        val square = Square(points)
        assertNotNull(square)
    }

    @Test
    fun testInvalidSquareCreation() {
        val points = listOf(Point(0.0, 0.0), Point(3.0, 4.0))
        assertThrows<IllegalArgumentException> {
            Square(points)
        }
    }

    @Test
    fun testSquareInheritance() {
        val points = listOf(Point(0.0, 0.0), Point(2.0, 2.0))
        val square = Square(points)
        assertTrue(square is Rectangle)
        assertTrue(square is Shape)
    }

    @Test
    fun testGetArea() {
        val points = listOf(Point(0.0, 0.0), Point(3.0, 3.0))
        val square = Square(points)
        assertEquals(9.0, square.getArea())
    }

    @Test
    fun testGetAreaNegativeCoordinates() {
        val points = listOf(Point(-2.0, -2.0), Point(1.0, 1.0))
        val square = Square(points)
        assertEquals(9.0, square.getArea())
    }

    @Test
    fun testSquareWithDifferentDimensions() {
        val points = listOf(Point(1.0, 1.0), Point(4.0, 2.0))
        assertThrows<IllegalArgumentException> {
            Square(points)
        }
    }
}
