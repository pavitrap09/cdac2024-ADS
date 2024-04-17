package Assignment2;

public class Sumofarray {
	
	    public static int arraySum(int[] arr, int n) {
	        // Base case: when n is 0, return 0
	        if (n <= 0) {
	            return 0;
	        } else {
	            // Recursive step: add current element and sum of remaining elements
	            return arr[n - 1] + arraySum(arr, n - 1);
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5}; // Example array
	        int sum = arraySum(arr, arr.length);
	        System.out.println("Sum of array elements: " + sum);
	    }
	}


