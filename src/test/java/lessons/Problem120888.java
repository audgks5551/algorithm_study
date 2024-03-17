package lessons;

import org.example.lessons.Solution120888;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem120888 {

    private final Solution120888 solution120888 = new Solution120888();

    @Test
    void test1() {
        String parameter1 = "people";

        String result = solution120888.solution(parameter1);

        assertThat(result).isEqualTo("peol");
    }

    @Test
    void test2() {
        String parameter1 = "We are the world";

        String result = solution120888.solution(parameter1);

        assertThat(result).isEqualTo("We arthwold");
    }
}
