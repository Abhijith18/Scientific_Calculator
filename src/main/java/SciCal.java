import java.util.Scanner;
public class SciCal {
    public static void main(String[] args)
    {
        SciCal cal = new SciCal();
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(cal.factorial(n));

    }

    public int factorial(int n)
    {
        if (n<0)
            return 0;
        int fact = 1;
        for(int i=1; i<n+1; i++)
            fact *= i;
        return fact;
    }
}
