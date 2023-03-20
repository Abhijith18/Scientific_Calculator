import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;

public class SciCalTest {
    @BeforeClass
    public static void factorialTest(){
        System.out.println("*******************************");
        System.out.println("Starting Factorial Test");
        System.out.println("*******************************");
    }
    @Test
    public void factorialNegTest()
    {
        SciCal cal = new SciCal();
        System.out.println("Checking factorial of negative number");
        assertEquals("Factorial of negative number is not 0", 0, cal.factorial(-2), 0);

    }

    @AfterClass
    public static void factorialResult()
    {
        System.out.println("End of testing");
    }
}
