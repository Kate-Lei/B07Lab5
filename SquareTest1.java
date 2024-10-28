package lab4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest1 {

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
    public void testIsSquareWithRandomShape() {
        Point A = new Point(0, 0);
        Point B = new Point(1, 3);
        Point C = new Point(4, 4);
        Point D = new Point(2, 1);
        Square randomShape = new Square(A, B, C, D);
        assertFalse(randomShape.isSquare(), "The points should not form a square.");
    }

    @Test
    public void testIsSquareWithDegenerateCase() {
        Point A = new Point(0, 0);
        Point B = new Point(1, 1);
        Point C = new Point(2, 2);
        Point D = new Point(3, 3);
        Square degenerate = new Square(A, B, C, D);
        assertFalse(degenerate.isSquare(), "The points should not form a square.");
    }

    @Test
    public void testIsSquareWithSamePoints() {
        Point A = new Point(1, 1);
        Point B = new Point(1, 1);
        Point C = new Point(1, 1);
        Point D = new Point(1, 1);
        Square samePoints = new Square(A, B, C, D);
        assertFalse(samePoints.isSquare(), "All points are the same, should not form a square.");
    }

    @Test
    public void testIsSquareWithTwoIdenticalPoints() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 0);
        Point C = new Point(2, 2);
        Point D = new Point(2, 2);
        Square twoIdenticalPoints = new Square(A, B, C, D);
        assertFalse(twoIdenticalPoints.isSquare(), "Two pairs of identical points should not form a square.");
    }

    @Test
    public void testIsSquareWithNegativeCoordinates() {
        Point A = new Point(-1, -1);
        Point B = new Point(-1, 1);
        Point C = new Point(1, 1);
        Point D = new Point(1, -1);
        Square squareWithNegatives = new Square(A, B, C, D);
        assertTrue(squareWithNegatives.isSquare(), "The points should form a square with negative coordinates.");
    }

    @Test
    public void testIsSquareWithEqualSidesDifferentDiagonals() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 2);
        Point C = new Point(2, 3);
        Point D = new Point(2, 1);
        Square shapeWithDifferentDiagonals = new Square(A, B, C, D);
        assertFalse(shapeWithDifferentDiagonals.isSquare(), "Equal sides but different diagonals should not form a square.");
    }

    @Test
    public void testIsSquareWithEqualDiagonalsDifferentSides() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 3);
        Point C = new Point(2, 3);
        Point D = new Point(2, 0);
        Square shapeWithDifferentSides = new Square(A, B, C, D);
        assertFalse(shapeWithDifferentSides.isSquare(), "Equal diagonals but different sides should not form a square.");
    }

    @Test
    public void testIsSquareWithFloatCoordinates() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 2);
        Point C = new Point(2, 2);
        Point D = new Point(2, 0);
        Square square = new Square(A, B, C, D);
        assertTrue(square.isSquare(), "The points with float coordinates should form a square.");
    }

    @Test
    public void testIsSquareWithLargeCoordinates() {
        Point A = new Point(1000000, 1000000);
        Point B = new Point(1000000, 1000002);
        Point C = new Point(1000002, 1000002);
        Point D = new Point(1000002, 1000000);
        Square largeSquare = new Square(A, B, C, D);
        assertTrue(largeSquare.isSquare(), "The points with large coordinates should form a square.");
    }
    
    @Test
    public void testIsSquareWithNearlyEqualSidesAndDiagonals() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 2);
        Point C = new Point(2, 2);
        Point D = new Point(2, 0);
        Square almostSquare = new Square(A, B, new Point(2, 2), new Point(2, 1));
        assertFalse(almostSquare.isSquare(), "Sides and diagonals are close, but it's not a square.");
    }

    @Test
    public void testIsSquareWithMinimalNonSquareDeviation() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 2);
        Point C = new Point(2, 2);
        Point D = new Point(2, 1);
        Square minimalDeviation = new Square(A, B, C, D);
        assertFalse(minimalDeviation.isSquare(), "Minimal deviation should make it non-square.");
    }
    
    @Test
    public void testIsSquareWithCloseButNotEqualSides() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 2);
        Point C = new Point(2, 2);
        Point D = new Point(2, 1);
        Square closeButNotSquare = new Square(A, B, C, D);
        assertFalse(closeButNotSquare.isSquare(), "Sides are close but should not be a square.");
    }

    @Test
    public void testIsSquareWithExactDiagonalMatchButDifferentSides() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 3);
        Point C = new Point(1, 1);
        Point D = new Point(3, 3);
        Square diagonalMatchOnly = new Square(A, B, C, D);
        assertFalse(diagonalMatchOnly.isSquare(), "Diagonals match but sides differ, so not a square.");
    }

    @Test
    public void testIsSquareWithNearlyZeroDistance() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 0);
        Point C = new Point(0, 0);
        Point D = new Point(0, 1);
        Square almostZeroDistance = new Square(A, B, C, D);
        assertFalse(almostZeroDistance.isSquare(), "Points are almost overlapping, so not a square.");
    }

    @Test
    public void testIsSquareWithPermutationOfPoints() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 2);
        Point C = new Point(2, 2);
        Point D = new Point(2, 0);
        
        Square square1 = new Square(A, B, C, D);
        Square square2 = new Square(A, C, D, B);
        Square square3 = new Square(B, A, D, C);
        Square square4 = new Square(D, C, B, A);

        assertTrue(square1.isSquare(), "Permutation 1 should be a square.");
        assertTrue(square2.isSquare(), "Permutation 2 should be a square.");
        assertTrue(square3.isSquare(), "Permutation 3 should be a square.");
        assertTrue(square4.isSquare(), "Permutation 4 should be a square.");
    }

    @Test
    public void testIsSquareWithSingleAxisAlignment() {
        Point A = new Point(0, 0);
        Point B = new Point(1, 0);
        Point C = new Point(2, 0);
        Point D = new Point(3, 0);
        Square collinearPoints = new Square(A, B, C, D);
        assertFalse(collinearPoints.isSquare(), "All points on a single axis should not form a square.");
    }
    
    @Test
    public void testIsSquareWithAlmostZeroDifferenceInDiagonals() {
        Point A = new Point(0, 0);
        Point B = new Point(1, 0);
        Point C = new Point(2, 1);
        Point D = new Point(0, 1);
        Square almostEqualDiagonals = new Square(A, B, C, D);
        assertFalse(almostEqualDiagonals.isSquare(), "Diagonals are very close but should not form a square.");
    }

    @Test
    public void testIsSquareWithNearlySquareButExtremeDifferenceInPoints() {
        Point A = new Point(0, 0);
        Point B = new Point(1, 0);
        Point C = new Point(1, 1);
        Point D = new Point(1000, 1000);
        Square extremePosition = new Square(A, B, C, D);
        assertFalse(extremePosition.isSquare(), "One point extremely distant should not form a square.");
    }

    @Test
    public void testIsSquareWithMinimalFloatingPointDifference() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 1);
        Point C = new Point(1, 1);
        Point D = new Point(1, 0);
        Square nearlySquare = new Square(A, B, C, D);
        assertTrue(nearlySquare.isSquare(), "Points form an almost perfect square, testing floating-point accuracy.");
    }

    @Test
    public void testIsSquareWithRandomOrderEdges() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 2);
        Point C = new Point(2, 2);
        Point D = new Point(2, 0);
        Square shuffledSquare = new Square(C, A, D, B);
        assertTrue(shuffledSquare.isSquare(), "Random order of edges should not affect square determination.");
    }

    @Test
    public void testIsSquareWithFloatingPointPrecision() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 1000);
        Point C = new Point(1000, 1000);
        Point D = new Point(1000, 0);
        Square largePrecisionSquare = new Square(A, B, C, D);
        assertTrue(largePrecisionSquare.isSquare(), "A large square with precise floating points.");
    }
}
