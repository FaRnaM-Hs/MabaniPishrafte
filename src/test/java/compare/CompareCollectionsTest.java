package compare;

import khodro.mashin.Dande;
import khodro.mashin.Mashin;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompareCollectionsTest {

    @Test
    void Should_Compare_Non_Hash_Collections() {
        List<Mashin> mashinHa_1 = new ArrayList<>();
        mashinHa_1.add(new Mashin("BMW", 15, Dande.MANUAL));

        List<Mashin> mashinHa_2 = new ArrayList<>();
        mashinHa_2.add(new Mashin("BMW", 15, Dande.MANUAL));

        Assertions.assertThat(mashinHa_1.equals(mashinHa_2)).isTrue();
    }

    @Test
    void Should_Compare_Hash_Collections() {
        Set<Mashin> mashinHa_1 = new HashSet<>();
        mashinHa_1.add(new Mashin("BMW", 15, Dande.MANUAL));

        Set<Mashin> mashinHa_2 = new HashSet<>();
        mashinHa_2.add(new Mashin("BMW", 15, Dande.MANUAL));

        Assertions.assertThat(mashinHa_1.equals(mashinHa_2)).isTrue();
    }
}
