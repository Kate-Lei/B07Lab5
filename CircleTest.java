package lab4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
	
	@Test
    void testCircleConstructorFieldCenter() {
        Point p1 = new Point(1, 2);
        Circle c = new Circle(p1, 2.0);
        assertEquals(c.center, p1);
    }
	
	@Test
    void testCircleConstructorFieldRadius() {
		Point p1 = new Point(1, 2);
        Circle c = new Circle(p1, 2.0);
        assertEquals(c.radius, 2.0);
    }
	
	@Test
    void testCircleGetCenter() {
		Point p1 = new Point(1, 2);
	    Circle c = new Circle(p1, 2.0);
	    assertEquals(c.getCenter(), p1);
    }
	
	@Test
    void testCircleComputeArea() {
		Point p1 = new Point(1, 2);
	    Circle c = new Circle(p1, 2.0);
	    assertEquals(c.computeArea(), Math.PI * 2.0 * 2.0);
    }

	@Test
    void testCircleComputeCircumference() {
		Point p1 = new Point(1, 2);
	    Circle c = new Circle(p1, 3.0);
	    assertEquals(c.computeCircumference(), 2 * Math.PI * 3.0);
    }
	
	@Test
    public void testPointOnCircumference() {
		Point p1 = new Point(0, 0);
	    Circle c = new Circle(p1, 5.0);
		Point p2 = new Point(5, 0);
        assertTrue(c.containsPoint(p2));
    }

    @Test
    public void testPointInsideCircle() {
    	Point p1 = new Point(0, 0);
	    Circle c = new Circle(p1, 5.0);
		Point p2 = new Point(4, 0);
        assertTrue(c.containsPoint(p2));
    }

    @Test
    public void testPointOutsideCircle() {
    	Point p1 = new Point(0, 0);
	    Circle c = new Circle(p1, 5.0);
		Point p2 = new Point(6, 0);
        assertFalse(c.containsPoint(p2));
    }

    @Test
    public void testPointAtCenter() {
    	Point p1 = new Point(0, 0);
	    Circle c = new Circle(p1, 5.0);
		Point p2 = new Point(0, 0);
        assertTrue(c.containsPoint(p2));
    }

}
