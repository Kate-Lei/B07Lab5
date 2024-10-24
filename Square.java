package lab4;

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
		return (A.distance(B) == B.distance(C) &&
				B.distance(C) == C.distance(D) &&
				C.distance(D) == D.distance(A));
	}
	
	

}
