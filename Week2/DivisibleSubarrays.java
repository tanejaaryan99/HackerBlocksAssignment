import java.util.*;

public class DivisibleSubarrays {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = scn.nextInt();
            System.out.println(subarraysDivByK(arr, n));
        }
    }

    public static long subarraysDivByK(int[] nums, int k) {
        int[] count = new int[k];
        count[0] = 1;
        int sum = 0;
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = (sum + nums[i]) % k;
            if (sum < 0) {
                sum += k;
            }
            ans += count[sum];
            count[sum]++;
        }
        return ans;

    }
}