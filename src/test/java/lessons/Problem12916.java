package lessons;

import org.example.lessons.Solution12916;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem12916 {

    private final Solution12916 solution12916 = new Solution12916();

    @Test
    void test1() {
        String parameter1 = "pPoooyY";

        boolean result = solution12916.solution(parameter1);

        assertThat(result).isEqualTo(true);
    }

    @Test
    void test2() {
        String parameter1 = "Pyy";

        boolean result = solution12916.solution(parameter1);

        assertThat(result).isEqualTo(false);
    }
}
