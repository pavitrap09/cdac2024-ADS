package Assignment6;

public class LinearSearch {

    public static int linearSearch(int[] arr, int key) {
        // Traverse the array sequentially
        for (int i = 0; i < arr.length; i++) {
            // If the current element equals the key, return its index
            if (arr[i] == key) {
                return i;
            }
        }
        // If key is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int key = 22;

        int result = linearSearch(arr, key);
        if (result != -1) {
            System.out.println("Element " + key + " found at index " + result);
        } else {
            System.out.println("Element " + key + " not found in the array");
        }
    }
}

