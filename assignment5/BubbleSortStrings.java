package assignment5;

public class BubbleSortStrings {

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
           
            for (int j = 0; j < n - i - 1; j++) {
                
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape", "kiwi"};
        System.out.println("Array before sorting:");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("Array after sorting:");
        printArray(arr);
    }

    public static void printArray(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}

