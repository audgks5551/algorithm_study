package lessons;

import org.example.lessons.Solution68935;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem68935 {

    private final Solution68935 solution68935 = new Solution68935();

    @Test
    void test1() {
        int parameter = 45;

        int result = solution68935.solution(parameter);

        assertThat(result).isEqualTo(7);
    }

    @Test
    void test2() {
        int parameter = 125;

        int result = solution68935.solution(parameter);

        assertThat(result).isEqualTo(229);
    }
}
