package compare;

import khodro.mashin.Dande;
import khodro.mashin.Mashin;
import khodro.mashin.MashinComparator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

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

    @Test
    void Should_Sort_Mashins() {
        Mashin bmw_1 = new Mashin("BMW", 150, Dande.MANUAL);
        Mashin bmw_2 = new Mashin("BMW", 100, Dande.AUTOMATIC);
        Mashin bmw_3 = new Mashin("BMW", 50, Dande.MANUAL);
        Mashin bmw_4 = new Mashin("BMW", 50, Dande.AUTOMATIC);
        List<Mashin> mashins = new ArrayList<>();
        mashins.add(bmw_1);
        mashins.add(bmw_2);
        mashins.add(bmw_3);
        mashins.add(bmw_4);

        Collections.sort(mashins);

        List<Mashin> expectedMashins = new ArrayList<>();
        expectedMashins.add(bmw_3);
        expectedMashins.add(bmw_4);
        expectedMashins.add(bmw_2);
        expectedMashins.add(bmw_1);

        Assertions.assertThat(mashins).isEqualTo(expectedMashins);
    }

    @Test
    void Should_Sort_Mashins_By_Mark() {
        Mashin bmw = new Mashin("BMW", 150, Dande.MANUAL);
        Mashin mercedes = new Mashin("Mercedes", 100, Dande.AUTOMATIC);
        Mashin paykan = new Mashin("Paykan", 50, Dande.MANUAL);
        Mashin alfaRomeo = new Mashin("Alfa Romeo", 50, Dande.AUTOMATIC);
        List<Mashin> mashins = new ArrayList<>();
        mashins.add(bmw);
        mashins.add(mercedes);
        mashins.add(paykan);
        mashins.add(alfaRomeo);

        Collections.sort(mashins, new MashinComparator());

        List<Mashin> expectedMashins = new ArrayList<>();
        expectedMashins.add(alfaRomeo);
        expectedMashins.add(bmw);
        expectedMashins.add(mercedes);
        expectedMashins.add(paykan);

        Assertions.assertThat(mashins).isEqualTo(expectedMashins);
    }
}
