import java.util.Scanner;
public class calculateSales 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		float sum_1=0,sum_2=0,sum_3=0,sum_4=0,sum_5=0;
		int product;
		float quantity;
		
		for(int i=1;i<=5;i++)
		{
		
		
		
		System.out.println("How much quantity did you sell of product  "+i );
		quantity=in.nextFloat();
		product=i;
		
		switch(product)
		{
		case 1:
			
			sum_1+=quantity*=2.98;
			break;
		case 2:
			
			sum_2+=quantity*=4.50;
			break;
		case 3:
			
			sum_3+=quantity*=9.98;
			break;
		case 4:
		
			sum_4+=quantity*=4.49;
			break;
		case 5:
			
			sum_5+=quantity*=6.87;
			break;
		}
	
		}
		System.out.println("Sales for product 1 were: $"+ sum_1);
		System.out.println("Sales for product 2 were: $"+ sum_2);
		System.out.println("Sales for product 3 were: $"+ sum_3);
		System.out.println("Sales for product 4 were: $"+ sum_4);
		System.out.println("Sales for product 5 were: $"+ sum_5);
		// TODO Auto-generated method stub

	}

}
