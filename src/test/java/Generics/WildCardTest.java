package Generics;

import khodro.Kashti;
import khodro.Khodro;
import khodro.mashin.Mashin;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class WildCardTest {

    @Test
    void should_print_names() {
        List<Khodro> khodroha = Arrays.asList(new Mashin("Nissan"), new Kashti());
        printName(khodroha);

        List<Mashin> mashinha = Arrays.asList(new Mashin("Pejo"), new Mashin("Benz"));
        printName(mashinha);
    }

    private void printName(List<? extends Khodro> khodroha) {
        for(Khodro khodro : khodroha)
            System.out.println(khodro.getMark());
    }
}
