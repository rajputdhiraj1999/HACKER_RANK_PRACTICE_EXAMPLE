import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array_Of_N_Elements 
{
    public static List<Integer> createArray(int n) 
    {
        List<Integer> result = new ArrayList<>();
        
        for (int i = (n >= 10 ? 0 : 1); i < (n >= 10 ? n : n + 1); i++) 
        {
            result.add(i);
        }
        
        return result;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        List<Integer> array = createArray(n);

        System.out.println(array);
        
        scanner.close();
    }
}
