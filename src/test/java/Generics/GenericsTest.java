package Generics;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

    @Test
    void should_work_but_has_errors_in_runtime() {
        List list = new ArrayList();
        list.add(10);
        list.add("10");

        Assertions.assertThat((Integer) list.get(1)).isNotNull();
    }

    @Test
    void should_work() {
        List<Integer> list = new ArrayList<>();
        list.add(5);

        Integer[] integers = list.toArray(new Integer[0]);

        for (Integer integer : integers)
            System.out.println(integer);
    }

    @Test
    void generic_method_syntax() {
        GenericMethod<Integer> gt = new GenericMethod();
        final Integer[] integers = gt.toArray(new Integer[0], "s");
    }

    static class GenericMethod<E> {
        <S, T extends E> T[] toArray(T[] t, S s) {
            return null;
        }
    }
}
