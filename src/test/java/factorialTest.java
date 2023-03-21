import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;

public class factorialTest {
    @BeforeClass
    public static void factorialstartTest(){
        System.out.println("*******************************");
        System.out.println("Starting Factorial Test");
        System.out.println("*******************************");
    }
    @Test
    public void factorialNegTest()
    {
        SciCal cal = new SciCal();
        System.out.println("Checking factorial of negative number");
        assertEquals("Factorial of negative number is not working", -1, cal.factorial(-2), 0);

    }

    @Test
    public void factorialPosTest()
    {
        SciCal cal = new SciCal();
        System.out.println("Checking factorial of positive number");
        assertEquals("Factorial of positive number is not working", 24, cal.factorial(4), 0);

    }

    @Test
    public void factorialZeroTest()
    {
        SciCal cal = new SciCal();
        System.out.println("Checking factorial of zero");
        assertEquals("Factorial of zero is not working", 1, cal.factorial(0), 0);

    }

    @AfterClass
    public static void factorialResult()
    {
        System.out.println("End of testing of factorial");
    }
}
