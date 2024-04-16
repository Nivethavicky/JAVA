package javaproject;

public class vowel {
	
	public static boolean checkVowel(String str) {
		for(int i=0;i<str.length();i++) 
		{
			char ch = str.charAt(i);
			if(ch=='a' || ch=='e'|| ch=='i' || ch=='o'|| ch=='u')
			{
				return true;
			}
		 }
		
		return false;
	}

	public static void main(String[] args) {
		 String str="hello";
		 if(checkVowel(str))
		 {
		  System.out.println("string contians vowel");
		 }
		 else
		 {
		  System.out.println("string do not contian vowel");	 
		 }	 
	}
}
