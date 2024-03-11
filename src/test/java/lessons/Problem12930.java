package lessons;

import org.example.lessons.Solution12926;
import org.example.lessons.Solution12930;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class Problem12930 {

    private final Solution12930 solution12930 = new Solution12930();

    @Test
    void test1() {
        String parameter1 = "try hello world";

        String result = solution12930.solution(parameter1);

        assertThat(result).isEqualTo("TrY HeLlO WoRlD");
    }
}
