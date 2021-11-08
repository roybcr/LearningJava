import java.util.Scanner;

public class Point {
 private int _x, _y;
 private Scanner scan = new Scanner(System.in);

void constructor() {
  int x = scan.nextInt();
  int y = scan.nextInt();
  scan.close();
  this._x = x;
  this._y = y;
 }

 public void move(int deltaX, int deltaY) {
  _x += deltaX;
  _y += deltaY;
  System.out.println("X changed from " + (_x - deltaX) + " to " + _x);
  System.out.println("Y changed from " + (_y - deltaY) + " to " + _y);
 }

 public void printStatus() {
  System.out.println("(" + _x + "," + _y + ")");
 }

 public int returnX() {
  return _x;
 }

}