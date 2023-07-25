public class JumpSearch {
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        int blockSize = (int) Math.sqrt(n);
        int step = blockSize;
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += blockSize;
            if (prev >= n) {
                return -1; // Target value not found in the array
            }
        }

        // Perform linear search in the current block
        while (arr[prev] < target) {
            prev++;
            if (prev == Math.min(step, n)) {
                return -1; // Target value not found in the array
            }
        }

        if (arr[prev] == target) {
            return prev; // Target value found at index prev
        }

        return -1; // Target value not found in the array
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int targetValue = 11;
        int resultIndex = jumpSearch(sortedArray, targetValue);

        if (resultIndex != -1) {
            System.out.println("Target value " + targetValue + " found at index " + resultIndex + ".");
        } else {
            System.out.println("Target value " + targetValue + " not found in the array.");
        }
    }
}
