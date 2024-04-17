package Assignment6;

import java.util.*;

public class SortElementsByFrequency {

    public static void sortByFrequency(int[] arr) {
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        
        Comparator<Map.Entry<Integer, Integer>> frequencyComparator = (a, b) -> {
            if (a.getValue().equals(b.getValue())) {
                
                return a.getKey() - b.getKey();
            }
           
            return b.getValue() - a.getValue();
        };

        
        List<Map.Entry<Integer, Integer>> frequencyList = new ArrayList<>(frequencyMap.entrySet());
        Collections.sort(frequencyList, frequencyComparator);

        
        for (Map.Entry<Integer, Integer> entry : frequencyList) {
            int num = entry.getKey();
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 4, 2, 1, 1, 1, 3, 3, 3, 5};
        System.out.println("Array before sorting by frequency:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Array after sorting by frequency:");
        sortByFrequency(arr);
    }
}

