import khodro.Khodro;
import khodro.Mashin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MashinTest {

    @Test
    void MashinBayadHarekatKonadVaghtiDarBasteAstVaMashinRoshanAst() {

        Khodro benz = new Mashin("Benz");
        Khodro volvo = new Mashin("Volvo");

        boolean ayaBenzHarekatMikonad = benz.ayaDarHaleHarekatAst();
        volvo.roshan();
        boolean ayaVolvoHarekatMikonad = volvo.ayaDarHaleHarekatAst();

        Assertions.assertFalse(ayaBenzHarekatMikonad);
        Assertions.assertTrue(ayaVolvoHarekatMikonad);

    }
}
