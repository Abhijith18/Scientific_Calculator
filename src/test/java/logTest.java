import org.junit.AfterClass;
import org.junit.BeforeClass;

import static java.lang.Double.NaN;
import static org.junit.Assert.*;
import org.junit.Test;

public class logTest {
    @BeforeClass
    public static void logstartTest(){
        System.out.println("*******************************");
        System.out.println("Starting Natural Logarithm Test");
        System.out.println("*******************************");
    }
    @Test
    public void logNegTest()
    {
        SciCal cal = new SciCal();
        System.out.println("Checking ln of negative number");
        assertEquals("ln of negative number is not working", NaN, cal.log(-2), 0);

    }

    @Test
    public void logPosTest()
    {
        SciCal cal = new SciCal();
        System.out.println("Checking ln of positive number");
        assertEquals("ln of positive number is not working", 0.693, cal.log(2), 0.002);

    }

    @Test
    public void logZeroTest()
    {
        SciCal cal = new SciCal();
        System.out.println("Checking ln of zero");
        assertEquals("ln of zero is not working", Double.NEGATIVE_INFINITY, cal.log(0), 0);

    }

    @AfterClass
    public static void logResult()
    {
        System.out.println("End of testing of natural logarithm");
    }
}
