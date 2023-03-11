import java.util.*;

public class FindMinInRotatedSortedArr {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        System.out.print(findMin(arr));
    }

    public static int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}