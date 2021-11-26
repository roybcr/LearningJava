/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester {

  public static void main(String[] args) {
    Point sw1 = new Point(4, 8);
    Point sw2 = new Point(10, 20);

    // Should have SW on (0,0)

    RectangleA r1 = new RectangleA(16, 12);

    // Should be equal to r1

    RectangleA r2 = new RectangleA(r1);

    // Should have width of 16, height of 12, and pointSW on (4,8).

    RectangleA r3 = new RectangleA(sw1, sw2);

    // Should be equal to r3

    RectangleA r4 = new RectangleA(sw1, r3.getWidth(), r3.getHeight());

    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);
    System.out.println(r4);
  }
}
