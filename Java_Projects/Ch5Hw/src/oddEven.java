import java.util.Scanner;
public class oddEven {

	public static void main(String[] args) 
	{
	Scanner in=new Scanner(System.in);
	//variable declarations
	int o,e,choice=1;
	do
	{
	System.out.println("Enter the number of odd intgers you would like to add: ");
	
	o=in.nextInt();
	
	if(o<1||o>10000)
	{
		System.out.println("Number must be between 0 and 10,000!!");
		continue;
	}
	//calls odd method
	oddDisplay(o);
	
	//asks user for input 

	System.out.println("Enter the number of even intgers you would like to add: ");
	e=in.nextInt();
	//validates input
	if(e<1||e>10000)
	{
		System.out.println("Number must be between 0 and 10,000!!");
		continue;
	}
	//calls even method
	evenDisplay(e);
	//prompts user to continue or quit
	System.out.println("Enter a negative to number to quit or a postive number to continue.");

	choice=in.nextInt();
	}while(choice>0);
	}
	//odd method that prints the table and sum
	public static int oddDisplay(int odd)
	{
		int sum=0;
		int num=1;
		for(int i=1;i<=odd;i++)
		{
			
			
			num+=2;
			if(i==1)
				num=1;
			
			sum+=num;
			System.out.println(i+"\t"+ num+"\t"+sum);
			
			
		}
		System.out.println("The sum of the first "+ odd + " odd integers is "+sum);
		return odd;
	}
	//even method that prints even table and sum
	public static int evenDisplay(int even)
	{
		int sum=0;
		
		int num=2;
		int i=1;
		do
		{
			
			
			num+=2;
			if(i==1)
				num=2;
			
			sum+=num;
			System.out.println(i+"\t"+ num+"\t"+sum);
			i++;
			
		}while(i<=even);
		System.out.println("The sum of the first "+ even + " even integers is "+sum);
		return even;
	}

}
