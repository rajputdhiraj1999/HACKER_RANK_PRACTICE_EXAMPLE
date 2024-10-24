import java.util.Scanner;

public class Numerical_Method 
{
    public static double evaluatePolynomial(double[] coefficients, double x) 
    {
        double result = 0.0;
        for (int i = 0; i < coefficients.length; i++) 
        {
            result += coefficients[i] * Math.pow(x, i);
        }
        return result;
    }

    public static double computeArea(double[] coefficients, double a, double b, int n) 
    {
        double h = (b - a) / n;
        double area = 0.5 * (evaluatePolynomial(coefficients, a) + evaluatePolynomial(coefficients, b));

        for (int i = 1; i < n; i++) 
        {
            double x = a + i * h;
            area += evaluatePolynomial(coefficients, x);
        }
        area *= h;
        return area;
    }

    public static double computeVolume(double[] coefficients, double a, double b, int n) 
    {
        double h = (b - a) / n;
        double volume = 0.5 * (Math.pow(evaluatePolynomial(coefficients, a), 2) + Math.pow(evaluatePolynomial(coefficients, b), 2));

        for (int i = 1; i < n; i++) 
        {
            double x = a + i * h;
            volume += Math.pow(evaluatePolynomial(coefficients, x), 2);
        }
        volume *= h;
        volume = Math.PI * volume;
        return volume;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double[] coefficients1 = readDoubles(scanner);
        double[] coefficients2 = readDoubles(scanner);

        double[] coefficients = new double[Math.max(coefficients1.length, coefficients2.length)];
        for (int i = 0; i < coefficients1.length; i++) 
        {
            coefficients[i] += coefficients1[i];
        }
        for (int i = 0; i < coefficients2.length; i++) 
        {
            coefficients[i] += coefficients2[i];
        }

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        int n = 1000;

        double area = computeArea(coefficients, a, b, n);
        double volume = computeVolume(coefficients, a, b, n);

        System.out.printf("%.6f%n", area);
        System.out.printf("%.6f%n", volume);
    }

    private static double[] readDoubles(Scanner scanner) 
    {
        String[] parts = scanner.nextLine().trim().split("\\s+");
        double[] values = new double[parts.length];
        for (int i = 0; i < parts.length; i++) 
        {
            values[i] = Double.parseDouble(parts[i]);
        }
        return values;
    }
}
