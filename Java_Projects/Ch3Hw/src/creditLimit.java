import java.util.Scanner;
public class creditLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int customers,account_num,balance;
		int credit_limit,credits,charges;
		
		System.out.println("Enter the number of customers: ");
		customers=in.nextInt();
		
		for(int i=1;i<=customers;i++)
		{
			System.out.println("Enter the account number: ");
			account_num=in.nextInt();
			
			System.out.println("Enter the starting balance: ");
			balance=in.nextInt();
			
			System.out.println("Enter the total of items charged: ");
			charges=in.nextInt();
			
			System.out.println("Enter the total of credits applied: ");
			credits=in.nextInt();
			
			System.out.println("Enter the credit limit allowed: ");
			credit_limit=in.nextInt();
			
			int newBalance=balance+charges-credits;
			
			if(newBalance>credit_limit)
			{
				System.out.println("Credit Limit exceeded!");
			}
			else
			{
				System.out.println("Credit Limit not exceeded!");

			}
		}
		
	}

}
