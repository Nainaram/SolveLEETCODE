public class minimumLength {

    public static void main(String[] args) {

    // in this given string you have to find the min length of the string after deleting the character from both left and right side ofthe selected character then return the minimum length
            String s = "abaacbcbb";
            System.out.println(Solution.minimumLength(s));
    }
}
class Solution {
    public static  int minimumLength(String s) {        
        int[] arr=new int[26];

        //Counting the char
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }

        //Applying the rules
        for(int i=0; i<26; i++){
            while(arr[i]>=3){
                arr[i]-=2;
            }
        }
        
        int len=0;
        //Counting the length of final string
        for(int i=0; i<26; i++){
            len+=arr[i];
        }        

        return len;
    }
}
