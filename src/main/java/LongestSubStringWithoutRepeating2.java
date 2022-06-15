import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Longest Substring Without Repeating
 *
 * Given a String, find the length of the longest substring
 * without repeating characters
 *
 * Example:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LongestSubStringWithoutRepeating2 {
    public static void main(String[] args) {
        String[] strArray = {"abcabcbb", "bbbbb", "pwwkew"};

        for(int idx = 0; idx < strArray.length; idx++){
            String result = getResult(strArray[idx]);
            System.out.println(result);
        }
    }

    public static String getResult(String str){
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int strLen = str.length();
        int maxSize = 0;
        String tempStr = "";
        String result = "";
        
        for(int idx = 0; idx < strLen; idx++){
            int letter = str.charAt(idx);
            if( map.containsKey(letter) ){
                tempStr = getStartString(map, letter);
                map.clear();
                tempStr += Character.toString(letter);
            } else {
                tempStr += Character.toString(letter);
            }
            map.put(letter, letter);

            if(maxSize < tempStr.length()){
                maxSize = tempStr.length();
                result = tempStr;
            }
        }
        
        return "result = " + result + " maxSize = " + maxSize;
    }

    public static String getStartString(Map<Integer, Integer> map, int dupLetter) {

        Iterator it = map.keySet().iterator();
        String result = "";

        while(it.hasNext()){
            int key = (int) it.next();
            result += Character.toString(map.get(key));

            if(dupLetter == key){
                result = "";
            }
        }

        return result;
    }
}
