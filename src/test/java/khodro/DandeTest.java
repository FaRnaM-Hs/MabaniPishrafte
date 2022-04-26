package khodro;

import khodro.mashin.Dande;
import org.junit.jupiter.api.Test;

public class DandeTest {

    @Test
    void print_all_Dande_values() {
        Dande.print();
    }

    @Test
    void print_all_in_persian() {
        System.out.println("IN PERSIAN: ");
        Dande.printInPersian();
    }

    @Test
    void print_all_in_french() {
        System.out.println("IN FRENCH: ");
        Dande.printInFrench();
    }
}
