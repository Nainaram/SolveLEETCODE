import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int minimumPushes(String word) {
       int [] letterFrequency = new int[26];
       for(char c: word.toCharArray()){
        letterFrequency[c-'a']++;
       }
       Integer []  sortedFreq = new Integer[26];
       for(int i =0; i<26;i++){
        sortedFreq[i] = letterFrequency[i];
       }
       Arrays.sort(sortedFreq,Collections.reverseOrder());
       int totalPresses = 0;
       for( int i = 0; i<26;i++){
        if(sortedFreq[i] == 0) break;
        totalPresses += (i/8+1)*sortedFreq[i];
       }
        return totalPresses;
    }
}
public class MinimumPush{
    public static void main(String[] args) {
        Solution sc = new Solution();
        String word = "abcde";
        int result = sc.minimumPushes(word);
        System.out.println(result);
    }
}