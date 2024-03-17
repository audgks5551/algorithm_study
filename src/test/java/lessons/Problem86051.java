package lessons;

import org.example.lessons.Solution120886;
import org.example.lessons.Solution86051;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem86051 {

    private final Solution86051 solution86051 = new Solution86051();

    @Test
    void test1() {
        int[] parameter1 = {1, 2, 3, 4, 6, 7, 8, 0};

        int result = solution86051.solution(parameter1);

        assertThat(result).isEqualTo(14);
    }

    @Test
    void test2() {
        int[] parameter1 = {5,8,4,0,6,7,9};

        int result = solution86051.solution(parameter1);

        assertThat(result).isEqualTo(6);
    }
}
