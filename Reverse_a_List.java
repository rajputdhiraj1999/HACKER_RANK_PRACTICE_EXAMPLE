import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reverse_a_List 
{
    public static List<Integer> reverseList(List<Integer> list) 
    {
        List<Integer> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) 
        {
            reversedList.add(list.get(i));
        }
        
        return reversedList;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();

        while (scanner.hasNextInt()) 
        {
            inputList.add(scanner.nextInt());
        }
        
        List<Integer> outputList = reverseList(inputList);

        for (Integer num : outputList) 
        {
            System.out.println(num);
        }
        
        scanner.close();
    }
}
