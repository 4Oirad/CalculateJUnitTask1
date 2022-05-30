import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {

    private static final double EPS = 1e-9;
    private static final int ARGUMENT = 15;
    private static final double RESULT_CIRCLE_AREA = 3.14 * ARGUMENT * ARGUMENT;
    private static final double RESULT_CIRCLE_LENGTH = 2 * 3.14 * ARGUMENT;

    @Test
    public void circleAreaTest() {
        Assertions.assertEquals(RESULT_CIRCLE_AREA, Calc.circleArea(ARGUMENT), EPS);
    }

    @Test
    public void circleLengthTest() {
        Assertions.assertEquals(RESULT_CIRCLE_LENGTH, Calc.circleLength(ARGUMENT), EPS);
    }
}