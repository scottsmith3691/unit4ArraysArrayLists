import java.util.*;
public class ArrayStore
{
    public ArrayStore()
    {
        ArrayList<String> customers = new ArrayList<String>();
        ArrayList<Double> spent = new  ArrayList<Double>();
        boolean again = true;
        while( again==true)
        {
            Scanner s = new Scanner(System.in);
            System.out.print("What is the customers name: ");
            String name = s.next();
            customers.add(name);
            System.out.println();
            System.out.print("How much did " + name + " pay today");
            Double cost=s.nextDouble();
            spent.add(cost);
            System.out.println();
            System.out.print("Another customer (y/n): ");
            String another=s.next();
            if (another == "f")
            {
                again=false;
            }
        }
        double highest = 0;
        
    }
}
