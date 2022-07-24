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
}
