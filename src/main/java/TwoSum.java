/**
 *  Two Sum
 *  Given an array of integers, return indices of the two numbers such that they
 *  add up to a specific target.
 *
 *  You may assume that each input would have exactly one solution,
 *  and you may not use the same element twice.
 *
 *  Example:
 *
 *  Given nums = [2, 7, 11, 15]
 *        target = 9
 *
 *  Because nums[0] + nums[1] = 2 + 7 = 9
 *  return [0, 1].
 */

/**
 *  What I'm considering is
 *
 *  - operand can not bigger than target
 *  - if element is only one
 *  - if every expression I can made with all the elements can not satisfied (reaching target number)
 *  - Is array ordered ? (it wasn't needed because I used HashMap -> compare to HashCode)
 *  - if there are many expression can reach target number ?
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        int[] integerArr = {2, 7, 11, 15};
        map = putAllElement(integerArr, map);
        int target = 26;

        for(int resultNum : getHitTwoIdx(map, integerArr, target)){
            System.out.print(resultNum + " ");
        }
    }

    public static int[] getHitTwoIdx(Map<Integer, Integer> map, int[] integerArr, int target){
        int[] result = new int[2];

        for(int idx = 0; idx < integerArr.length; idx++){
            int search = target -integerArr[idx];
            if(map.containsKey(search)){
                result[0] = integerArr[idx];
                result[1] = map.get(search);
            }
        }

        return result;
    }

    public static Map<Integer, Integer> putAllElement(int[] integerArr, Map<Integer, Integer> map){
        for(int idx = 0; idx < integerArr.length; idx++){
            map.put(integerArr[idx], integerArr[idx]);
        }

        return map;
    }
}
