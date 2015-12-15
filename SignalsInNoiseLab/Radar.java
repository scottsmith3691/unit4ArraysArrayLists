import java.util.*;
/**
 * The model for radar scan and accumulator
 * 
 * @author @gcschmit
 * @version 19 July 2014
 */
public class Radar
{
    
    // stores whether each cell triggered detection for the current scan of the radar
    // (true represents a detected monster, which may be a false positive)
    private boolean[][] currentScan;
    
    // value of each cell is incremented for each scan in which that cell triggers detection
    private int[][] accumulator;
    
    // location of the monster
    private int monsterLocationRow;
    private int monsterLocationCol;

    // probability that a cell will trigger a false detection (must be >= 0 and < 1)
    private double noiseFraction;
    
    // number of scans of the radar since construction
    private int numScans;

    /**
     * Constructor for objects of class Radar
     * 
     * @param   rows    the number of rows in the radar grid
     * @param   cols    the number of columns in the radar grid
     */
    public Radar(int rows, int cols)
    {
        // initialize the currentScan 2D array and the accumulator 2D array
        
        
        currentScan = new boolean[rows][cols];
        accumulator = new int[rows][cols];
        
        // randomly set the location of the monster (can be explicity set through the
        //  setMonsterLocation method for the unit test
        Scanner s = new Scanner(System.in);
        System.out.print("1-Randomly Generated Monster/2-User Picked Position(1 or 2): ");
        int choice = s.nextInt();
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        if(choice==1)
        {
            monsterLocationRow = (int)(Math.random() * rows);
            monsterLocationCol = (int)(Math.random() * cols);
        }
        else if(choice==2)
        {
            System.out.print("Input X: ");
            int xAxis = x.nextInt();
            monsterLocationRow = xAxis;
            System.out.print("Input Y: ");
            int yAxis = y.nextInt();
            monsterLocationCol = yAxis;
        }
        noiseFraction = 0.05;
        numScans= 0;
    }
    
    /**
     * Performs a scan of the radar. Noise is injected into the grid and the accumulator is updated.
     * 
     */
    public void scan()
    {
        for ( int i = 0; i < this.currentScan.length; i++)
        {
            for (int x = 0; x < this.currentScan[i].length; x++)
            {
                currentScan[i][x]= false;
            }
        }
       
        currentScan[monsterLocationRow][monsterLocationCol] = true;
        injectNoise();
        for (int y = 0; y < this.currentScan.length; y++)
        {
            for( int z = 0; z < this.currentScan[y].length; z++)
            {
                if( currentScan[y][z]==true)
                {
                    accumulator[y][z]++;
                }
            }
        }
        numScans++;
    }

    /**
     * Sets the location of the monster
     * 
     * @param   row     the row in which the monster is located
     * @param   col     the column in which the monster is located
     * @pre row and col must be within the bounds of the radar grid
     */
    public void setMonsterLocation(int row, int col)
    {
        // remember the row and col of the monster's location
        monsterLocationRow = row;
        monsterLocationCol = col;
        
        // update the radar grid to show that something was detected at the specified location
        currentScan[row][col] = true;
    }
    
     /**
     * Sets the probability that a given cell will generate a false detection
     * 
     * @param   fraction    the probability that a given cell will generate a flase detection expressed
     *                      as a fraction (must be >= 0 and < 1)
     */
    public void setNoiseFraction(double fraction)
    {
        noiseFraction = fraction;
    }
    
    /**
     * Returns true if the specified location in the radar grid triggered a detection.
     * 
     * @param   row     the row of the location to query for detection
     * @param   col     the column of the location to query for detection
     * @return true if the specified location in the radar grid triggered a detection
     */
    public boolean isDetected(int row, int col)
    {
        return currentScan[row][col];
    }
    
    /**
     * Returns the number of times that the specified location in the radar grid has triggered a
     *  detection since the constructor of the radar object.
     * 
     * @param   row     the row of the location to query for accumulated detections
     * @param   col     the column of the location to query for accumulated detections
     * @return the number of times that the specified location in the radar grid has
     *          triggered a detection since the constructor of the radar object
     */
    public int getAccumulatedDetection(int row, int col)
    {
        return accumulator[row][col];
    }
    
    /**
     * Returns the number of rows in the radar grid
     * 
     * @return the number of rows in the radar grid
     */
    public int getNumRows()
    {
        return currentScan.length;
    }
    
    /**
     * Returns the number of columns in the radar grid
     * 
     * @return the number of columns in the radar grid
     */
    public int getNumCols()
    {
        return currentScan[0].length;
    }
    
    /**
     * Returns the number of scans that have been performed since the radar object was constructed
     * 
     * @return the number of scans that have been performed since the radar object was constructed
     */
    public int getNumScans()
    {
        return numScans;
    }
    
    /**
     * Sets cells as falsely triggering detection based on the specified probability
     * 
     */
    private void injectNoise()
    {
        // Iterate through all cells in the currentScan 2D array to inject noise by setting false positives.
        // The noiseFraction instance variable is the probability that a given cell will be
        // detected as a false positive. Use the Math.random method to determine if each cell should be set
        // as a false positive.
        
        for (int i = 0; i < this.currentScan.length; i++)
        {
            for (int x = 0; x < this.currentScan[i].length; x++)
            {
                
                    double probability = Math.random();
                    if (probability <= noiseFraction)
                    {
                        currentScan[i][x]=true;
                    }
                
            }
        }
        
    }
    
}
