/**
 * Point is a class that represents a single point on the Coordinate System.
 *
 * @author Roy Bachar
 * @version 1.0 (25. Nov 2021)
 */

public class Point {
    private int x;
    private int y;


    /*  ---------- Constructors ---------- */
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        this(other.getX(), other.getY());
    }


    /*  ---------- Getters & Setters ---------- */

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    /**
     * Check if this Point is equal to the given Point.
     * 
     * @param other the Point to compare with
     * @return true if the coordinates are equal, 
     *         false otherwise.
     */

    public boolean equals(Point other) {
        return other.getX() == this.getX() && other.getY() == this.getY();
    }

    /**
     * Check if this Point is positioned above the given Point.
     * 
     * @param other the Point to compare with
     * @return true if this y value is greater than the y value of the given Point,
     *         false otherwise.
     */

    public boolean isAbove(Point other) {
        return this.getY() > other.getY();
    }

    /**
     * Check if this Point is positioned below the given Point.
     * 
     * @param other the Point to compare with
     * @return true if the given point is above this Point, 
     *         false otherwise.
     */

    public boolean isUnder(Point other) {
        return other.isAbove(this);
    }

    /**
     * Check if this Point is positioned on the left of the given Point.
     * 
     * @param other the Point to check against
     * @return true if this x value is smaller than the x value of the given Point, 
     *         false otherwise.
     */

    public boolean isLeft(Point other) {
        return this.getX() < other.getX();
    }

    /**
     * Check if this Point is positioned to the right of the given Point.
     * 
     * @param other the Point to check against
     * @return true if given Point is positioned to the left of this Point, 
     *         false otherwise.
     */

    public boolean isRight(Point other) {
        return other.isLeft(this);
    }

    /**
     * Moves a Point by the provided values.
     * 
     * @param deltaX the difference to add to x
     * @param deltaY the difference to add to y
     */

    public void move(int deltaX, int deltaY) {
        int newX = this.getX() + deltaX;
        int newY = this.getY() + deltaY;
        
        this.setX(newX);
        this.setY(newY);
    }

    /**
     * Calculate the distance between this Point to the given Point.
     * 
     * @param other the Point to calculate the distance to
     * @return the distance.
     */

    public double distance(Point other) {
        int xDiff = this.getX() - other.getX();
        int yDiff = this.getY() - other.getY();
        double xDiffPow = Math.pow(xDiff, 2);
        double yDiffPow = Math.pow(yDiff, 2);

        return Math.sqrt(xDiffPow + yDiffPow);
    }

    /**
     * @return a string representation of a Point in the format (x,y).
     */

    public String toString() {
        return "(" + this.getX() + "," + this.getY() + ")";
    }

}
