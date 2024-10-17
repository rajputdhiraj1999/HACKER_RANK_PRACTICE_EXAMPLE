import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterArray 
{
      public static List<Integer> filterElements(int upperLimit, List<Integer> list) 
      {
        List<Integer> result = new ArrayList<>();
        
        for (int element : list) 
        {
            if (element < upperLimit) 
            {
                result.add(element);
            }
        }
        
        return result;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int upperLimit = scanner.nextInt();
        
        List<Integer> list = new ArrayList<>();
        
        while (scanner.hasNextInt()) 
        {
            list.add(scanner.nextInt());
        }
        List<Integer> result = filterElements(upperLimit, list);
        
        for (int value : result) 
        {
            System.out.println(value);
        }
        
        scanner.close();
    }
}
