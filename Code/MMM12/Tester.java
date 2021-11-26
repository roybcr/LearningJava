/**
 * Tester class for MMM12.
 *
 * @author Roy Bachar
 * @version 0.0.1
 */

public class Tester {

    
    static int TEST_NO = 0;

    public static void main(String[] args) {

        /** Single Point Tests */

        runSinglePointTests(4, 8);
        runSinglePointTests(new Point(4, 8), 4, 8);
        runSinglePointTests(10, 20);
        runSinglePointTests(0, 0);

        /** Pair Points Tests */

        Point p1 = new Point(4, 8);
        Point p2 = new Point(0, 0);
        Point p3 = new Point(10, 20);

        runPairPointTests(p1, new Point(p1), 4, 8, 4, 8);
        runPairPointTests(p1, p2, 4, 8, 0, 0);
        runPairPointTests(p2, p3, 0, 0, 10, 20);
        runPairPointTests(p3, p1, 10, 20, 4, 8);
    }

    public static void testNo(String id) {
        System.out.println("TEST ID: " + id + "\n\rTEST No: " + (++TEST_NO));
    }

    public static void prnt(int x) {
        String ID = "prntInt";
        testNo(ID);
        System.out.println(x);
    }

    public static void prnt(double x) {
        String ID = "prntDouble";
        testNo(ID);
        System.out.println(x);
    }

    public static void prnt(boolean x) {
        String ID = "prntBool";
        testNo(ID);
        System.out.println(x);
    }

    public static void prnt(String x) {
        String ID = "prntString";
        testNo(ID);
        System.out.println(x);
    }

    public static void prnt(Point x) {
        String ID = "prntPoint";
        testNo(ID);
        System.out.println(x);
    }

    public static void prnt(RectangleA x) {
        String ID = "prntRectangleA";
        testNo(ID);
        System.out.println(x);
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

    public static void runSinglePointTests(int x, int y) {
        Point p = new Point(x, y);
        prnt(p.getX());
        exp(x);
        prnt(p.getY());
        exp(y);
        prnt(p);
        exp("(" + x + "," + y + ")");

        p.setX(x * 2);
        p.setY(y - 3);
        prnt(p.getX());
        exp(x * 2);
        prnt(p.getY());
        exp(y - 3);
        prnt(p);
        exp("(" + (x * 2) + "," + (y - 3) + ")");
    }

    public static void runSinglePointTests(Point point, int x, int y) {
        Point p = new Point(point);
        prnt(p.getX());
        exp(x);
        prnt(p.getY());
        exp(y);
        prnt(p);
        exp("(" + x + "," + y + ")");

        p.setX(x * 2);
        p.setY(y - 3);
        prnt(p.getX());
        exp(x * 2);
        prnt(p.getY());
        exp(y - 3);
        prnt(p);
        exp("(" + (x * 2) + "," + (y - 3) + ")");
    }

    public static void runPairPointTests(Point p1, Point p2, int x1, int y1, int x2, int y2) {

        prnt("\n\rTesting a new pair:\n\r");

        prnt(p1.equals(p2));
        exp(x1 == x2 && y1 == y2);

        prnt(p1 == p2);
        exp("false");

        prnt(p1.isAbove(p2));
        exp(y1 > y2);

        prnt(p1.isLeft(p2));
        exp(x1 < x2);

        prnt(p1.isRight(p2));
        exp(x1 > x2);

        prnt(p1.isUnder(p2));
        exp(y1 < y2);

        prnt(p1.distance(p2));
        exp(Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));

        prnt(p2.equals(p1));
        exp(x1 == x2 && y1 == y2);

        prnt(p2 == p1);
        exp("false");

        prnt(p2.isAbove(p1));
        exp(y2 > y1);

        prnt(p2.isLeft(p1));
        exp(x2 < x1);

        prnt(p2.isRight(p1));
        exp(x2 > x1);

        prnt(p2.isUnder(p1));
        exp(y2 < y1);

        prnt(p2.distance(p1));
        exp(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }
}
