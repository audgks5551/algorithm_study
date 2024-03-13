package lessons;

import org.example.lessons.Solution72410;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem72410 {

    private final Solution72410 solution72410 = new Solution72410();

    @Test
    void test1() {
        String result = solution72410.solution("...!@BaT#*..y.abcdefghijklm");

        assertThat(result).isEqualTo("bat.y.abcdefghi");
    }

    @Test
    void test2() {
        String result = solution72410.solution("z-+.^.");

        assertThat(result).isEqualTo("z--");
    }

    @Test
    void test3() {
        String result = solution72410.solution("=.=");

        assertThat(result).isEqualTo("aaa");
    }

    @Test
    void test4() {
        String result = solution72410.solution("123_.def");

        assertThat(result).isEqualTo("123_.def");
    }

    @Test
    void test5() {
        String result = solution72410.solution("abcdefghijklmn.p");

        assertThat(result).isEqualTo("abcdefghijklmn");
    }
}
