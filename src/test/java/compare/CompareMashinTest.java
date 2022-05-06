package compare;

import khodro.mashin.Dande;
import khodro.mashin.Mashin;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompareMashinTest {

    @Test
    void Should_Compare_Mashin() {
        Mashin bmw_1 = new Mashin("BMW", 150, Dande.AUTOMATIC);
        Mashin bmw_2 = new Mashin("BMW", 150, Dande.AUTOMATIC);

        Assertions.assertThat(bmw_1.equals(bmw_2)).isTrue();
    }
}
