package lessons;

import org.example.lessons.Solution12915;
import org.example.lessons.Solution12916;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem12915 {

    private final Solution12915 solution12915 = new Solution12915();

    @Test
    void test1() {
        String[] parameter1 = {"sun", "bed", "car"};
        int parameter2 = 1;

        String[] result = solution12915.solution(parameter1, parameter2);

        String[] correct = {"car", "bed", "sun"};
        assertThat(result).isEqualTo(correct);
    }

    @Test
    void test2() {
        String[] parameter1 = {"abce", "abcd", "cdx"};
        int parameter2 = 2;

        String[] result = solution12915.solution(parameter1, parameter2);

        String[] correct = {"abcd", "abce", "cdx"};
        assertThat(result).isEqualTo(correct);
    }
}
