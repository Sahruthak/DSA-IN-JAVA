import java.util.*;

public class MinRotatedArray {
    public static void main(String[] args) {
        int ans = Integer.MAX_VALUE;
        int[] arr = {6, 1, 2, 3, 4, 5};
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int m = (low + high) / 2;

            if (arr[low] <= arr[high]) {
                ans = Math.min(ans, arr[low]);
                break;
            }

            if (arr[low] <= arr[m]) {
                ans = Math.min(ans, arr[low]);
                low = m + 1;
            } else {
                ans = Math.min(ans, arr[m]);
                high = m - 1;
            }
        }
        System.out.println(ans);
    }
}
