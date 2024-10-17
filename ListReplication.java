import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListReplication 
{
    public static List<Integer> repeatElements(int repeatCount, List<Integer> list) {
        List<Integer> result = new ArrayList<>();

        for (int element : list) {
            for (int i = 0; i < repeatCount; i++) {
                result.add(element);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeatCount = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }

        List<Integer> result = repeatElements(repeatCount, list);
 
        for (int num : result) {
            System.out.println(num);
        }

        scanner.close();
    }
}
