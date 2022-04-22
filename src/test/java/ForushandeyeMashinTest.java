import forushande.Forushande;
import khodro.mashin.Mashin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForushandeyeMashinTest {

    @Test
    void Bayad_Tedade_Kole_Mashin_Haye_Forukhte_Shode_Ra_Be_Dast_Avarim() {
        Forushande ali = new Forushande();
        Forushande naser = new Forushande();

        ali.forushMashin();
        ali.forushMashin();
        ali.forushMashin();
        ali.forushMashin();
        naser.forushMashin();

        Assertions.assertEquals(5, Mashin.tedadeForush);
    }
}
