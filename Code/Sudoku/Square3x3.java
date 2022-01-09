/**
 * This class represents a 2D array of integers of the size 3x3.
 *
 * @author Roy Bachar
 * @version (10.12.21)
 */

public class Square3x3 {

  // Class variables.
  public final static byte WHOS_THERE_SIZE = 10;

  // Instance variables.
  private int[][] _square3x3 = new int[this.SIZE][this.SIZE];
  private final int DEFAULT_VALUE = -1, SIZE = 3;

  /**
   * Construct and initializes a 2D array of the size 3x3 with the values of -1 in
   * each cell.
   */

  public Square3x3() {
    for (int i = 0; i < this.SIZE; i++)
      for (int j = 0; j < this.SIZE; j++)
        this._square3x3[i][j] = this.DEFAULT_VALUE;
  }

  /**
   * Construct a 2D array of the size 3x3 whose values are taken from the given
   * array.
   * If the given array is bigger than 3x3, only the first 3x3 cell values are
   * taken.
   * If the given array is smaller, the rest of the cells are initialized to -1.
   */

  public Square3x3(int[][] array) {
    this();
    for (int i = 0; i < array.length && i < this.SIZE; i++)
      for (int j = 0; j < array[i].length; j++)
        this._square3x3[i][j] = array[i][j];
  }

  /**
   * Copy constructor.
   * Constructs a 2D array of size 3x3 whose values are copied from the array of
   * the given Square3x3 object.
   */

  public Square3x3(Square3x3 other) {
    for (int i = 0; i < this.SIZE; i++)
      for (int j = 0; j < this.SIZE; j++)
        this._square3x3[i][j] = other.getCell(i, j);
  }

  /**
   * Returns The value of the cell at the
   * provided index of this square3x3 array.
   *
   * @return The value of the cell at the given [row, col] index.
   */

  public int getCell(int row, int col) {
    boolean valid = this.isValidIndex(row, col);
    return valid ? this._square3x3[row][col] : this.DEFAULT_VALUE;
  }

  /**
   * Sets the value of the cell at the provided [row, col] index
   * of this square3x3 array to the provided value only if both
   * the row and column are valid.
   *
   * @param row   The row index where the given value should be set.
   * @param col   The col index where the given value should be set.
   * @param value The value to set at the given [row, col] index.
   */

  public void setXY(int row, int col, int value) {
    boolean valid = this.isValidIndex(row, col);
    if (valid)
      this._square3x3[row][col] = value;
  }

  /**
   * A method that checks if all the digits between 1 - 9
   * are present in this sqare3X3 array.
   * 
   * @return true if all the digits between 1 - 9 are present in this square 3x3
   *         array.
   */

  public boolean allThere() {
    boolean[] whosThere = new boolean[Square3x3.WHOS_THERE_SIZE];

    for (int i = 0; i < this.SIZE; i++)
      this.whosThereRow(i, whosThere);

    for (int j = 1; j < whosThere.length; j++)
      if (whosThere[j] == false)
        return false;

    return true;
  }

  /**
   * A method that takes a row number and a boolean array of size 10,
   * then iterates through the specified row of this square3x3
   * and assigns true to cells in the given values array
   * who's indices are equal to the values in the row.
   * 
   * @param row    The row number to iterate through in this square3x3 array.
   * @param values The array to modify according to the chosen row values.
   */

  public void whosThereRow(int row, boolean[] values) {
    if (this.isValidIndex(row))
      for (int i = 0; i < this.SIZE; i++)
        values[this.getCell(row, i)] = true;
  }

  /**
   * A method that takes a column number and a boolean array of size 10,
   * then iterates through the specified column of this square3x3,
   * and assigns true to cells in the given values array
   * who's indices are equal to the values in the column.
   * 
   * @param col    The column number to iterate through in this square3x3 array.
   * @param values The array to modify according to the chosen column values.
   */

  public void whosThereCol(int col, boolean[] values) {
    if (this.isValidIndex(col))
      for (int j = 0; j < this.SIZE; j++)
        values[this.getCell(j, col)] = true;
  }

  /**
   * Returns a string representation of this
   * square3x3 array in the format:
   *
   * 1 2 3
   * 4 5 6
   * 7 8 9
   *
   * @return A string representation of this square3x3 array.
   */

  public String toString() {
    String str = "";
    for (int i = 0; i < this.SIZE; i++)
      for (int j = 0; j < this.SIZE; j++)
        str += (this.getCell(i, j)) + (j != this.SIZE - 1 ? "\t" : (i != this.SIZE - 1) ? "\n" : "\n");
    return str;
  }

  // Validate that a specified value is within the range of 0 - 3.
  private boolean isValidIndex(int idx) {
    return (idx >= 0 && idx < this.SIZE);
  }

  // Uses the Square3x3 class method, to determine whether or not the given index
  // is in the range of this square3x3 array.
  private boolean isValidIndex(int row, int col) {
    return this.isValidIndex(row) && this.isValidIndex(col);
  }
}
