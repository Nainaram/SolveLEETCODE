import java.util.*;
class Solution {
    public int rangeSum(int[] nums, int left, int right, int n) {
        final int MOD = 1000000007;

        // Step 1: Compute all subarray sums
        List<Integer> subarraySums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += nums[j];
                subarraySums.add(currentSum);
            }
        }

        // Step 2: Sort the subarray sums
        Collections.sort(subarraySums);

        // Step 3: Ensure left and right are within the bounds of the sorted list
        if (left < 1 || right > subarraySums.size() || left > right) {
            throw new IllegalArgumentException("Invalid range: left or right index is out of bounds");
        }

        // Step 4: Compute the sum from index left to right
        long result = 0;
        for (int i = left - 1; i < right; i++) {
            result = (result + subarraySums.get(i)) % MOD;
        }

        return (int) result;
    }
}

public class RangeSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int left = 1; 
        int right = 5;
        int n = arr.length;

        Solution sc = new Solution();
        int result = sc.rangeSum(arr, left, right, n);
        System.out.println(result);
    }
}
 