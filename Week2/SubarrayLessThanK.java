import java.util.*;

public class SubarrayLessThanK {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        System.out.print(numSubarrayProductLessThanK(arr, k));
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        // Write your code here
        int start = 0;
        int end = 0;
        int product = 1;
        int ans = 0;
        while (end < nums.length) {
            product = nums[end] * product;
            while (start <= end && product >= k) {
                product = product / nums[start];
                start++;
            }
            ans += end - start + 1;
            end++;
        }
        return ans;
    }
}