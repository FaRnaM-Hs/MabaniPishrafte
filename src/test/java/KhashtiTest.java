import khodro.Kashti;
import khodro.Khodro;
import khodro.mashin.Dande;
import khodro.mashin.Mashin;
import org.junit.jupiter.api.Test;

public class KhashtiTest {

    @Test
    void protected_method() {
        Khodro kashti = new Kashti();

        kashti.ayaDarHaleHarekatAst();
    }

    @Test
    void super_keyword() {
        Khodro kashti = new Kashti();

        System.out.println(kashti.toString());
    }

    @Test
    void this_keyword() {
        Kashti kashti = new Kashti();
        Mashin mashin = new Mashin("Zhian", 25, Dande.MANUAL);

        kashti.printReference();
        kashti.printReferenceObject(this);
        kashti.printReferenceObject(mashin);
    }
}
