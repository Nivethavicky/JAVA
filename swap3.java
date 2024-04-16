package javaproject;

public class swap3 {	
	public static void main(String[] args) {
		int a=10;
		int b=5;
		//before swap
		System.out.println("before swap:");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		//creating temp var to store the swap value
		int temp = a;
		a=b;
		b=temp;
		
		//after swap
		System.out.println("after swap:");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
	}

}
