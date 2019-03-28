import java.util.Scanner;
public class waterPark {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int choice;
		do {
		int members,age,kid_t=0,reg_t=0,sen_t=0;
		double total=0;
		
		final double TAX=1.07;
		
		System.out.println("Welcome to our Waterpark!!!");
		
		System.out.println("Please enter the number of members in your group: ");
		members=input.nextInt();
		int []ages =new int[members];
		
		System.out.print("Please enter the ages for each person in your group: ");
		for(int i=0;i<ages.length;i++)
		{
			
			age=input.nextInt();
			ages[i]=age;
		}
		for(int i=0;i<ages.length;i++)
		{
			if(ages[i]<=12)
				kid_t++;
			if(ages[i]>12&&ages[i]<55)
				reg_t++;
			if(ages[i]>=55)
				sen_t++;
		}
		
		total=getTotal(kid_t,reg_t,sen_t);
		double full_total=total*TAX;
		
		System.out.printf("Pleae pay the total of $%.2f + 7 percent tax = $%.2f",total,full_total);
		pickUp(kid_t,reg_t,sen_t);
		
		System.out.println("Please Press a positive number or 0 for next customer,Negative number to end");
		
		choice=input.nextInt();
		}while(choice>=0);
	}


public static double getTotal(int kid_t,int reg_t,int sen_t)
{
	double total=0;
	total=(kid_t*12.5)+(reg_t*18.25)+(sen_t*15.00);
	
	return total;
}
public static void pickUp(int kid_t,int reg_t,int sen_t)
{
	System.out.println("\nAnd pick up");
	System.out.println(kid_t+ " Kid Tickets");
	System.out.println(reg_t+ " Regular Tickets");
	System.out.println(sen_t+ " Senior Tickets");
}
}
