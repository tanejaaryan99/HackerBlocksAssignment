import java.util.*;

public class BookAllcProb {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(bookAllocation(arr, n, m));
            t--;
        }
    }

    public static int bookAllocation(int arr[], int n, int m) {
        int s = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

        }
        int e = sum;
        int mid = s + (e - s) / 2;
        int ans = -1;
        while (s <= e) {
            if (isPossible(arr, n, m, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
            mid = s + (e - s) / 2;
        }
        return ans;
    }

    public static boolean isPossible(int arr[], int n, int m, int mid) {
        int studentCount = 1;
        int pageSum = 0;
        for (int i = 0; i < n; i++) {
            if (pageSum + arr[i] <= mid) {
                pageSum += arr[i];

            } else {
                studentCount++;
                if (studentCount > m || arr[i] > mid) {
                    return false;
                }
                pageSum = arr[i];
            }
        }
        return true;
    }
}