import khodro.Khodro;
import khodro.Motor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MotorTest {

    @Test
    void MotorBayadHarekatKonadVaghtiRoshanAst() {

        Khodro motor = new Motor();

        motor.roshan();
        boolean ayaHarekatMikonad = motor.ayaDarHaleHarekatAst();

        Assertions.assertTrue(ayaHarekatMikonad);
    }
}
