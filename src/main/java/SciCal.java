import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SciCal {
    private static final Logger logger = LogManager.getLogger(SciCal.class);
    public static void main(String[] args)
    {
        SciCal cal = new SciCal();
        System.out.println("0: Square root function");
        System.out.println("1: Fatcorial function");
        System.out.print("Enter an operation number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n) {
            case 0:
                System.out.print("Enter a number: ");
                double num = sc.nextDouble();
                System.out.println(cal.sqroot(num));
                break;
            case 1:
                System.out.print("Enter a number: ");
                int numi = sc.nextInt();
                System.out.println(cal.factorial(numi));
                break;
            default:
                break;
        }

    }

    public int factorial(int n)
    {
        if (n<0)
            return -1;
        int fact = 1;
        for(int i=1; i<n+1; i++)
            fact *= i;
        logger.info("[FACTORIAL] - " + n);
        logger.info("[RESULT - FACTORIAL] - " + fact);
        return fact;
    }

    public double sqroot(double n)
    {
        if (n<0)
            return -1;
        double result = Math.sqrt(n);
        logger.info("[SQUARE_ROOT] - " + n);
        logger.info("[RESULT - SQUARE_ROOT] - " + result);
        return result;
    }

}
