/**
 * RectangleB is a class that represents an Axis-aligned rectangle on the
 * Coordinate Plane.
 *
 * @author Roy Bachar
 * @version 1.0 (25. Nov 2021)
 */

public class RectangleB {

  final byte DEFAULT_SIDE_LENGTH = 1, MIN_SIDE_LENGTH = 0;
  private Point pointSW;
  private Point pointNE;

  /**
   * Constructs a new RectangleB with the specified width and height,
   * and South-Western vertex on (0,0).
   *
   * @param width The width of the rectangle
   * @param height The height of the rectangle
   */

  public RectangleB(int width, int height) {
    this(new Point(Point.ORIGIN_VAL, Point.ORIGIN_VAL), width, height);
  }

  /**
   * Constructs a new RectangleB with the specified South-Western vertex,
   * and the North-Eastern vertex based on the provided width and height.
   * Checks if the accepted width and height are positive and if not, assigns
   * their values to be 1.
   *
   * @param p      The South-Western vertex of the rectangle
   * @param width  The width of the rectangle
   * @param height The height of the rectangle
   */

  public RectangleB(Point p, int w, int h) {
    w = w < this.MIN_SIDE_LENGTH ? this.DEFAULT_SIDE_LENGTH : w;
    h = h < this.MIN_SIDE_LENGTH ? this.DEFAULT_SIDE_LENGTH : h;
    this.pointSW = new Point(p);
    this.pointNE = new Point(p.getX() + w, p.getY() + h);
  }

  /**
   * Constructs a new Rectangle with the specified
   * South-West and North-East vertices.
   *
   * @param sw The South-Western vertex of the rectangle
   * @param ne The North-Eastern vertex of the rectangle
   */

  public RectangleB(Point sw, Point ne) {
    this.pointSW = new Point(sw);
    this.pointNE = new Point(ne);
  }

  /**
   * Copy constructor for RectangleB.
   * Constructs a rectangle using another rectangle.
   *
   * @param r The rectangle from which to construct the new object
   */

  public RectangleB(RectangleB r) {
    this(r.getPointSW(), r.getPointNE());
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
   * Sets the South-Western vertex of the rectangle to the provided point.
   * Moves the North-Eastern vertex in corresponding to the new position of pointSW.
   *
   * @param p The South-Western vertex of the rectangle to set
   */

  public void setPointSW(Point p) {
    int xDiff = p.getX() - this.pointSW.getX();
    int yDiff = p.getY() - this.pointSW.getY();
    this.move(xDiff, yDiff);
  }

  /**
   * Returns the North-Eastern vertex of the rectangle.
   *
   * @return The North-Eastern vertex of the rectangle
   */

  public Point getPointNE() {
    return new Point(this.pointNE);
  }

  /**
   * Returns the width of the rectangle.
   *
   * @return The width of the rectangle.
   */

  public int getWidth() {
    return this.pointNE.getX() - this.pointSW.getX();
  }

  /**
   * Returns the height of the rectangle.
   *
   * @return The height of the rectangle.
   */

  public int getHeight() {
    return this.pointNE.getY() - this.pointSW.getY();
  }

  /**
   * Calculates the perimeter of the rectangle.
   *
   * @return The perimeter of the rectangle.
   */

  public int getPerimeter() {
    return (this.getWidth() + this.getHeight()) * 2;
  }

  /**
   * Calculates the area of the rectangle.
   *
   * @return The area of the rectangle.
   */

  public int getArea() {
    return this.getWidth() * this.getHeight();
  }

  /**
   * Moves the x coordinate of the South-Western & North-Eastern vertices by deltaX and the y
   * coordinate by deltaY.
   *
   * @param deltaX The amount to move the rectangle along the X axis
   * @param deltaY The amount to move the rectangle along the Y axis
   */

  public void move(int deltaX, int deltaY) {
    this.pointSW.move(deltaX, deltaY);
    this.pointNE.move(deltaX, deltaY);
  }

  /**
   * Sets the width of the rectangle to the provided width
   * only if the provided width is valid,
   * otherwise, does nothing.
   *
   * @param w The width of the rectangle to set
   */

  public void setWidth(int w) {
    if (w >= this.MIN_SIDE_LENGTH) {
      this.pointNE.setX(this.pointSW.getX() + w);
    }
  }

  /**
   * Sets the height of the rectangle to the provided height
   * only if the provided height is valid,
   * otherwise, does nothing.
   *
   * @param h The height of the rectangle to set
   */

  public void setHeight(int h) {
    if (h >= this.MIN_SIDE_LENGTH) {
      this.pointNE.setY(this.pointSW.getY() + h);
    }
  }

  /**
   * Checks if two rectangles are equal.
   *
   * @param other The Rectangle to compare to
   * @return true If the given rectangle is equal to this rectangle
   */

  public boolean equals(RectangleB other) {
    return (
      this.pointNE.equals(other.getPointNE()) &&
      this.pointSW.equals(other.getPointSW())
    );
  }

  /**
   * Calculates the diagonal of the rectangle.
   *
   * @return The diagonal length of this rectangle
   */

  public double getDiagonalLength() {
    return this.pointSW.distance(this.pointNE);
  }

  /**
   * Checks if the area of this rectangle is larger than the area of the given
   * rectangle.
   *
   * @param other The Rectangle to compare to
   * @return true If the given rectangle is equal to this rectangle
   */

  public boolean isLarger(RectangleB other) {
    return this.getArea() > other.getArea();
  }

  /**
   * Switches between the width and the height of the rectangle.
   */

  public void changeSides() {
    int temp = this.getWidth();
    this.setWidth(this.getHeight());
    this.setHeight(temp);
  }

  /**
   * Returns true if this rectangle is inside the given rectangle
   *
   * @param r The rectangle to check with
   * @return true If this rectangle is inside the given rectangle
   */

  public boolean isIn(RectangleB r) {
    Point rNE = r.getPointNE();
    Point rSW = r.getPointSW();

    return (
      (!this.pointSW.isLeft(rSW) && !this.pointSW.isUnder(rSW)) &&
      (!this.pointNE.isRight(rNE) && !this.pointNE.isAbove(rNE))
    );
  }

  /**
   * Returns true if this rectangle is overlaps with the given rectangle
   *
   * @param r The rectangle to check with
   * @return true If this rectangle overlaps with the given rectangle, false
   *         otherwise
   */

  public boolean overlap(RectangleB r) {
    if (
      this.pointNE.isLeft(r.getPointSW()) || r.getPointNE().isLeft(this.pointSW)
    ) return false;
    if (
      this.pointNE.isUnder(r.getPointSW()) ||
      r.getPointNE().isUnder(this.pointSW)
    ) return false;

    return true;
  }

  /**
   * Returns a string representation of this rectangle.
   *
   * @return A string representation of RectangleB in the format:
   * Width=w Height=h PointSW=(x, y)
   */

  public String toString() {
    return (
      "Width=" +
      this.getWidth() +
      " Height=" +
      this.getHeight() +
      " PointSW=" +
      this.pointSW
    );
  }
}
