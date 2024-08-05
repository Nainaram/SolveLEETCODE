import java.util.*;
class Solution{
    // A distinct string is a string that is present only once in an array.
//Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".
//Note that the strings are considered in the order in which they appear in the array.
    public String Kthdistinct(String[] str,int k){
        // base case to check string is not empty
        if(str.length == 0){return "";}
        // using hashmap to  add the unique strings and count no of times it occurs
        Map<String ,Integer> countMap =  new HashMap<>();
        // count the occurence of each string
        for(String s : str){
            countMap.put(s,countMap.getOrDefault(s, 0) +1);
        }
        // add the strings from the map to list
        List<String> distinctList = new ArrayList<>();
        for(String s : str){
           if (countMap.get(s)==1){
            distinctList.add(s);
           }
        }
       // System.out.println(distinctList);
        if(k>0 && k <= distinctList.size()){
            return distinctList.get(k-1);
        }
        else{
            return "";
        }
    }
}
public class Kthdistinct{
    public static void main(String[] args) {
        String [] str = { "a","b","c","a","b","d"};
        int k = 2;
        Solution sc = new Solution();
        String result = sc.Kthdistinct(str, k);
        System.out.println(result);
    }
}