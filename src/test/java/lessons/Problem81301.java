package lessons;

import org.example.lessons.Solution12916;
import org.example.lessons.Solution81301;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem81301 {

    private final Solution81301 solution81301 = new Solution81301();

    @Test
    void test1() {
        String parameter1 = "one4seveneight";

        int result = solution81301.solution(parameter1);

        assertThat(result).isEqualTo(1478);
    }

    @Test
    void test2() {
        String parameter1 = "23four5six7";

        int result = solution81301.solution(parameter1);

        assertThat(result).isEqualTo(234567);
    }

    @Test
    void test3() {
        String parameter1 = "2three45sixseven";

        int result = solution81301.solution(parameter1);

        assertThat(result).isEqualTo(234567);
    }

    @Test
    void test4() {
        String parameter1 = "123";

        int result = solution81301.solution(parameter1);

        assertThat(result).isEqualTo(123);
    }
}
