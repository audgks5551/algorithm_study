package lessons;

import org.example.lessons.Solution42748;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem42748 {

    private final Solution42748 solution42748 = new Solution42748();

    @Test
    void execute() {
        int[] parameter1 = {1, 5, 2, 6, 3, 7, 4};
        int[][] parameter2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] result = solution42748.solution(parameter1, parameter2);

        int[] correct = {5, 6, 3};

        assertThat(result).isEqualTo(correct);
    }
}
