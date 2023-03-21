import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SciCal {
    private static final Logger logger = LogManager.getLogger(SciCal.class);
    public static void main(String[] args)
    {
        SciCal cal = new SciCal();
        System.out.println("0: Square root function");
        System.out.println("1: Factorial function");
        System.out.println("2: Natural logarithm function");
        System.out.println("3: Power function");
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
            case 2:
                System.out.print("Enter a number: ");
                double numn = sc.nextDouble();
                System.out.println(cal.log(numn));
                break;
            case 3:
                System.out.print("Enter a number for base: ");
                double x = sc.nextDouble();
                System.out.print("Enter a number for exp: ");
                double b = sc.nextDouble();
                System.out.println(cal.power(x,b));
                break;
            default:
                break;
        }

    }

    public int factorial(int n)
    {
        int fact = -1;
        if (n<0)
        {
            logger.info("[FACTORIAL] - " + n);
            logger.info("[RESULT - FACTORIAL] - " + fact);
            return fact;
        }
        fact = 1;
        for(int i=1; i<n+1; i++)
            fact *= i;
        logger.info("[FACTORIAL] - " + n);
        logger.info("[RESULT - FACTORIAL] - " + fact);
        return fact;
    }

    public double sqroot(double n)
    {
        double result = -1;
        if (n<0)
        {
            logger.info("[SQUARE_ROOT] - " + n);
            logger.info("[RESULT - SQUARE_ROOT] - " + result);
            return result;
        }
        result = Math.sqrt(n);
        logger.info("[SQUARE_ROOT] - " + n);
        logger.info("[RESULT - SQUARE_ROOT] - " + result);
        return result;
    }

    public double log(double n)
    {
        double result = Math.log(n);
        logger.info("[NATURAL_LOG] - " + n);
        logger.info("[RESULT - NATURAL_LOG] - " + result);
        return result;
    }

    public double power(double x, double b)
    {
        double result = Math.pow(x, b);
        logger.info("[POWER] - " + x + "^" + b);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

}
