/**
 * Tester class for MMM12.
 *
 * @author Roy Bachar
 * @version 0.0.1
 */

public class Tester {

    static int TEST_NO = 0;

    public static void main(String[] args) {

        runTests();

        /** Single RectangleA Tests */
        // Point rA_SW = new Point(-10, -2);
        // Point rA_NE = new Point(2, 4);

        // Point rB_SW = new Point(-10, -4);
        // Point rB_NE = new Point(-2, 8);

        // Point rC_SW = new Point(-6, 6);
        // Point rC_NE = new Point(2, 10);

        // Point rD_SW = new Point(0, 0);
        // Point rD_NE = new Point(6, 8);

        // RectangleA rA = new RectangleA(rA_SW, 12, 6);
        // RectangleA rB = new RectangleA(rB_SW, rB_NE);
        // RectangleA rC = new RectangleA(rC_SW, 8, 4);
        // RectangleA rD = new RectangleA(6, 8);

        // runSingleRectTests(rA, rA_SW, rA_NE);
        // runSingleRectTests(rB, rB_SW, rB_NE);
        // runSingleRectTests(rC, rC_SW, rC_NE );
        // runSingleRectTests(rD ,rD_SW, rD_NE);

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

        prnt(p1.distance(p2), new String("The Distance between " + p1 + " and " + p2));
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

        prnt(p2.distance(p1), new String("The Distance between " + p2 + " and " + p1));
        exp(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }

    public static void runSingleRectTests(RectangleA r, Point sw, Point ne

    ) {

        Point p = RectangleATester.createPointIntersection(sw, ne);

        System.out.println("Changing sides based on the following :" + "\n\r" +
                "1. current SW: " + r.getPointSW() + " Expected: " + sw + "\n\r" +
                "2. current NE: " + r.getPointNE() + " Expected: " + ne + "\n\r" +
                "3. Current Width: " + r.getWidth() + " Expected: " + ((int) RectangleATester.getDistance(ne, p)) + "\n\r" +
                "4. Current Height: " + r.getHeight() + " Expected: " + ((int) RectangleATester.getDistance(sw, p)) + "\n\r" +
                "5. Current Diagonal Length: " + r.getDiagonalLength() + " Expected: " + (RectangleATester.getDistance(sw, ne)) + "\n\r" +
                "6. Current Perimeter: " + r.getPerimeter() + " Expected: " + (RectangleATester.getPerimeter(((int) RectangleATester.getDistance(ne, p)), ((int) RectangleATester.getDistance(sw, p)))) + "\n\r" +
                "7. Current Area: " + r.getArea() + " Expected: " + (RectangleATester.getArea(((int) RectangleATester.getDistance(ne, p)), ((int) RectangleATester.getDistance(sw, p)))) + "\n\r" +
                "8. Current RectangleA: " + r + "\n\r");

        r.changeSides();
        Point testerNE = new Point(RectangleATester.changePointSides(r.getPointSW(), r.getWidth(), r.getHeight()));
        Point o = RectangleATester.createPointIntersection(sw, testerNE);
        
        System.out.println("Changing sides based on the following :" + "\n\r" +
                "1. New SW: " + r.getPointSW() + " Expected: " + sw + "\n\r" +
                "2. New NE: " + r.getPointNE() + " Expected: " + testerNE + "\n\r" +
                "3. New Width: " + r.getWidth() + " Expected: " + ((int) RectangleATester.getDistance(testerNE, o)) + "\n\r" +
                "4. New Height: " + r.getHeight() + " Expected: " + ((int) RectangleATester.getDistance(sw, o)) + "\n\r" +
                "5. New Diagonal Length: " + r.getDiagonalLength() + " Expected: " + (RectangleATester.getDistance(sw, testerNE)) + "\n\r" +
                "6. New Perimeter: " + r.getPerimeter() + " Expected: " + (RectangleATester.getPerimeter(((int) RectangleATester.getDistance(testerNE, o)), ((int) RectangleATester.getDistance(sw, o)))) + "\n\r" +
                "7. New Area: " + r.getArea() + " Expected: " + (RectangleATester.getArea(((int) RectangleATester.getDistance(testerNE, o)), ((int) RectangleATester.getDistance(sw, o)))) + "\n\r" +
                "8. New RectangleA: " + r + "\n\r");

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
            runSingleRectTests(new RectangleA(sw, ne), sw, ne);
        }
    }


     public static void testNo(String id) {
        System.out.println("TEST ID: " + id + "\n\rTEST No: " + (++TEST_NO));
    }

    public static void prnt(int x, String name) {
        String ID = "prntInt";
        testNo(ID);
        System.out.println(name + " " + x);
    }

    public static void prnt(double x, String name) {
        String ID = "prntDouble";
        testNo(ID);
        System.out.println(name + " " + x);
    }

    public static void prnt(boolean x, String name) {
        String ID = "prntBool";
        testNo(ID);
        System.out.println(name + " " + x);
    }

    public static void prnt(String x, String name) {
        String ID = "prntString";
        testNo(ID);
        System.out.println(name + " " + x);
    }

    public static void prnt(Point x, String name) {
        String ID = "prntPoint";
        testNo(ID);
        System.out.println(name + " " + x);
    }

    public static void prnt(RectangleA x, String name) {
        String ID = "prntRectangleA";
        testNo(ID);
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

}
