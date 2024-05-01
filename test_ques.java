package javaproject;

public class test_ques {
	
	
	    public static void main(String[] args) {
	        int number = 10; // Change this to the desired number for which you want to print the tables

	        for (int i = 1; i <= 10; i++) {
	            printTableRow(number, i);
	            try {
	                Thread.sleep(5000); // Sleep for 5 seconds
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    public static void printTableRow(int number, int count) {
	        System.out.println(number + " x " + count + " = " + (number * count));
	    
	

	    }
}

