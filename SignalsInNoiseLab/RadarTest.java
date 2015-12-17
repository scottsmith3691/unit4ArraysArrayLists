import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author Scott Smith 
 * @version 12/16/15
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
     @Test
    public void testAccumulator()
    {
        int row = 45;
        int col = 55;
        Radar radar = new Radar(100,100);
        radar.setMonsterLocation(row,col);
        radar.setNoiseFraction(0.05);
        for( int i = 0; i < 100; i++)
        {
            radar.scan();
        }
        int highestAccumulatedDetection = 0;
        int hRow = 0;
        int hCol = 0;
        for( int x = 0; x < 100; x++)
        {
            for( int y = 0; y < 100; y++)
            {
                int detected = radar.getAccumulatedDetection(x,y);
                if (detected > highestAccumulatedDetection)
                {
                    hRow = x;
                    hCol = y;
                    highestAccumulatedDetection=detected;
                }
            }
        }
        
        
        assertEquals(row,hRow);
        assertEquals(col,hCol);
    }

   
}
