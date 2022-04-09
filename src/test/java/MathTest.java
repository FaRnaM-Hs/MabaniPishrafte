import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {

    @Test
    void Bayad_Amaliate_Riazi_Anjam_Dahad() {
        double moteghayer = -1.5;
        int variable = 0;

        double meghdareMotlagh = Math.abs(moteghayer);

        Assertions.assertEquals(1.5, meghdareMotlagh);
        Assertions.assertEquals(1, Math.cos(0));
    }
}
