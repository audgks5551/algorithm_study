package lessons;

import org.example.lessons.Solution12918;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem12918 {

    private final Solution12918 solution12918 = new Solution12918();

    @Test
    void test1() {
        String parameter1 = "a234";

        boolean result = solution12918.solution(parameter1);

        assertThat(result).isEqualTo(false);
    }

    @Test
    void test2() {
        String parameter1 = "1234";

        boolean result = solution12918.solution(parameter1);

        assertThat(result).isEqualTo(true);
    }
}
