/*
 * Sean Battin
 * Ch 4 Homework
 * 
 * This program computes the factorial of numbers 1-20
 * 
 */

public class factorial {

	public static void main(String[] args) {
		System.out.println("number\tfactorial");
		
		int counter=1;
		while(counter<=20)
		{
			long num=counter;
			int counter_2=1;
			while(counter_2!=counter)
			{
				num=num*(counter-counter_2);
				counter_2++;
			}
			
			
			
			System.out.println(counter+"\t"+num	);
		
			counter++;
		}
		// TODO Auto-generated method stub

	}

}
