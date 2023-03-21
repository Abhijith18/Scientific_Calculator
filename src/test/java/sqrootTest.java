import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;

public class sqrootTest {
    @BeforeClass
    public static void sqrootTest(){
        System.out.println("*******************************");
        System.out.println("Starting Square Root Test");
        System.out.println("*******************************");
    }
    @Test
    public void sqrootNegTest()
    {
        SciCal cal = new SciCal();
        System.out.println("Checking square root of negative number");
        assertEquals("Square root of negative number is not working", -1, cal.sqroot(-2), 0);

    }

    @Test
    public void sqrootPosTest()
    {
        SciCal cal = new SciCal();
        System.out.println("Checking square root of positive number");
        assertEquals("Square root of positive number is not working", 2, cal.sqroot(4), 0);

    }


    @AfterClass
    public static void sqrootResult()
    {
        System.out.println("End of square root testing");
    }
}
