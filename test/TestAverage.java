import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static seminars.HW_6.Average.averageArrays;

public class TestAverage {
    @Test
    public void testFirstBigger() {
        int[] firstNumArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] secondNumArray = new int[]{1, 2, 3, 4, 5, 6, 5};

        assertThat(averageArrays(firstNumArray, secondNumArray))
                .isEqualTo("Первый список имеет большее среднее значение");
    }

    @Test
    public void testSecondBigger() {
        int[] firstNumArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] secondNumArray = new int[]{1, 2, 3, 4, 5, 6, 9};

        assertThat(averageArrays(firstNumArray, secondNumArray))
                .isEqualTo("Второй список имеет большее среднее значение");
    }

    @Test
    public void testEquals() {
        int[] firstNumArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] secondNumArray = new int[]{1, 2, 3, 4, 5, 6, 7};

        assertThat(averageArrays(firstNumArray, secondNumArray))
                .isEqualTo("Средние значения равны");
    }
}
