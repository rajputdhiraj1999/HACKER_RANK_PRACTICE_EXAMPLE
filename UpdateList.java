import java.util.Scanner;

public class UpdateList {
    public static void updateWithAbsoluteValues(int[] arr) 
    {

        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = Math.abs(arr[i]);
        }

        for (int num : arr) 
        {
            System.out.println(num);
        }
    }

    public static void main(String[] args) 
    {

        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] inputArray = new int[n];

            for (int i = 0; i < n; i++) {
                inputArray[i] = scanner.nextInt();
            }

            updateWithAbsoluteValues(inputArray);
        }
    }
}
