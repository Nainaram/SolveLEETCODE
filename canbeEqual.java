package SolveLEETCODE;

import java.util.Arrays;

class Solution{
    public boolean canbeEql(int [] arr,int [] target){
        // return false if the both array length is not equal
        if(arr.length != target.length){
            return false;
        }
        // sort the arrays
        Arrays.sort(arr);
        Arrays.sort(target);
        return Arrays.equals(arr, target);
    }
}
public class canbeEqual {
    public static void main(String[] args) {
        int arr [] ={ 4,3,2,1};
        int target [] = { 1,2,3,4};
        Solution SC = new Solution();
        boolean result = SC.canbeEql(arr,target);
        System.out.println(result);
    }
    
}
