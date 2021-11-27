/**
 * Helper methods for testing.
 *
 * @author Roy Bachar
 * @version 0.0.1
 */

public class RectangleBTester {

  public static double pythagorean(double a, double b) {
    return Math.sqrt(a * a + b * b);
  }

  public static int getArea(int width, int height) {
    return width * height;
  }

  public static int getPerimeter(int width, int height) {
    return (width + height) * 2;
  }

  public static double getDistance(Point p1, Point p2) {
    return Math.sqrt(
      Math.pow((p1.getX() - p2.getX()), 2) +
      Math.pow((p1.getY() - p2.getY()), 2)
    );
  }

  public static boolean isLarger(RectangleA r, RectangleA e) {
    return r.getArea() > e.getArea();
  }

  public static boolean checkPointNE(Point result, Point target) {
    return result.getX() == target.getX() && result.getY() == target.getY();
  }

  public static Point createPointIntersection(Point p1, Point p2) {
    return new Point(p1.getX(), p2.getY());
  }

  public static Point changePointSides(Point p, int width, int height) {
    return new Point((p.getX() + width), (p.getY() + height));
  }
}
