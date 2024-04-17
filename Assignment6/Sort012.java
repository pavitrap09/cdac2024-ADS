package Assignment6;

public class Sort012 {

    public static void sort012(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // Swap arr[low] and arr[mid]
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    // Swap arr[mid] and arr[high]
                    int temp2 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp2;
                    high--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        System.out.println("Array before sorting:");
        printArray(arr);
        sort012(arr);
        System.out.println("Array after sorting:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

