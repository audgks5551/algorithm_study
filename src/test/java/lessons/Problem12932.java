package lessons;

import org.assertj.core.api.Assertions;
import org.example.lessons.Solution12932;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class Problem12932 {

    private final Solution12932 solution12932 = new Solution12932();

    @Test
    void execute() {
        long parameter = 12345;

        int[] result = solution12932.solution(parameter);

        int[] correct = {5, 4, 3, 2, 1};

        assertThat(result).isEqualTo(correct);
    }
}
