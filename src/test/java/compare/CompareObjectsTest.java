package compare;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class CompareObjectsTest {

    @Test
    void Should_Compare_Primitive_Objects() {
        Assertions.assertThat(1 == 1).isTrue();
        Assertions.assertThat(1 != 2).isTrue();
        Assertions.assertThat(1.2 == 1.2).isTrue();
    }

    @Test
    void Should_Compare_Non_Primitive_Objects() {
        String s1 = new String("Farnam");
        String s2 = new String("Farnam");

        Assertions.assertThat(s1 == s2).isFalse();
        Assertions.assertThat(s1.equals(s2)).isTrue();

        String s3 = new String("FARNAM");
        
        Assertions.assertThat(s1.equals(s3)).isFalse();
        Assertions.assertThat(s1.equalsIgnoreCase(s3)).isTrue();

        String far1 = "Farnam";
        String far2 = "Farnam";

        Assertions.assertThat(far1 == far2);

    }

    @Test
    void Should_Handle_Null_Objects() {
        String s1 = null;
        String s2 = "Farnam";

        // Assertions.assertThat(s1.equals(s2)).isFalse(); Throws NullPointerException
        Assertions.assertThat(Objects.equals(s1, s2)).isFalse();
    }
}
