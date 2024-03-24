import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void testAddition() {
        int result = Calculator.add(3, 5);
        Assert.assertEquals(result, 8);
    }

    @Test
    public void testSubtraction() {
        int result = Calculator.subtract(10, 5);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void testMultiply(){
        int result=Calculator.multiply(10,5);
        Assert.assertEquals(result,50);
    }

    @Test
    public void testDivision(){
        int result=Calculator.divide(10,5);
        Assert.assertEquals(result,2);
    }
}
