package lessons;

import org.example.lessons.Solution12926;
import org.example.lessons.Solution12932;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class Problem12926 {

    private final Solution12926 solution12926 = new Solution12926();

    @Test
    void test1() {
        String parameter1 = "AB";
        int parameter2 = 1;

        String result = solution12926.solution(parameter1, parameter2);

        assertThat(result).isEqualTo("BC");
    }

    @Test
    void test2() {
        String parameter1 = "z";
        int parameter2 = 1;

        String result = solution12926.solution(parameter1, parameter2);

        assertThat(result).isEqualTo("a");
    }

    @Test
    void test3() {
        String parameter1 = "a B z";
        int parameter2 = 4;

        String result = solution12926.solution(parameter1, parameter2);

        assertThat(result).isEqualTo("e F d");
    }
}
