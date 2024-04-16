package javaproject;

public class Reverse {
	 public static String reverseString(String str) {
			String reversed=" ";  //empty string to store the reversed string
			for(int i=str.length()-1;i>=0;i--) {
				reversed +=str.charAt(i);
				
			}
			return reversed;
		 }	
	
	public static void main(String[] args) {
		String original= "hello world! this is fine";
		String reversed = reverseString(original);
		System.out.println("original string:"+original);
		System.out.println("Reversed string:"+reversed);
			
	}

}
