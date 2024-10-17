import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterPositionsInList {
     public static List<Integer> removeOddPositions(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        
        // Start with i = 1 to get elements at even indices
        for (int i = 1; i < list.size(); i += 2) {
            result.add(list.get(i));
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();
        
        while (scanner.hasNextInt()) {
            inputList.add(scanner.nextInt());
        }
        
        List<Integer> outputList = removeOddPositions(inputList);
        
        for (Integer num : outputList) {
            System.out.println(num);
        }
        
        scanner.close();
    }
}
