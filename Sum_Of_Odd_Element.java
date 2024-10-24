public class Sum_Of_Odd_Element 
{
    public static int Sum_Of_Odd_Elements(int[] arr) 
    {
        int sum = 0;

        for (int num : arr) 
        {

            if (num % 2 != 0) 
            {
                sum += num;
            }
        }
        
        return sum;
    }

    public static void main(String[] args) 
    {

        int[] inputArray = {2, 4, 6, 5, 7, 8, 0, 1};

        int output = Sum_Of_Odd_Elements(inputArray);

        System.out.println(output);
    }
}
