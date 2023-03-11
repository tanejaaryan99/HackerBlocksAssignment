import java.util.*;

public class SearchInRotatedSortedArr {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        int target = scn.nextInt();
        System.out.print(search(arr, target));
    }

    public static int search(int[] arr, int target) {
        // Write your code here
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[lo] <= arr[mid]) {
                if (target >= arr[lo] && target <= arr[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else if (arr[mid] <= arr[hi]) {
                if (target >= arr[mid] && target <= arr[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }
}