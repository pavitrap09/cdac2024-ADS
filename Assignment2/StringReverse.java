package Assignment2;

public class StringReverse {
	public static String Reverse(String input){
		if( input.length()==0 || input.length()==1){return input;}
		return Reverse(input.substring(1))+input.charAt(0);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="pavitra";
		System.out.println("the rev of "+str+" is "+Reverse(str));
	}

}
