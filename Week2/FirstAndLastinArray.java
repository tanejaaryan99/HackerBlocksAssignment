import java.util.*;

public class FirstAndLastinArray {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        int[] ans = searchRange(arr, k);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        // Write your code here
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                arr[0] = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                arr[1] = i;
                break;
            }
        }
        return arr;
    }
}