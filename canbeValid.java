public class canbeValid {

    public static void main(String[] args) {
        
            // ()()() is considered as valid , here both the strings of same length , in locked string if it is 0 then it can modified , if it is 1 it cannot be modified , here in this below example 
            // 0-(->)  if it is 0 you can change 
            // 1-) x ->  if it is 1 you cannot change
            // if there is a () pair then it return true;
            String s = "())(()";
            String locked ="010100";
            boolean result =Solution.canBeValid(s,locked);
            System.out.println(result);
    }
}
class Solution {
    public static  boolean canBeValid(String s, String locked) {

                if(s.length()%2!=0){
                    return false;
                }
                int open = 0,close =0,unlocked1 =0,unlocked2 =0;
                for(int i=0;i<s.length();i++){
                    if( locked.charAt(i)=='0') unlocked1++;
                    else if(s.charAt(i)=='(') open++;
                     else if(s.charAt(i)==')') open--;
                     if(open+unlocked1<0){
                        return false;
                     }
                     int j = s.length()-i-1;
                     if(locked.charAt(j)=='0') unlocked2++;
                     else if(s.charAt(j)==')') close++;
                     else if(s.charAt(j)=='(') close--;
                     if(close+unlocked2 < 0){
                        return false;
                     }

                    
                }
                return true;

    }
}
