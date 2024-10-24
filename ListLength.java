public class ListLength 
{
    public static int countElements(int[] arr, int index) 
    {

        if (index == arr.length) 
        {
            return 0;
        }

        return 1 + countElements(arr, index + 1);
    }

    public static void main(String[] args) 
    {

        int[] inputArray = {2, 5, 1, 4, 3, 7, 8, 6, 0, 9};

        int output = countElements(inputArray, 0);

        System.out.println(output); // Output will be 10
    }
}
