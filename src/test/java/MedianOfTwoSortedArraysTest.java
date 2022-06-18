import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {
    int[] num1 = {1, 2, 3, 4, 5};
    int[] num2 = {5, 4, 3, 2, 1};
    int[] num3 = {};
    int[] num4 = null;
    int[] num5 = {15, 14, 13, 12, 11};

    @Test
    void 정렬() {
        assertTrue(MedianOfTwoSortedArrays.isSortedArray(num1));
        assertFalse(MedianOfTwoSortedArrays.isSortedArray(num2));
    }

    @Test
    void 비어있는() {
        assertTrue(MedianOfTwoSortedArrays.isEmptyArray(num3));
        assertFalse(MedianOfTwoSortedArrays.isEmptyArray(num1));
    }

    @Test
    void null인지() {
        assertTrue(MedianOfTwoSortedArrays.isNoneNullArray(num1));
        assertFalse(MedianOfTwoSortedArrays.isNoneNullArray(num4));
    }

    @Test
    void 조합확인() {
        int[] targetArr = {1, 2, 3, 4, 5};
        int[] resultArr;

        resultArr = MedianOfTwoSortedArrays.combineTwoArray(num1, num2);
        assertTrue(Arrays.equals(targetArr, resultArr));
    }

    @Test
    void 조합확인2() {
        int[] targetArr = {1, 2, 3, 4, 5, 11, 12, 13, 14 ,15};
        int[] resultArr;

        resultArr = MedianOfTwoSortedArrays.combineTwoArray(num1, num5);
        assertTrue(Arrays.equals(targetArr, resultArr));
    }
}