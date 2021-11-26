/**
 * RectangleA is a class that represents a rectangle whose sides parallel to the
 * x and y axes.
 *
 * @author Roy Bachar
 * @version 1.0 (25. Nov 2021)
 */

public class RectangleA {

    static final byte ORIGIN = 0;
    final byte DEFAULT_SIDE_LENGTH = 1, MIN_SIDE_LENGTH = 0;
    private int width;
    private int height;
    private Point pointSW;

    /**
     * Constructs a new RectangleA with the specified width and height, and position
     * its bottom left point on the origin.
     *
     * @param width  the width of the rectangle
     * @param height the height of the rectangle
     */

    // ====== Constructor No. 1 ====== //

    public RectangleA(int w, int h) {
        this(new Point(ORIGIN, ORIGIN), w, h);
    }

    /**
     * Constructs a new RectangleA with the specified Point, width and height.
     * Checks if the width and height are positive and if not, assigns their values
     * to the default.
     *
     * @param p      the bottom left point of the rectangle
     * @param width  the width of the rectangle
     * @param height the height of the rectangle
     */

    // ====== Constructor No. 2 ====== //

    public RectangleA(Point p, int w, int h) {
        this.width = w < this.MIN_SIDE_LENGTH ? this.DEFAULT_SIDE_LENGTH : w;
        this.height = h < this.MIN_SIDE_LENGTH ? this.DEFAULT_SIDE_LENGTH : h;
        this.pointSW = new Point(p);
    }

    /**
     * Calculates the width and height of the rectangle based on the NE and SW
     * distances.
     */

    // ====== Constructor No. 3 ====== //

    public RectangleA(Point sw, Point ne) {
        Point pointSE = new Point(ne.getX(), sw.getY());

        int horizontalDist = (int) (sw.distance(pointSE));
        int verticalDist = (int) (pointSE.distance(ne));

        this.pointSW = new Point(sw);
        this.width = horizontalDist < this.MIN_SIDE_LENGTH ? DEFAULT_SIDE_LENGTH : horizontalDist;
        this.height = verticalDist < this.MIN_SIDE_LENGTH ? DEFAULT_SIDE_LENGTH : verticalDist;
    }

    // ====== Constructor No. 4 ====== //

    public RectangleA(RectangleA r) {
        this(r.getPointSW(), r.getWidth(), r.getHeight());
    }

    // ===== Getters and Setters ===== //

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public Point getPointSW() {
        return new Point(this.pointSW);
    }

    public void setWidth(int w) {
        if (!(w < this.MIN_SIDE_LENGTH))
            this.width = w;
    }

    public void setHeight(int h) {
        if (!(h < this.MIN_SIDE_LENGTH))
            this.height = h;
    }

    public void setPointSW(Point p) {
        this.pointSW = new Point(p);
    }

    // ===== Class methods ===== //

    public int getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public int getArea() {
        return this.width * this.height;
    }

    public void move(int deltaX, int deltaY) {
        this.pointSW.move(deltaX, deltaY);
    }

    public boolean equals(RectangleA r) {
        return (this.width == r.getWidth() && this.height == r.getHeight() && this.pointSW.equals(r.getPointSW()));
    }

    public double getDiagonalLength() {
        double diagonalPow = ((Math.pow(this.height, 2) + Math.pow(this.width, 2)));
        return Math.sqrt(diagonalPow);
    }

    public boolean isLarger(RectangleA other) {
        return this.getArea() > other.getArea();
    }

    public Point getPointNE() {
        Point ne = new Point(this.pointSW);
        ne.move(this.width, this.height);
        return ne;
    }

    public void changeSides() {
        int temp = this.width;
        this.setWidth(this.height);
        this.setHeight(temp);
    }

    public boolean isIn(RectangleA r) {
        Point pointNE = this.getPointNE();
        Point rNE = r.getPointNE();
        Point rSW = r.getPointSW();

        return ((!this.pointSW.isLeft(rSW) && !this.pointSW.isUnder(rSW))
                && (!pointNE.isRight(rNE) && !pointNE.isAbove(rNE)));
    }

    public boolean overlap(RectangleA r) {
        if (this.getPointNE().isLeft(r.getPointSW()) || r.getPointNE().isLeft(this.pointSW))
            return false;
        if (this.getPointNE().isUnder(r.getPointSW()) || r.getPointNE().isUnder(this.pointSW))
            return false;
        return true;
    }

    public String toString() {
        return ("Width=" + this.width + " Height=" + this.height + " PointSW" + this.pointSW);
    }
}
