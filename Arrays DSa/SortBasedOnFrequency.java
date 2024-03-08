//Sort the elements based on frequency and value

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Integer[] inputArray = {1, 2, 1, 3, 5, 6, 6, 5, 5, 1, 2};
        
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : inputArray) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        Arrays.sort(inputArray, (a, b) -> {
            if (countMap.get(a).equals(countMap.get(b))) {
                
                return Integer.compare(b, a);
            }
            
            return Integer.compare(countMap.get(b), countMap.get(a));
        });
        
        System.out.print("\nSorted Array by Frequency: ");
        for (int num : inputArray) {
            System.out.print(num + " ");
        }
    }
}
