package collection.map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

    @Test
    void Should_Have_Unique_Keys_And_Can_Have_Duplicated_Values() {
        Map<String, String> geometrics = new HashMap<>();
        geometrics.put("Mosalas", "Ghermez");
        geometrics.put("Mostatil", "Zard");
        geometrics.put("Sheshzelei", "Sabz");
        geometrics.put("Moraba", "Ghermez");
        geometrics.put("Moraba", "Ghermez");

        Set<Map.Entry<String, String>> entries = geometrics.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key);
            System.out.println("Value: " + value);
        }
    }


    @Test
    void Shoud_Preserve_Insertion_Order() {
        Map<String, String> geometrics = new LinkedHashMap<>();
        geometrics.put("Mosalas", "Ghermez");
        geometrics.put("Mostatil", "Zard");
        geometrics.put("Sheshzelei", "Sabz");
        geometrics.put("Moraba", "Ghermez");

        Set<Map.Entry<String, String>> entries = geometrics.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key);
            System.out.println("Value: " + value);
        }
    }
}
