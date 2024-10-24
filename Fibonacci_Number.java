import java.util.Scanner;

public class Fibonacci_Number {
    public static int fibonacci(int n) 
    {

        if (n == 1) 
        {
            return 0; 
        } else if (n == 2) 
        {
            return 1; 
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) 
    {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            System.out.println(fibonacci(n));
        }
    }
}
