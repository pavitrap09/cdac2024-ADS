package Assignment6;

public class BinarySearch {

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            
            if (arr[mid] == key) {
                return mid;
            }

         
            if (arr[mid] < key) {
                left = mid + 1;
            }
            
            else {
                right = mid - 1;
            }
        }

        
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {11, 12, 22, 25, 34, 64, 90};
        int key = 22;

        int result = binarySearch(arr, key);
        if (result != -1) {
            System.out.println("Element " + key + " found at index " + result);
        } else {
            System.out.println("Element " + key + " not found in the array");
        }
    }
}

