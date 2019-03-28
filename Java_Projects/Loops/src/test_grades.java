import java.util.Scanner;
public class test_grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String original, reverse = ""; // Objects of String class
	     
	      System.out.println("Enter a number to check if it is a palindrome");
	      original = input.nextLine();
	     
	      int length = original.length();
	      if(length<=5)
	      {
	      for (int i = length-1 ; i >= 0; i--)
	      {
	        reverse = reverse + original.charAt(i);
	      	System.out.println(reverse);
	      }	
	      if (original.equals(reverse))
	         System.out.println("The string is a palindrome.");
	      else
	         System.out.println("The string isn't a palindrome.");
	      }
	      else
	    	 System.out.print("Cannot be more than 5 numbers");
	   }
	      
	}


