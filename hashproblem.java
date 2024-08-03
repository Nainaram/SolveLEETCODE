package SolveLEETCODE;
// this is leetcode problem that  having a string order of specific allocation of the character and another string s which also need to be in the same order of the characters present inthe order string 
// we are going to create the customSortString function to get through the problem , so lets begin
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
class customSortString {
    static String customeString(String order, String s) {
        // count the characters of the s that you are gonna sort as per order string
        // characters
        // for that Create HashMap
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        // Create a StringBuilder to construct the result
        StringBuilder result = new StringBuilder();
        // append the character into the result
        for (char ch : order.toCharArray()) {
            if (charCountMap.containsKey(ch)) {
                int count = charCountMap.get(ch);
                result.append(String.valueOf(ch).repeat(count));
                charCountMap.remove(ch);
            }
        }
        // append the remaining characters ofthe s which are not in order.
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            result.append(String.valueOf(ch).repeat(count));
        }
        return result.toString();
    }
}

public class hashproblem {
    public static void main(String[] args) {
        String order = "abcdge";
        String s = "bchinnda";
        customSortString css = new customSortString();
         String result = css.customeString(order, s);
         System.out.println(result);

    }
}
