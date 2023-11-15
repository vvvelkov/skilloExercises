import org.testng.Assert;
import org.testng.annotations.*;

public class MavenTests {

    @DataProvider(name = "generateValues")
    public Object[][] generateValues() {
        return new Object[][]{{1,2,3}, {3,2,1}, {2,2,4}, {4,2,2}, {4,2,0}};
    }

    @Test(dataProvider = "generateValues", groups = "addition")
    public void addition(int num1, int num2, int expectedNum) {
        int sum = num1 + num2;
        Assert.assertEquals(sum, expectedNum);
    }

    @Test(dataProvider = "generateValues", groups = "subtraction")
    public void subtraction(int num1, int num2, int expectedNum) {
        int sum = num1 - num2;
        Assert.assertEquals(sum, expectedNum);
    }

    @Test(dataProvider = "generateValues", groups = "multiplication")
    public void multiplication(int num1, int num2, int expectedNum) {
        int sum = num1 * num2;
        Assert.assertEquals(sum, expectedNum);
    }

    @Test(dataProvider = "generateValues", groups = "division")
    public void division(int num1, int num2, int expectedNum) {
        int sum = num1 / num2;
        Assert.assertEquals(sum, expectedNum);
    }

    @Test(dataProvider = "generateValues", groups = "modulus")
    public void modulus(int num1, int num2, int expectedNum) {
        int sum = num1 % num2;
        Assert.assertEquals(sum, expectedNum);
    }
}
