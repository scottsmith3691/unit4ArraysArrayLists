import java.util.ArrayList;
public class ArryListPractice
{
    public static void main( String[] args)
    {
        int count = 0;
        int[][] myArray = new int[4][5];
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                myArray[j][i] = count;
                count++;
            }
        }
        System.out.println(myArray[1][2]);
    }
}
