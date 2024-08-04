// package SolveLEETCODE;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        String s = "hello";

        // Count character frequencies
        for (char ch : s.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print the map
        for (Character key : charCountMap.keySet()) {
            System.out.println(key + ": " + charCountMap.get(key));
        }
    }
}
