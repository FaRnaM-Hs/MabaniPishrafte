package collection.list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

    @Test
    void Should_Be_Empty_When_Created() {
        List<String> strings = new ArrayList<>();

        Assertions.assertThat(strings).isEmpty();
    }

    @Test
    void Should_Be_Immutable() {
        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Rabbit");

        List<String> unmodifiableAnimals = Collections.unmodifiableList(animals);
        //unmodifiableAnimals.add("Snake");     // Does not work
        animals.add("Snake");                   // Works

        Assertions.assertThat(animals.size()).isEqualTo(6);
        Assertions.assertThat(unmodifiableAnimals.size()).isEqualTo(6);
    }

    @Test
    void Should_Reverse_A_List() {
        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Rabbit");

        Collections.reverse(animals);

        List<String> reversedAnimals = new ArrayList<>();
        reversedAnimals.add("Rabbit");
        reversedAnimals.add("Cat");
        reversedAnimals.add("Cat");
        reversedAnimals.add("Cat");
        reversedAnimals.add("Dog");

        Assertions.assertThat(animals).isEqualTo(reversedAnimals);
        Assertions.assertThat(reversedAnimals.indexOf("Cat")).isEqualTo(1);
        Assertions.assertThat(reversedAnimals.lastIndexOf("Cat")).isEqualTo(3);
        Assertions.assertThat(reversedAnimals.contains("Dog")).isTrue();

    }

    @Test
    void Given_an_array_return_an_ArrayList_of_the_appropriate_type_with_all_the_same_elements() {
        int[] arrayNumbers = {1, 2, 3, 3};

        Converter converter = new Converter();
        List<Integer> arrayListNumbers = converter.convertToArrayList(arrayNumbers);
        arrayListNumbers.add(4, 99);
        arrayListNumbers.add(2, 66);
        arrayListNumbers.remove(1);
        arrayListNumbers.add(111);

        List<Integer> exceptedList = new ArrayList<>();
        exceptedList.add(1);
        //exceptedList.add(2);
        exceptedList.add(66);
        exceptedList.add(3);
        exceptedList.add(3);
        exceptedList.add(99);
        exceptedList.add(111);
        Assertions.assertThat(arrayListNumbers).isEqualTo(exceptedList);
    }

    class Converter {

        public List<Integer> convertToArrayList(int[] arrayNumbers) {
            List<Integer> listNumbers = new ArrayList<>();
            for (int number : arrayNumbers) {
                listNumbers.add(number);
            }
            return listNumbers;
        }
    }
}
