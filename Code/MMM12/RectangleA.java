/**
 * RectangleA is a class that represents an Axis-aligned rectangle on the Coordinate Plane.
 *
 * @author Roy Bachar
 * @version 1.0 (25. Nov 2021)
 */

public class RectangleA {

  final byte DEFAULT_SIDE_LENGTH = 1, MIN_SIDE_LENGTH = 0;
  private int width;
  private int height;
  private Point pointSW;

  /**
   * Constructs a new Rectangle with the specified width and height,
   * and South-Western vertex on (0,0).
   *
   * @param w The width of the rectangle
   * @param h The height of the rectangle
   */

  public RectangleA(int w, int h) {
    this(new Point(Point.ORIGIN_VAL, Point.ORIGIN_VAL), w, h);
  }

  /**
   * Constructs a new Rectangle with the specified width, height,
   * and a Point object that represents the coordinates of its South-Western vertex.
   * Checks if the accepted width and height are positive and if not, assigns their values
   * to be 1.
   *
   * @param p      The South-Western vertex of the rectangle
   * @param width  The width of the rectangle
   * @param height The height of the rectangle
   */

  public RectangleA(Point p, int w, int h) {
    this.width = w < this.MIN_SIDE_LENGTH ? this.DEFAULT_SIDE_LENGTH : w;
    this.height = h < this.MIN_SIDE_LENGTH ? this.DEFAULT_SIDE_LENGTH : h;
    this.pointSW = new Point(p);
  }

  /**
   * Constructs a new Rectangle with the specified
   * South-West and North-East vertices.
   *
   * @param sw  The South-Western vertex of the rectangle
   * @param ne  The North-Eeastern vertex of the rectangle
   */

  public RectangleA(Point sw, Point ne) {
    this.height = Math.abs(ne.getY() - sw.getY());
    this.width = Math.abs(ne.getX() - sw.getX());
    this.pointSW = new Point(sw);
  }

  /**
   * Copy constructor for RectangleA.
   * Constructs a rectangle using another rectangle.
   *
   * @param r The rectangle from which to construct the new object
   */

  public RectangleA(RectangleA r) {
    this.width = r.getWidth();
    this.height = r.getHeight();
    this.pointSW = new Point(r.getPointSW());
  }

  /**
   * Returns the width of the rectangle.
   *
   * @return The width of the rectangle.
   */

  public int getWidth() {
    return this.width;
  }

  /**
   * Returns the height of the rectangle.
   *
   * @return The height of the rectangle.
   */

  public int getHeight() {
    return this.height;
  }

  /**
   * Returns the South-Western vertex of the rectangle.
   *
   * @return The South-Western vertex of the rectangle
   */

  public Point getPointSW() {
    return new Point(this.pointSW);
  }

  /**
   * Sets the width of the rectangle to the provided width
   * only if the provided width is valid,
   * otherwise, does nothing.
   *
   * @param w The width of the rectangle to set
   */

  public void setWidth(int w) {
    this.width = w < this.MIN_SIDE_LENGTH ? this.width : w;
  }

  /**
   * Sets the height of the rectangle to the provided height
   * only if the provided height is valid,
   * otherwise, does nothing.
   *
   * @param h The height of the rectangle to set
   */

  public void setHeight(int h) {
    this.height = h < this.MIN_SIDE_LENGTH ? this.height : h;
  }

  /**
   * Sets the South-Western vertex of the rectangle to the provided point.
   *
   * @param p The South-Western vertex of the rectangle to set
   */

  public void setPointSW(Point p) {
    this.pointSW = new Point(p);
  }




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
    return (
      this.width == r.getWidth() &&
      this.height == r.getHeight() &&
      this.pointSW.equals(r.getPointSW())
    );
  }

  public double getDiagonalLength() {
    return this.pointSW.distance(this.getPointNE());
  }

  public boolean isLarger(RectangleA other) {
    return this.getArea() > other.getArea();
  }

  public Point getPointNE() {
    return new Point(
      this.pointSW.getX() + this.width,
      this.pointSW.getY() + this.height
    );
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

    return (
      (!this.pointSW.isLeft(rSW) && !this.pointSW.isUnder(rSW)) &&
      (!pointNE.isRight(rNE) && !pointNE.isAbove(rNE))
    );
  }

  public boolean overlap(RectangleA r) {
    if (
      this.getPointNE().isLeft(r.getPointSW()) ||
      r.getPointNE().isLeft(this.pointSW)
    ) return false;
    if (
      this.getPointNE().isUnder(r.getPointSW()) ||
      r.getPointNE().isUnder(this.pointSW)
    ) return false;
    return true;
  }


  /**
   * Returns a string representation of this rectangle.
   *
   * @return A string representation of RectangleA in the format: Width=w Height=h PointSW=(x, y)
   */

  public String toString() {
    return ("Width=" + this.width + " Height=" + this.height + " PointSW" + this.pointSW);
  }
}
