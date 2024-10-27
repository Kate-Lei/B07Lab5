package Lab4;

public class Circle {
    private Point center;
    private double radius;
   
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    
    
    public Point getCenter() {
        return center;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(Point p) {
        double distance = center.distance(p);
        return distance <= radius;
    }

   
}