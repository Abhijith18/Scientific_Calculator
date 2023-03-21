import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;

public class powerTest{
    @BeforeClass
    public static void powerstartTest(){
        System.out.println("*******************************");
        System.out.println("Starting Power Test");
        System.out.println("*******************************");
    }
    @Test
    public void powerNegTest()
    {
        SciCal cal = new SciCal();
        System.out.println("Checking power of a number with negative exp");
        assertEquals("Power of a number with negative exp is not working", 0.25, cal.power(2, -2), 0);

    }

    @Test
    public void powerPosTest()
    {
        SciCal cal = new SciCal();
        System.out.println("Checking power of a number with positive exp");
        assertEquals("Power of a number with positive exp is not working", 4, cal.power(2, 2), 0);

    }


    @AfterClass
    public static void powerResult()
    {
        System.out.println("End of testing of power");
    }
}
