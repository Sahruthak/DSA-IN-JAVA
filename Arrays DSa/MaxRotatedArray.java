import java.util.*;

public class MaxRotatedArray {
    public static void main(String[] args) {
        
        int[] arr = {8, 9, 10, 11, 1, 2, 3, 4, 5, 6};
        int ans = arr[0];
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int m = (low + high) / 2;

            if (arr[low] <= arr[high]) {
                ans = Math.max(ans, arr[high]);
                break;
            }

            if (arr[low] <= arr[m]) {
                ans = Math.max(ans, arr[m]);
                low = m + 1;
            } else {
                ans = Math.max(ans, arr[high]);
                high = m - 1;
            }
        }
        System.out.println(ans);
    }
}