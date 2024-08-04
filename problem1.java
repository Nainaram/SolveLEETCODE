// package SolveLEETCODE;
// this is the leetcode of medium and this program given an  binary array  we have to make all the ones in the distinct position so that they are all at same side or adjacent using the  circular array nature 
// example array  => nums = [0,1,0,1,1,0,1]
// lets try the code.
// Create a function that take an array as a  input and return the minswaps in array to be taken
class Solution{

    public int minSwap(int [] nums){
        int n = nums.length;
        int totalOnes = 0;// intialize the 1's counter in the array.
        // Below loop will count  the 1's
        for(int num : nums){
            if(num == 1){
                totalOnes++;
            }
        }
        // BASE CASE IF THERE ARE NO 1'S OR ONLY ONE 1 IN THE ARRAY
        if(totalOnes == 0 || totalOnes ==1 ){
            return 0;
        }
        //Create a doubleArray to make circular array nature
        int [] doubleArray = new int[2*n];
        for(int i = 0;i<n;i++){
            doubleArray[i] = nums[i];
            doubleArray[i+n]=nums[i];
        }
        int  CurrentOnes  =0;
        int MaxOnesinwindow = 0;
        // Max ones in the intial window , window could be size of the no of total ones
        for(int i = 0;i<totalOnes;i++){
            if(doubleArray[i] == 1){
                CurrentOnes++;
            }
        }
        MaxOnesinwindow = CurrentOnes;
        // MaxOnes in the remaining of the circular array.
        for(int i=totalOnes; i<2*n;i++){
            if(doubleArray[i] == 1){
                CurrentOnes++;
            }
            if(doubleArray[i-totalOnes] == 1){
                CurrentOnes--;
            }
            MaxOnesinwindow = Math.max(MaxOnesinwindow, CurrentOnes);
        }
        return totalOnes-MaxOnesinwindow;
    }
}
public class problem1{
    public static void main(String[] args) {
        int [] arr = {0,1,1,1,0,0,1,1,0};
        Solution SC = new Solution();
       int minswap = SC.minSwap(arr);
       System.out.println(minswap);
}
    }
   
    