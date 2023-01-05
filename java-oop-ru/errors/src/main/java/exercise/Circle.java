package exercise;

public class Circle {
    private Point point;
    private int radius;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public int getRadius() throws NegativeRadiusException {
        if (this.radius < 0) {
            throw new NegativeRadiusException("Не удалось посчитать площадь");
        }
        return radius;
    }

    public double getSquare() throws NegativeRadiusException {
        double PI = Math.PI;
        return PI * Math.pow(this.getRadius(), 2);
    }
}
// BEGIN

// END
