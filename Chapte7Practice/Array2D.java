
public class Array2D
{
    final int COUNTRIES = 7;
    final int MEDALS = 3;
    int[][] counts = {
                    {1,0,1},
                    {1,1,0},
                    {0,0,1},
                    {1,0,0},
                    {0,1,1},
                    {0,1,1},
                    {1,1,0}
                    
                };

    public Array2D()
    {
        //counts = new int[COUNTRIES][MEDALS];
        
        
    }
    
    public void displayElements()
    {
        for ( int i = 0; i < counts.length; i++)
        {
            for( int j = 0; j < counts[i].length; j++)
            {
                System.out.print( counts[i][j] + "\t" );
            }
            System.out.println();
        }
    }

    public int totalMedalsForCountry( int countryIndex)
    //sum the elements in the specific row
    {
       int total = 0;
       
       for (int j = 0; j < counts[countryIndex].length; j++)
       {
           total += counts[countryIndex][j];
       }
       
       return total;
    }
    
    public int totalMedals( int medalIndex)
    {
        int total = 0;
        for( int  i = 0; i < counts.length; i++)
        {
            total += counts[i][medalIndex];
        }
        return total;
    }
}
