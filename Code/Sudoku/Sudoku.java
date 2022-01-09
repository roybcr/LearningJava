
/**
 * This class represents a Sudoku board made of
 * 9 Square3x3 objects.
 *
 * @author (Roy Bachar)
 * @version (10.12.21)
 */

public class Sudoku {
    private static final byte SIZE = 3;
    private Square3x3[][] _gameBoard;

    /**
     * Constructs a 3x3 array of Square3x3 objects.
     */

    public Sudoku() {
        this._gameBoard = new Square3x3[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                this._gameBoard[i][j] = new Square3x3();
    }

    /**
     * Construct a 3x3 array of Square3x3 objects which are taken from the given
     * array.
     */

    public Sudoku(Square3x3[][] square3x3Array) {
        this._gameBoard = new Square3x3[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                this._gameBoard[i][j] = new Square3x3(square3x3Array[i][j]);
    }

    /**
     * Validates the sudoku board by checking
     * each Square3x3 object independently,
     * each board row,
     * and each board column.
     * 
     * @return true if the board is valid according to the rules of Sudoku, false
     *         otherwise.
     */

    public boolean isValid() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (!(this._gameBoard[i][j].allThere() && this.checkBoardRow(i, j) && this.checkBoardCol(i, j)))
                    return false;
        return true;
    }

    // Validates a board row by independently checking each inner row of the
    // squares at the given row index.
    private boolean checkBoardRow(int boardRow, int squareRow) {
        boolean[] values = new boolean[Square3x3.WHOS_THERE_SIZE];

        for (int i = 0; i < Sudoku.SIZE; i++)
            this._gameBoard[boardRow][i].whosThereRow(squareRow, values);

        for (int i = 1; i < Square3x3.WHOS_THERE_SIZE; i++)
            if (!values[i])
                return false;

        return true;
    }

    // Validates a board column by independently checking each inner column of the
    // squares at the given column index.
    private boolean checkBoardCol(int boardCol, int squareCol) {
        boolean[] values = new boolean[Square3x3.WHOS_THERE_SIZE];

        for (int i = 0; i < Sudoku.SIZE; i++)
            this._gameBoard[i][boardCol].whosThereCol(squareCol, values);

        for (int i = 1; i < Square3x3.WHOS_THERE_SIZE; i++)
            if (!values[i])
                return false;

        return true;
    }

}
