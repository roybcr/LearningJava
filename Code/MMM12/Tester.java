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

        /** Single RectangleA Tests */
        Point rA_SW = new Point(-10, -2);
        Point rA_NE = new Point(2, 4);
        int rA_width = 12;
        int rA_height = 6;
        double rA_Diagonal = 13.416407864998739;
        int rA_perimeter = 36;
        int rA_area = 72;

        Point rB_SW = new Point(-10, -4);
        Point rB_NE = new Point(-2, 8);
        int rB_width = 8;
        int rB_height = 4;
        double rB_Diagonal = 9.848857801796104;
        int rB_perimeter = 24;
        int rB_area = 32;

        Point rC_SW = new Point(-6, 6);
        Point rC_NE = new Point(2, 10);
        int rC_width = 8;
        int rC_height = 4;
        double rC_Diagonal = 8.94427190999916;
        int rC_perimeter = 24;
        int rC_area = 32;

        Point rD_SW = new Point(0, 0);
        Point rD_NE = new Point(6, 8);
        int rD_width = 6;
        int rD_height = 8;
        double rD_Diagonal = 10.0;
        int rD_perimeter = 28;
        int rD_area = 48;

        RectangleA rA = new RectangleA(rA_SW, 12, 6);
        RectangleA rB = new RectangleA(rB_SW, 8, 4);
        RectangleA rC = new RectangleA(rC_SW, 8, 4);
        RectangleA rD = new RectangleA(8, 6);

        System.out.println(
                "========================================= RectangleA ============================================");

        runSingleRectTests(rA, rA_width, rA_height, rA_SW, rA_NE, rA_Diagonal, rA_perimeter, rA_area);
        runSingleRectTests(rB, rB_width, rB_height, rB_SW, rB_NE, rB_Diagonal, rB_perimeter, rB_area);
        runSingleRectTests(rC, rC_width, rC_height, rC_SW, rC_NE, rC_Diagonal, rC_perimeter, rC_area);
        runSingleRectTests(rD, rD_width, rD_height, rD_SW, rD_NE, rD_Diagonal, rD_perimeter, rD_area);
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

    public static void runSingleRectTests(RectangleA r, int w, int h, Point sw, Point ne, double diagonal,
            int perimeter,
            int area) {
        prnt(r.getWidth());
        exp(w);

        prnt(r.getHeight());
        exp(h);

        prnt(r.getPointSW());
        exp(sw);

        prnt(r.getPerimeter());
        exp(perimeter);

        prnt(r.getArea());
        exp(area);

        prnt(r.getDiagonalLength());
        exp(diagonal);

        prnt(r.getPointNE());
        exp(ne);

        r.changeSides();

        prnt(r.getPointSW());
        exp(ne);

        prnt(r.getPointNE());
        exp(sw);

    }
}
