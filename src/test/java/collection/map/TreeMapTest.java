package collection.map;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TreeMapTest {

    @Test
    void Should_Sort_Elements() {
        Map<String, String> geometrics = new TreeMap<>();
        geometrics.put("Mosalas", "Ghermez");
        geometrics.put("Mostatil", "Zard");
        geometrics.put("Sheshzelei", "Sabz");
        geometrics.put("Moraba", "Ghermez");

        Object[] keys = geometrics.keySet().toArray();
        Assertions.assertThat(keys[0]).isEqualTo("Moraba");
        Assertions.assertThat(keys[1]).isEqualTo("Mosalas");
        Assertions.assertThat(keys[2]).isEqualTo("Mostatil");
        Assertions.assertThat(keys[3]).isEqualTo("Sheshzelei");
    }

    @Test
    void Should_Sort_Elements_In_Reverse_Order() {
        TreeMap<String, String> geometrics = new TreeMap<>(Comparator.reverseOrder());
        geometrics.put("Mosalas", "Ghermez");
        geometrics.put("Mostatil", "Zard");
        geometrics.put("Sheshzelei", "Sabz");
        geometrics.put("Moraba", "Ghermez");

        Object[] keys = geometrics.keySet().toArray();
        Assertions.assertThat(keys[0]).isEqualTo("Sheshzelei");
        Assertions.assertThat(keys[1]).isEqualTo("Mostatil");
        Assertions.assertThat(keys[2]).isEqualTo("Mosalas");
        Assertions.assertThat(keys[3]).isEqualTo("Moraba");
    }
}
