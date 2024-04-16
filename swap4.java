package javaproject;

public class swap4 {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		//before swap
		System.out.println("before swap:");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		//swapping without creating third variable
	     a=a+b; //15
	     b=a-b; //10
		 a=a-b; //5
		
		
		//after swap
		System.out.println("after swap:");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
	}

	}


