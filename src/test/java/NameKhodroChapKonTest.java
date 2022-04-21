import khodro.Kashti;
import khodro.Khodro;
import khodro.mashin.Dande;
import khodro.mashin.Mashin;
import khodro.Motor;
import khodro.NameKhodroChapKon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameKhodroChapKonTest {

    @Test
    void BayadNameKhodroRaChapKonad() {
        Khodro benz = new Mashin("Benz", 120, Dande.AUTOMATIC);
        Khodro volvo = new Mashin("Volvo", 80, Dande.MANUAL);
        Khodro motor = new Motor();
        Khodro kashti = new Kashti();
        Khodro[] khodroha = {benz, volvo, motor, kashti};
        NameKhodroChapKon nameKhodroChapKon = new NameKhodroChapKon(khodroha);

        String listNameKhodroHa = nameKhodroChapKon.execute();

        Assertions.assertEquals("Benz-Volvo-Motor-Kashti",listNameKhodroHa);
    }
}
