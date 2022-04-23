package khodro;

import khodro.Khodro;
import khodro.mashin.Dande;
import khodro.mashin.Mashin;
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

    @Test
    void Bayad_Print_Konad() {
        Mashin pejo = new Mashin("Pejo", 67, Dande.MANUAL);
        System.out.println(pejo.toString());
    }
}
