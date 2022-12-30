package exercise;

public class Segment {
    Point point;
    Point point2;

    public Segment(Point point, Point point2) {
        this.point = point;
        this.point2 = point2;
    }

    public Point getBeginPoint() {
        return this.point;
    }

    public Point getEndPoint(){
        return this.point2;
    }

    public Point getMidPoint() {
        return new Point((this.getBeginPoint().getX() + this.getEndPoint().getX()) / 2,
                (this.getBeginPoint().getY() + this.getEndPoint().getY()) / 2);
    }
}

// BEGIN

// END
