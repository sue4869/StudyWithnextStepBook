package StringCalcul;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCaluculatorTest {

    private StringCalculator strCal;

    @Before
    public void setUp() {
        strCal= new StringCalculator();
    }

    @Test
    public void 기본구분자_테스트() {
        assertEquals(8, strCal.add("1,3,4"));
        assertEquals(8, strCal.add("1:3:4"));
    }

    @Test
    public void 커스텀구분자계산_테스트() {
        assertEquals(6, strCal.add("\\;\n1;2;3"));
    }

    @Test(expected = RuntimeException.class)
    public void 음수확인_테스트() throws Exception {
        strCal.add("-1,2,3");
    }



}
