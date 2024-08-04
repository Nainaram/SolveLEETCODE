// package SolveLEETCODE;
import java.util.HashSet;

class Solution{
    public boolean hasAllcodes(String s ,int k){
       // check if the string length is less than the k , then it impossible to have all the binary  codes of size k
       if(s.length() < k){
        return false;
       }
       // Count number of the binary substrings of k that is 2^k;
       int totalCodes = 1 << k;
       // Create a HashSet to store all the uniques binary codes
       HashSet<String> seenCodes = new HashSet<>();
       // iterate through the string and add the substrings of size 2 in to the hashset
       for( int i  = 0; i <=s.length() - k; i++){
        String code = s.substring(i,i+k);
        seenCodes.add(code);
        }
        return seenCodes.size() == totalCodes; // it will check weather codes added equal to actual codes to be.
    }
   
}
public class hasAllCodes {
    
    public static void main(String[] args) {
        String str  ="011101010001";
        int k =3;
        Solution sc = new Solution();
        
        boolean result = sc.hasAllcodes(str ,k);
        System.out.println(result);
    }
}
