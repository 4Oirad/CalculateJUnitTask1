import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {

    private final double EPS = 1e-9;
    private final double PI = 3.14;
    private final int ARGUMENT = 1;

    @Test
    public void circleAreaTest() {
        Assertions.assertEquals(PI, Calc.circleArea(ARGUMENT), EPS);
    }

    @Test
    public void circleLengthTest() {
        Assertions.assertEquals(2 * PI, Calc.circleLength(ARGUMENT), EPS);
    }


}