/**
 * Point is a class that represents a single point on the Coordinate System.
 *
 * @author Roy Bachar
 * @version 1.0 (25. Nov 2021)
 */

public class Point {

  // ORIGIN_VAL is a static constant that represents the origin (0,0).
  static final byte ORIGIN_VAL = 0;

  private int x;
  private int y;

  /**
   * Contructs a Point object with the given x and y coordinates.
   *
   * @param x The x coordinate
   * @param y The y coordinate
   */

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Copy constructor for Point.
   * Constructs a new Point with the coordinates from the given Point.
   *
   * @param other The Point object from which to construct the new Point
   */

  public Point(Point other) {
    this(other.getX(), other.getY());
  }

  /**
   * Returns the x coordinate of the Point.
   *
   * @return The x coordinate of this Point
   */

  public int getX() {
    return this.x;
  }

  /**
   * Returns the y coordinate of the Point.
   *
   * @return The y coordinate of this Point
   */

  public int getY() {
    return this.y;
  }

  /**
   * Sets the x coordinate of the Point.
   *
   * @param num A new value for the X coordinate
   */

  public void setX(int num) {
    this.x = num;
  }

  /**
   * Sets the y coordinate of the Point.
   *
   * @param num A new value for the Y coordinate
   */

  public void setY(int num) {
    this.y = num;
  }

  /**
   * Checks if two points are equal.
   *
   * @param other The Point to be compare with this Point
   * @return true if the coordinates are equal
   */

  public boolean equals(Point other) {
    return other.getX() == this.x && other.getY() == this.y;
  }

  /**
   * Checks if this Point is above the given Point.
   *
   * @param other The Point to compare with
   * @return true if this y value is greater than the y value of the given Point
   */

  public boolean isAbove(Point other) {
    return this.y > other.getY();
  }

  /**
   * Checks if this Point is below the given Point.
   *
   * @param other The Point to compare with
   * @return true if the given point is above this Point
   */

  public boolean isUnder(Point other) {
    return other.isAbove(this);
  }

  /**
   * Checks if this Point is on the left of the given Point.
   *
   * @param other The Point to check against
   * @return true if this Point is to the left of the given Point
   */

  public boolean isLeft(Point other) {
    return this.x < other.getX();
  }

  /**
   * Checks if this Point is on the right of the given Point.
   *
   * @param other The Point to check against
   * @return true if this Point is to the right of the given Point
   */

  public boolean isRight(Point other) {
    return other.isLeft(this);
  }

  /**
   * Moves the x coordinate by deltaX and the y coordinate by deltaY.
   *
   * @param deltaX The amount to move the current point along the X axis
   * @param deltaY The amount to move the current point along the Y axis
   */

  public void move(int deltaX, int deltaY) {
    int newX = this.x + deltaX;
    int newY = this.y + deltaY;

    this.setX(newX);
    this.setY(newY);
  }

  /**
   * Returns the distance between this Point to the given Point.
   *
   * @param p The Point to calculate the distance to
   * @return The distane from this Point to the given Point
   */

  public double distance(Point p) {
    int xDist = this.x - p.getX();
    int yDist = this.y - p.getY();

    double xDistPow = Math.pow(xDist, 2);
    double yDistPow = Math.pow(yDist, 2);

    return Math.sqrt(xDistPow + yDistPow);
  }

  /**
   * Returns a string representation of this Point.
   *
   * @return A string representation of a Point in the format: (x,y)
   */

  public String toString() {
    return "(" + this.x + "," + this.y + ")";
  }
}
