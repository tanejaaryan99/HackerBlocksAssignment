import java.util.*;

public class ArrayPartiton {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        System.out.print(arrayPairSum(arr));
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i += 2) {
            ans += nums[i];
        }
        return ans;
    }
}