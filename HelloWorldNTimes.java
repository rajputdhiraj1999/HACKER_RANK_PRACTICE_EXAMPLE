import java.util.Scanner;

public class HelloWorldNTimes 
{
     public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) 
        {
            System.out.println("Hello World");
        }
        
        scanner.close();
    }
}
