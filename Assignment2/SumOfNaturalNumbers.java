package Assignment2;

public class SumOfNaturalNumbers {
	
	    public static int sumOfNumbers(int n) {
	        if (n == 0) {
	            return 0;
	        } else {
	            return n + sumOfNumbers(n - 1);
	        }
	    }

	    public static void main(String[] args) {
	        int n = 5; // Change n to whatever value you want
	        int sum = sumOfNumbers(n);
	        System.out.println("Sum of natural numbers up to " + n + " is: " + sum);
	    }
	}


