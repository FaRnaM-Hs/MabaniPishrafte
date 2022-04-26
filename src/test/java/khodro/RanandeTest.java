package khodro;

import khodro.Ranande;
import org.junit.jupiter.api.Test;

public class RanandeTest {

    @Test
    void BayadNoeGavahinameVaNamRaChapKonad() {
        Ranande ranande = new Ranande();
        Ranande.Gavahiname gavahiname = ranande.new Gavahiname();
        gavahiname.print();
    }

    @Test
    void BayadNamRaChapKonad() {
        Ranande.StaticGavahiname staticGavahiname = new Ranande.StaticGavahiname();
        staticGavahiname.print();
    }
}
