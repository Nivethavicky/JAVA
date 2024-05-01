package javaproject;

public class test_ques2 {

	
	    public static void main(String[] args) {
	        String input = "Hello World";
	        String result = removeEverySecondLetter(input);
	        System.out.println("Original string: " + input);
	        System.out.println("String after removing every second letter: " + result);
	    }

	    public static String removeEverySecondLetter(String input) {
	        String result = "";
	        for (int i = 0; i < input.length(); i++) {
	            if (i % 2 == 0) {
	                result += input.charAt(i);
	            }
	        }
	        return result;
	    }
	

	}


