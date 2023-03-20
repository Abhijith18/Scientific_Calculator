import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SciCal {
    private static final Logger logger = LogManager.getLogger(SciCal.class);
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
        logger.info("[FACTORIAL] - " + n);
        logger.info("[RESULT - FACTORIAL] - " + fact);
        return fact;
    }
}
