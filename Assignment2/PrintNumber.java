package Assignment2;

public class PrintNumber {
	
	    public static void printNumbers(int n) {
	        if (n > 0) {
	            printNumbers(n - 1);
	            System.out.println(n);
	        }
	    }

	    public static void main(String[] args) {
	        int n = 10; // Change n to whatever value you want
	        printNumbers(n);
	    }
	}


