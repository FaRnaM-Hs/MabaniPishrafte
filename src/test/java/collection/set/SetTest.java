package collection.set;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class SetTest {

    @Test
    void Should_Remove_Duplication() {
        Set<String> animals = new HashSet<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Rabbit");

        Set<String> exceptedAnimals = new HashSet<>();
        exceptedAnimals.add("Dog");
        exceptedAnimals.add("Cat");
        exceptedAnimals.add("Rabbit");

        Assertions.assertThat(animals).isEqualTo(exceptedAnimals);
        
        for (String animal : animals) {
            System.out.println(animal);
        }
    }

    @Test
    void Should_Maintain_Insertion_Order() {
        Set<String> animals = new LinkedHashSet<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");

        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
