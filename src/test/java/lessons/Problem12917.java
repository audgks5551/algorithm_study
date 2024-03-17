package lessons;

import org.example.lessons.Solution12917;
import org.example.lessons.Solution42748;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem12917 {

    private final Solution12917 solution12917 = new Solution12917();

    @Test
    void execute() {
        String result = solution12917.solution("Zbcdefg");

        assertThat(result).isEqualTo("gfedcbZ");
    }
}
