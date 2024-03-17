package lessons;

import org.example.lessons.Solution120888;
import org.example.lessons.Solution42576;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem42576 {

    private final Solution42576 solution42576 = new Solution42576();

    @Test
    void test1() {
        String[] parameter1 = {"leo", "kiki", "eden"};
        String[] parameter2 = {"eden", "kiki"};

        String result = solution42576.solution(parameter1, parameter2);

        assertThat(result).isEqualTo("leo");
    }

    @Test
    void test2() {
        String[] parameter1 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] parameter2 = {"josipa", "filipa", "marina", "nikola"};

        String result = solution42576.solution(parameter1, parameter2);

        assertThat(result).isEqualTo("vinko");
    }

    @Test
    void test3() {
        String[] parameter1 = {"mislav", "stanko", "mislav", "ana"};
        String[] parameter2 = {"stanko", "ana", "mislav"};

        String result = solution42576.solution(parameter1, parameter2);

        assertThat(result).isEqualTo("mislav");
    }
}
