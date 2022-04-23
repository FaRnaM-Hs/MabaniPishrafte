package collection.list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    @Test
    void Should_Be_Empty_When_Created() {
        List<String> strings = new ArrayList<>();

        Assertions.assertThat(strings).isEmpty();
    }

    @Test
    void Given_an_array_return_an_ArrayList_of_the_appropriate_type_with_all_the_same_elements() {
        int[] arrayNumbers = {1, 2, 3, 3};

        Converter converter = new Converter();
        List<Integer> arrayListNumbers = converter.convertToArrayList(arrayNumbers);
        arrayListNumbers.add(4, 99);
        arrayListNumbers.add(2, 66);

        List<Integer> exceptedList = new ArrayList<>();
        exceptedList.add(1);
        exceptedList.add(2);
        exceptedList.add(66);
        exceptedList.add(3);
        exceptedList.add(3);
        exceptedList.add(99);
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
