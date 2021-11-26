/**
 * RectangleA is a class that represents a rectangle whose sides parallel to the
 * x and y axes.
 *
 * @author Roy Bachar
 * @version 1.0 (25. Nov 2021)
 */

public class RectangleA {

    final static byte ORIGIN = 0;
    final byte DEFAULT_SIDE_LENGTH = 1;
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
        this.width = w < 0 ? this.DEFAULT_SIDE_LENGTH : w;
        this.height = h < 0 ? this.DEFAULT_SIDE_LENGTH : h;
        this.pointSW = new Point(p);

    }
    
    
    /**
     * Calculates the width and height of the rectangle based on the NE and SW
     * distances.
     */
    
    // ====== Constructor No. 3 ====== // 

    public RectangleA(Point sw, Point ne) {
        Point pointSW = new Point(sw);
        Point pointNE = new Point(ne);
        Point pointSE = new Point(ne.getX(), sw.getY());

        int distanceSWSE = (int) (pointSW.distance(pointSE));
        int distanceSENE = (int) (pointSE.distance(pointNE));

        this.width = distanceSWSE < 0 ? DEFAULT_SIDE_LENGTH : distanceSWSE;
        this.height = distanceSENE < 0 ? DEFAULT_SIDE_LENGTH : distanceSENE;
        this.pointSW = pointSW;
    }


    // ====== Constructor No. 4 ====== // 

    public RectangleA(RectangleA r) {
        this(r.getPointSW(), r.getWidth(), r.getHeight());
    }



    public Point getPointSE(int xNE, int ySW) {
        return new Point(xNE, ySW);
    }

    public Point getPointNW(int yNE, int xSW) {
        return new Point(xSW, yNE);
    }


    /**
     * @return the width of this Rectangle.
     */

    public int getWidth() {
        return this.width;
    }

    /**
     * @return the height of this Rectangle.
     */

    public int getHeight() {
        return this.height;
    }

    /**
     * @return the PointSW of this Rectangle.
     */

    public Point getPointSW() {
        return new Point(this.pointSW);
    }

    public String toString() {
        return ("Width=" + this.width + " Height=" + this.height + " PointSW" + this.pointSW);
    }

}
