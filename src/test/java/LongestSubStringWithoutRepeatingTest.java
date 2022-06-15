import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubStringWithoutRepeatingTest {
    @Test
    void test1() {
        String str = "abcdefg";
        String result = LongestSubStringWithoutRepeating2.getResult(str);

        assertEquals("result = abcdefg maxSize = 7", result);
    }

    @Test
    void test2() {
        String str = "ioodkapps";
        String result = LongestSubStringWithoutRepeating2.getResult(str);

        assertEquals("result = odkap maxSize = 5", result);
    }

    @Test
    void test3() {
        String str = "kkqjkkksjak";
        String result = LongestSubStringWithoutRepeating2.getResult(str);

        assertEquals("result = ksja maxSize = 4", result);
    }

    @Test
    void test4() {
        String str = "abcajkasacxab";
        String result = LongestSubStringWithoutRepeating2.getResult(str);

        assertEquals("result = bcajk maxSize = 5", result);
    }
}