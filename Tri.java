package com.sataym.newweb;

public class Tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 if (args.length < 1) {
	            System.out.println("Please provide a string as a command line argument.");
	            return;
	        }

	        String inputString = args[0];

	        if (isPalindrome(inputString)) {
	            System.out.println("\"" + inputString + "\" is a palindrome.");
	        } else {
	            System.out.println("\"" + inputString + "\" is not a palindrome.");
	        }
	    }

	    public static boolean isPalindrome(String str) {
	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }

	        return true;
	    }
}


