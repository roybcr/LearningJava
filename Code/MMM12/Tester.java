/**
 * Tester class for MMM12.
 *
 * @author Roy Bachar
 * @version 0.0.1
 */

public class Tester {

  static int TEST_NO = 0;

  public static void testNo(String id) {
    System.out.println("TEST ID: " + id + "\n\rTEST No: " + (++TEST_NO));
  }

  public static void prnt(int x, String name) {
    System.out.println(name + " " + x);
  }

  public static void prnt(double x, String name) {
    System.out.println(name + " " + x);
  }

  public static void prnt(boolean x, String name) {
    System.out.println(name + " " + x);
  }

  public static void prnt(String x, String name) {
    System.out.println(name + " " + x);
  }

  public static void prnt(Point x, String name) {
    System.out.println(name + " " + x);
  }

  public static void prnt(RectangleA x, String name) {
    System.out.println(name + " " + x);
  }

  public static void prnt(RectangleB x, String name) {
    System.out.println(name + " " + x);
  }

  public static void exp(int val) {
    System.out.println("Expected: " + val + "\n\r");
  }

  public static void exp(double val) {
    System.out.println("Expected: " + val + "\n\r");
  }

  public static void exp(boolean val) {
    System.out.println("Expected: " + val + "\n\r");
  }

  public static void exp(String val) {
    System.out.println("Expected: " + val + "\n\r");
  }

  public static void exp(Point val) {
    System.out.println("Expected: " + val + "\n\r");
  }

  public static void exp(RectangleA val) {
    System.out.println("Expected: " + val + "\n\r");
  }

  public static void exp(RectangleB val) {
    System.out.println("Expected: " + val + "\n\r");
  }

  public static void main(String[] args) {
    RectangleB a = new RectangleB(new Point(2, 1), new Point(7, 5));
    RectangleB b = new RectangleB(new Point(4, 2), new Point(6, 3));
    RectangleB c = new RectangleB(new Point(3, 4), new Point(5, 9));
    RectangleB d = new RectangleB(new Point(1, 5), new Point(2, 7));
    RectangleB e = new RectangleB(new Point(9, 3), new Point(11, 5));

    runSingleRectTests(a, new Point(2, 1), new Point(7, 5));
    runSingleRectTests(b, new Point(4, 2), new Point(6, 3));
    runSingleRectTests(c, new Point(3, 4), new Point(5, 9));
    runSingleRectTests(d, new Point(1, 5), new Point(2, 7));
    runSingleRectTests(e, new Point(9, 3), new Point(11, 5));

    prnt(a.overlap(b), "A overlaps with B");
    exp(true);
    prnt(a.overlap(c), "A overlaps with C");
    exp(true);
    prnt(a.overlap(d), "A overlaps with D");
    exp(true);
    prnt(a.overlap(e), "A overlaps with E");
    exp(false);

    prnt(b.overlap(a), "B overlaps with A");
    exp(true);
    prnt(b.overlap(c), "B overlaps with C");
    exp(false);
    prnt(b.overlap(d), "B overlaps with D");
    exp(false);
    prnt(b.overlap(e), "B overlaps with E");
    exp(false);

    prnt(c.overlap(a), "C overlaps with A");
    exp(true);
    prnt(c.overlap(b), "C overlaps with B");
    exp(false);
    prnt(c.overlap(d), "C overlaps with D");
    exp(false);
    prnt(c.overlap(e), "C overlaps with E");
    exp(false);

    prnt(d.overlap(a), "D overlaps with A");
    exp(true);
    prnt(d.overlap(b), "D overlaps with B");
    exp(false);
    prnt(d.overlap(c), "D overlaps with C");
    exp(false);
    prnt(d.overlap(e), "D overlaps with E");
    exp(false);

    prnt(e.overlap(a), "E overlaps with A");
    exp(false);
    prnt(e.overlap(b), "E overlaps with B");
    exp(false);
    prnt(e.overlap(c), "E overlaps with C");
    exp(false);
    prnt(e.overlap(d), "E overlaps with D");
    exp(false);

    prnt(a.isIn(b), "A is in with B");
    exp(false);
    prnt(a.isIn(c), "A is in with C");
    exp(false);
    prnt(a.isIn(d), "A is in with D");
    exp(false);
    prnt(a.isIn(e), "A is in with E");
    exp(false);

    prnt(b.isIn(a), "B is in with A");
    exp(true);
    prnt(b.isIn(c), "B is in with C");
    exp(false);
    prnt(b.isIn(d), "B is in with D");
    exp(false);
    prnt(b.isIn(e), "B is in with E");
    exp(false);

    prnt(c.isIn(a), "C is in with A");
    exp(false);
    prnt(c.isIn(b), "C is in with B");
    exp(false);
    prnt(c.isIn(d), "C is in with D");
    exp(false);
    prnt(c.isIn(e), "C is in with E");
    exp(false);

    prnt(d.isIn(a), "D is in with A");
    exp(false);
    prnt(d.isIn(b), "D is in with B");
    exp(false);
    prnt(d.isIn(c), "D is in with C");
    exp(false);
    prnt(d.isIn(e), "D is in with E");
    exp(false);

    prnt(e.isIn(a), "E is in with A");
    exp(false);
    prnt(e.isIn(b), "E is in with B");
    exp(false);
    prnt(e.isIn(c), "E is in with C");
    exp(false);
    prnt(e.isIn(d), "E is in with D");
    exp(false);

    prnt(a.isLarger(b), "A is larger than B");
    exp(true);
    prnt(a.isLarger(c), "A is larger than C");
    exp(true);
    prnt(a.isLarger(d), "A is larger than D");
    exp(true);
    prnt(a.isLarger(e), "A is larger than E");
    exp(true);

    prnt(b.isLarger(a), "B is larger than A");
    exp(false);
    prnt(b.isLarger(c), "B is larger than C");
    exp(false);
    prnt(b.isLarger(d), "B is larger than D");
    exp(false);
    prnt(b.isLarger(e), "B is larger than E");
    exp(false);

    prnt(c.isLarger(a), "C is larger than A");
    exp(false);
    prnt(c.isLarger(b), "C is larger than B");
    exp(true);
    prnt(c.isLarger(d), "C is larger than D");
    exp(true);
    prnt(c.isLarger(e), "C is larger than E");
    exp(true);

    prnt(d.isLarger(a), "D is larger than A");
    exp(false);
    prnt(d.isLarger(b), "D is larger than B");
    exp(false);
    prnt(d.isLarger(c), "D is larger than C");
    exp(false);
    prnt(d.isLarger(e), "D is larger than E");
    exp(false);

    prnt(e.isLarger(a), "E is larger than A");
    exp(false);
    prnt(e.isLarger(b), "E is larger than B");
    exp(true);
    prnt(e.isLarger(c), "E is larger than C");
    exp(false);
    prnt(e.isLarger(d), "E is larger than D");
    exp(true);
  }

  public static void runTests() {
      
    int x = 0;
    int y = 0;
    int w = 0;
    int h = 0;
    Point sw = null;
    Point ne = null;

    for (int i = 0; i < 4; i++) {
      x = (int) (Math.random() * (i % 2 == 0 ? -100 : 100));
      y = (int) (Math.random() * (i % 2 == 0 ? 100 : -100));
      w = (int) (Math.random() * 100);
      h = (int) (Math.random() * 100);
      sw = new Point(x, y);
      ne = new Point(x + w, y + h);

      runSinglePointTests(x, y);
      runSinglePointTests(sw, x, y);
      runPairPointTests(sw, ne, x, y, x + w, y + h);
      runSingleRectTests(new RectangleB(sw, ne), sw, ne);
    }
  }

  public static void runSingleRectTests(RectangleB r, Point sw, Point ne) {

      Point p = RectangleBTester.createPointIntersection(sw, ne);
      System.out.println("Changing sides based on the following :" + "\n\r" +
            "1. current SW: " + r.getPointSW() + " Expected: " + sw + "\n\r" +
            "2. current NE: " + r.getPointNE() + " Expected: " + ne + "\n\r" +
            "3. Current Width: " + r.getWidth() + " Expected: " + ((int) RectangleBTester.getDistance(ne, p)) + "\n\r" +
            "4. Current Height: " + r.getHeight() + " Expected: " + ((int) RectangleBTester.getDistance(sw, p)) + "\n\r" +
            "5. Current Diagonal Length: " + r.getDiagonalLength() + " Expected: " + (RectangleBTester.getDistance(sw, ne)) + "\n\r" +
            "6. Current Perimeter: " + r.getPerimeter() + " Expected: " + (RectangleBTester.getPerimeter(((int) RectangleBTester.getDistance(ne, p)), ((int) RectangleBTester.getDistance(sw, p)))) + "\n\r" +
            "7. Current Area: " + r.getArea() + " Expected: " + (RectangleBTester.getArea(((int) RectangleBTester.getDistance(ne, p)), ((int) RectangleBTester.getDistance(sw, p)))) + "\n\r" +
            "8. Current RectangleA: " + r + "\n\r");


    r.changeSides();
    Point testerNE = new Point(RectangleBTester.changePointSides(r.getPointSW(), r.getWidth(), r.getHeight()));
    Point o = RectangleBTester.createPointIntersection(sw, testerNE);
    System.out.println("Changing sides based on the following :" + "\n\r" +
            "1. New SW: " + r.getPointSW() + " Expected: " + sw + "\n\r" +
            "2. New NE: " + r.getPointNE() + " Expected: " + testerNE + "\n\r" +
            "3. New Width: " + r.getWidth() + " Expected: " + ((int) RectangleBTester.getDistance(testerNE, o)) + "\n\r" +
            "4. New Height: " + r.getHeight() + " Expected: " + ((int) RectangleBTester.getDistance(sw, o)) + "\n\r" +
            "5. New Diagonal Length: " + r.getDiagonalLength() + " Expected: " + (RectangleBTester.getDistance(sw, testerNE)) + "\n\r" +
            "6. New Perimeter: " + r.getPerimeter() + " Expected: " + (RectangleBTester.getPerimeter(((int) RectangleBTester.getDistance(testerNE, o)), ((int) RectangleBTester.getDistance(sw, o)))) + "\n\r" +
            "7. New Area: " + r.getArea() + " Expected: " + (RectangleBTester.getArea(((int) RectangleBTester.getDistance(testerNE, o)), ((int) RectangleBTester.getDistance(sw, o)))) + "\n\r" +
            "8. New RectangleA: " + r + "\n\r");

    }


  public static void runPairPointTests(Point p1, Point p2, int x1, int y1, int x2, int y2) {

    prnt(p1.equals(p2), new String(p1 + " Equals " + p2));
    exp(x1 == x2 && y1 == y2);

    prnt(p1 == p2, new String(p1.hashCode() + " == " + p2.hashCode()));
    exp("false");

    prnt(p1.isAbove(p2), new String(p1.getY() + " > " + p2.getY()));
    exp(y1 > y2);

    prnt(p1.isLeft(p2), new String(p1.getX() + " < " + p2.getX()));
    exp(x1 < x2);

    prnt(p1.isRight(p2), new String(p1.getX() + " > " + p2.getX()));
    exp(x1 > x2);

    prnt(p1.isUnder(p2), new String(p1.getY() + " < " + p2.getY()));
    exp(y1 < y2);

    prnt(p1.distance(p2), new String("Distance from " + p1 + " to " + p2));
    exp(Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));

    prnt(p2.equals(p1), new String(p2 + " Equals " + p1));
    exp(x1 == x2 && y1 == y2);

    prnt(p2 == p1, new String(p2.hashCode() + " == " + p1.hashCode()));
    exp("false");

    prnt(p2.isAbove(p1), new String(p2.getY() + " > " + p1.getY()));
    exp(y2 > y1);

    prnt(p2.isLeft(p1), new String(p2.getX() + " < " + p1.getX()));
    exp(x2 < x1);

    prnt(p2.isRight(p1), new String(p2.getX() + " > " + p1.getX()));
    exp(x2 > x1);

    prnt(p2.isUnder(p1), new String(p2.getY() + " < " + p1.getY()));
    exp(y2 < y1);

    prnt(p2.distance(p1), new String("Distance from " + p2 + " to " + p1));
    exp(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
  }


  public static void runSinglePointTests(int x, int y) {
    Point p = new Point(x, y);
    prnt(p.getX(), "X");
    exp(x);
    prnt(p.getY(), "Y");
    exp(y);
    prnt(p, "Point");
    exp("(" + x + "," + y + ")");

    p.setX(x * 2);
    p.setY(y - 3);
    prnt(p.getX(), "X");
    exp(x * 2);
    prnt(p.getY(), "Y");
    exp(y - 3);
    prnt(p, "Point");
    exp("(" + (x * 2) + "," + (y - 3) + ")");
  }

  public static void runSinglePointTests(Point point, int x, int y) {
    Point p = new Point(point);
    prnt(p.getX(), "X");
    exp(x);
    prnt(p.getY(), "Y");
    exp(y);
    prnt(p, "Point");
    exp("(" + x + "," + y + ")");

    p.setX(x * 2);
    p.setY(y - 3);
    prnt(p.getX(), "X");
    exp(x * 2);
    prnt(p.getY(), "Y");
    exp(y - 3);
    prnt(p, "Point");
    exp("(" + (x * 2) + "," + (y - 3) + ")");
  }
}
