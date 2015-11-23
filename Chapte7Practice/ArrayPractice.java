import java.util.*;
public class ArrayPractice
{
    public static void boundsException()
    {
        int[] values = {1,4,9,16,25};

        int x = values[5];

    }

    public static void fillArray()
    {
        int[] values = new int[100];
        for (int i = 1;
        i < values.length;
        i++)
        {
            values[i] = i*i;

        }
        System.out.println(values);
        System.out.println(Arrays.toString(values));
    }

    public static void main(String[] args) 
    {
       int searchValue = 100;
       int[] values = { 80, 90, 100, 120, 110 };
       int pos = 0;
       boolean found = false;
       while ( pos < values.length && !found )
            {
             if ( values[pos] == searchValue )
                {
              
                     found = true;
                }
             else
               {
                      pos++;
               }
            }
        
       if ( found )
           	{
               System.out.println("Found at position: " + pos);
            }
       else
        	{
               System.out.println("Not found");
            }
    }
}


  