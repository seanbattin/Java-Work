import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	        int number = 0;
	        int largest = 0;
	        int smallest=0;

	        for(int counter=1;counter <= 5;counter++) {
	            
	            System.out.println("Enter the number");
	            Scanner in=new Scanner(System.in);
	            number = in.nextInt();
	            if(counter==1)
	            {
	            	smallest=number;
	            }
	            if (number > largest) 
	            {
	                largest = number;
	            } 
	            if(counter==1)
	            {
	            	smallest=number;
	            }
	            else if (number < smallest) 
	            {
	                smallest = number;
	            }

	            // Display Largest and Smallest
	           
	        }
	        System.out.println("largest number is: " + largest);
            System.out.println("smallest number is: " + smallest);
	}
}
