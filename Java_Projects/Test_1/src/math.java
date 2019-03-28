import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.15
		Scanner input= new Scanner(System.in);
		int largest=0;
		int smallest=0;
		System.out.print("Enter your first number: ");
		int number1= input.nextInt();
		
		System.out.print("Enter your second number: ");
		int number2=input.nextInt();
		
		System.out.print("Enter your third number: ");
		int number3=input.nextInt();
		
		int sum= number1 + number2+number3;
		int mult= number1 * number2*number3;
		int average=sum/3;
		
		if(number1>=number2 && number1>=number3)
			largest =number1;
		if(number2>=number1 && number2>=number3)
			largest =number2;
		if(number3>=number1 && number3>=number2)
			largest =number3;
		
		if(number1<=number2 && number1<=number3)
			smallest =number1;
		if(number2<=number1 && number2<=number3)
			smallest =number2;
		if(number3<=number2 && number3<=number1)
			smallest =number3;
		System.out.printf("The sum is: %d%n",sum);
		System.out.printf("The product is: %d%n", mult);
		System.out.printf("The average is: %d%n", average);
		
		System.out.printf("The largest number is: %d%n",largest);
		System.out.printf("The smallest number is: %d%n",smallest);

		
		
		
	}
	//end of main

}
//end of class math
