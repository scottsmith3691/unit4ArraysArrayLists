// Implements a 2-D array of characters

public class CharMatrix
{
  // Instance variables:
  char[][] grid;
  // Constructor: creates a grid with dimensions rows, cols,
  // and fills it with spaces
  public CharMatrix(int rows, int cols)
  {
    grid = new char[rows][cols];
  }

  // Constructor: creates a grid with dimensions rows , cols ,
  // and fills it with the fill  character
  public CharMatrix(int rows, int cols, char fill)
  {
    grid = new char[rows][cols];
    for ( int i = 0; i < rows; i++)
    {
        for ( int x = 0; x < cols; x++)
        {
            grid[i][x] = fill;
        }
    }
  }

  // Returns the number of rows in grid
  public int numRows()
  {
      
  }

  // Returns the number of columns in grid
  public int numCols()
  {
     
  }

  // Returns the character at row, col location
  public char charAt(int row, int col)
  {
      if (grid[row][col] != null)
      {
        return grid[i][j];
      }
  }

  // Sets the character at row, col location to ch
  public void setCharAt(int row, int col, char ch)
  {
    grid[row][col] = ch;
  }

  // Returns true if the character at row, col is a space,
  // false otherwise
  public boolean isEmpty(int row, int col)
  {
      if (grid[row][col] == null)
      {
          return true;
      }
      else
      {
          return false;
      }
  }

  // Fills the given rectangle with fill  characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
      for ( int i = 0; i < (row1 - row0); i++)
    {
        for ( int x = 0; x < (col1 - col0); x++)
        {
            grid[i][x] = fill;
        }
    }
  }

  // Fills the given rectangle with SPACE characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void clearRect(int row0, int col0, int row1, int col1)
  {
      for ( int i = 0; i < (row1 - row0); i++)
    {
        for ( int x = 0; x < (col1 - col0); x++)
        {
            grid[i][j] = null;
        }
    }
  }

  // Returns the count of all non-space characters in row 
  public int countInRow(int row)
  {
      
  }

  // Returns the count of all non-space characters in col 
  public int countInCol(int col)
  {

  }
}
