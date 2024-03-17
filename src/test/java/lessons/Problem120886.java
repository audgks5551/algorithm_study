package lessons;

import org.example.lessons.Solution120886;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem120886 {

    private final Solution120886 solution120886 = new Solution120886();

    @Test
    void test1() {
        String parameter1 = "olleh";
        String parameter2 = "hello";

        int result = solution120886.solution(parameter1, parameter2);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void test2() {
        String parameter1 = "allpe";
        String parameter2 = "apple";

        int result = solution120886.solution(parameter1, parameter2);

        assertThat(result).isEqualTo(0);
    }
}
