package lab4;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest2{

    @Test
    public void testConstructorA() {
        Point a = new Point(1.0, 1.0);
        Point b = new Point(2.0, 2.0);
        Point c = new Point(3.0, 3.0);
        Point d = new Point(4.0, 4.0);
        Square x = new Square(a, b, c, d);
        assertTrue(x.A.equals(a));
    }

    @Test
    public void testConstructorB() {
        Point a = new Point(1.0, 1.0);
        Point b = new Point(2.0, 2.0);
        Point c = new Point(3.0, 3.0);
        Point d = new Point(4.0, 4.0);
        Square x = new Square(a, b, c, d);
        assertTrue(x.B.equals(b));
    }

    @Test
    public void testConstructorC() {
        Point a = new Point(1.0, 1.0);
        Point b = new Point(2.0, 2.0);
        Point c = new Point(3.0, 3.0);
        Point d = new Point(4.0, 4.0);
        Square x = new Square(a, b, c, d);
        assertTrue(x.C.equals(c));
    }

    @Test
    public void testConstructorD() {
        Point a = new Point(1.0, 1.0);
        Point b = new Point(2.0, 2.0);
        Point c = new Point(3.0, 3.0);
        Point d = new Point(4.0, 4.0);
        Square x = new Square(a, b, c, d);
        assertTrue(x.D.equals(d));
    }

    @Test
    public void testNotSquareWithPointsInLine() {
     Point a = new Point(1.0, 0.0);
        Point b = new Point(2.0, 0.0);
        Point c = new Point(3.0, 0.0);
        Point d = new Point(4.0, 0.0);
        Square x = new Square(a, b, c, d);
        assertFalse(x.isSquare(), "Expected false for points in a straight line");
    }
    
    @Test
    public void testNotSquareWithRandomPoints() {
     Point a = new Point(1.0, 0.0);
        Point b = new Point(2.0, 0.0);
        Point c = new Point(3.0, 0.0);
        Point d = new Point(1.0, 1.0);
        Square x = new Square(a, b, c, d);
        assertFalse(x.isSquare(), "Expected false for random points");
    }
    
    @Test
    public void testIsSquareWithRandomQuadrilateral() {
        Point a = new Point(0.0, 0.0);
        Point b = new Point(1.0, 1.0);
        Point c = new Point(3.0, 1.0);
        Point d = new Point(5.0, -2.0);
        Square x = new Square(a, b, c, d);
        assertFalse(x.isSquare(), "Expected false for a random quadrilateral");
    }

    @Test
    public void testNotSquareWithRhombus() {
        Point a = new Point(0.0, 0.0);
        Point b = new Point(3.0, 4.0);
        Point c = new Point(8.0, 4.0);
        Point d = new Point(5.0, 0.0);
        Square x = new Square(a, b, c, d);
        assertFalse(x.isSquare(), "Expected false for a rhombus with equal sides but unequal angles");
    }
    
    @Test
    public void testNotSquareWithRectangle1() {
        Point a = new Point(0.0, 0.0);
        Point b = new Point(3.0, 0.0);
        Point c = new Point(3.0, -5.0);
        Point d = new Point(0.0, -5.0);
        Square x = new Square(a, b, c, d);
        assertFalse(x.isSquare(), "Expected false for a rectangle");
    }

    @Test
    public void testIsSquare() {
        Point a = new Point(0.0, 0.0);
        Point b = new Point(0.0, 3.0);
        Point c = new Point(3.0, 3.0);
        Point d = new Point(3.0, 0.0);
        Square x = new Square(a, b, c, d);
        assertTrue(x.isSquare(), "Expected true for a valid square");
    }

}
