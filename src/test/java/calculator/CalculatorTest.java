package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void Bayad_Do_Adad_Ra_Ba_Ham_Jam_Konad() {
        Calculator calculator = new Calculator();

        String haselJameDoAdad = calculator.add("5.3" , "-2");

        Assertions.assertEquals("3.3", haselJameDoAdad);
    }

    @Test
    void Bayad_Do_Adad_Ra_Az_Ham_Kam_Konad() {
        Calculator calculator = new Calculator();

        String haselJameDoAdad = calculator.submission("5.5" , "2.5");

        Assertions.assertEquals("8.0", haselJameDoAdad);
    }

    @Test
    void Bayad_Do_Adad_Ra_Ba_Ham_Zarb_Konad() {
        Calculator calculator = new Calculator();

        String haselJameDoAdad = calculator.multiply("10" , "3");

        Assertions.assertEquals("30.0", haselJameDoAdad);
    }

    @Test
    void Bayad_Do_Adad_Ra_Az_Ham_Taghsim_Konad() {
        Calculator calculator = new Calculator();

        String haselJameDoAdad = calculator.division("10" , "2.5");

        Assertions.assertEquals("4.0", haselJameDoAdad);
    }
}
