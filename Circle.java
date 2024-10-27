package lab4;

public class Circle {
    Point center;
    double radius; 
    
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    
    public Point getCenter() {
        return center;
    }


    public double computeArea() {
        return Math.PI * radius * radius;
    }

    
    public double copmuteCircumference() {
        return 2 * Math.PI * radius;
    }

    public boolean containsPoint(Point p) {
        double distance = center.distance(p);
        return distance <= radius;
    }

    
}