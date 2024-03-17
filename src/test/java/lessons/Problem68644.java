package lessons;

import org.example.lessons.Solution42748;
import org.example.lessons.Solution68644;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem68644 {

    private final Solution68644 solution68644 = new Solution68644();

    @Test
    void test1() {
        int[] parameter = {2,1,3,4,1};

        int[] result = solution68644.solution(parameter);

        int[] correct = {2,3,4,5,6,7};

        assertThat(result).isEqualTo(correct);
    }

    @Test
    void test2() {
        int[] parameter = {5,0,2,7};

        int[] result = solution68644.solution(parameter);

        int[] correct = {2,5,7,9,12};

        assertThat(result).isEqualTo(correct);
    }
}
