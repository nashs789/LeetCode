import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * MedianOfTwoSortedArrays
 *
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 *
 * Find the median of the two sorted arrays.
 * The overall run time complexity should be O(log(m+n)). -> 복잡도 모르겠음....
 *
 * You may assume nums1 and nums2 cannot be both empty.
 *
 * Example 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * The median is 2.0
 *
 * Example 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * The median is (2 + 3) / 2 = 2.5
 */

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] num1 = {1, 3};
        int[] num2 = {4, 2};
        int[] resultArr;
        int resultArrLen;
        double median = 0.0;

        if (isEmptyArray(num1) || !isNoneNullArray(num1)) {
            System.out.println("적합하지 않은 배열 입니다.");
            return;
        }

        if (isEmptyArray(num2) || !isNoneNullArray(num2)) {
            System.out.println("적합하지 않은 배열 입니다.");
            return;
        }

        resultArr = combineTwoArray(num1, num2);
        resultArrLen = resultArr.length;
        
        if(resultArr.length % 2 == 0){
            median = (resultArr[ (resultArrLen / 2) - 1] + resultArr[ resultArrLen / 2]) / 2.0;
        } else {
            median = resultArr[ resultArrLen / 2];
        }
        System.out.println("median = " + median);
    }

    public static int[] combineTwoArray(int[] arr1, int[] arr2){
        Integer[] newArr1 = Arrays.stream(arr1).boxed().toArray(Integer[]::new);
        Integer[] newArr2 = Arrays.stream(arr2).boxed().toArray(Integer[]::new);
        Integer[] newArr = Stream.of(newArr1, newArr2).flatMap(Stream::of).distinct().sorted().toArray(Integer[]::new);

        return Arrays.stream(newArr).mapToInt(Integer::intValue).toArray();
    }

    public static boolean isSortedArray(int[] arr){
        return IntStream.range(0, arr.length - 1).noneMatch(idx -> arr[idx] > arr[idx + 1]);
    }

    public static boolean isNoneNullArray(int[] arr){
        return arr != null ? true : false;
    }

    public static boolean isEmptyArray(int[] arr){
        return arr.length == 0 ? true : false;
    }
}
