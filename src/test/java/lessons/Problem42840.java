package lessons;

import org.example.lessons.Solution42840;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem42840 {

    private final Solution42840 solution42840 = new Solution42840();

    @Test
    void test1() {
        int[] parameter = {1, 2, 3, 4, 5};

        int[] result = solution42840.solution(parameter);

        assertThat(result).isEqualTo(new int[]{1});
    }

    @Test
    void test2() {
        int[] parameter = {1, 3, 2, 4, 2};

        int[] result = solution42840.solution(parameter);

        assertThat(result).isEqualTo(new int[]{1, 2, 3});
    }
}
