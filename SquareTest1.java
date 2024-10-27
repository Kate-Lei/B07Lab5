package lab4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.Point;

public class SquareTest {

    @Test
    public void testIsSquareWithValidSquare() {
       
        Point A = new Point(0, 0);
        Point B = new Point(0, 2);
        Point C = new Point(2, 2);
        Point D = new Point(2, 0);
        
        Square square = new Square(A, B, C, D);
        
        assertTrue(square.isSquare(), "The points should form a square.");
    }

    @Test
    public void testIsSquareWithRectangle() {
       
        Point A = new Point(0, 0);
        Point B = new Point(0, 3);
        Point C = new Point(2, 3);
        Point D = new Point(2, 0);
        
        Square rectangle = new Square(A, B, C, D);
        
        assertFalse(rectangle.isSquare(), "The points should not form a square.");
    }

    @Test
    public void testIsSquareWithRandomPoints() {
        
        Point A = new Point(0, 0);
        Point B = new Point(1, 3);
        Point C = new Point(4, 4);
        Point D = new Point(2, 1);
        
        Square randomShape = new Square(A, B, C, D);
        
        assertFalse(randomShape.isSquare(), "The points should not form a square.");
    }
}
