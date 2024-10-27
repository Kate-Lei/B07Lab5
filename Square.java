package Lab4;

import java.util.Arrays;

public class Square {
	
	Point A;
	Point B;
	Point C;
	Point D;
	
	public Square(Point A, Point B, Point C, Point D) {
		this.A = A; 
		this.B = B; 
		this.C = C;
		this.D = D;
	}
	
	public boolean isSquare() {
		double dAB = A.distance(B);
	    double dAC = A.distance(C);
	    double dAD = A.distance(D);
	    double dBC = B.distance(C);
	    double dBD = B.distance(D);
	    double dCD = C.distance(D);
	    
	    double[] distances = {dAB, dAC, dAD, dBC, dBD, dCD};
	    Arrays.sort(distances);
	    
	    return (distances[0] == distances[1] && distances[1] == distances[2] && distances[2] == distances[3]) &&
	            (distances[4] == distances[5]) &&
	            (distances[4] > distances[0]); 
	    
	}
	
	

}
