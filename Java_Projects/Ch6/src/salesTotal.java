import java.util.Scanner;
public class salesTotal {

	public static void main(String[] args) 
	{
		
		int row;
		int col;
		Scanner input=new Scanner(System.in);
		int sales[][]={{100,200,150,200,650},{200,400,375,234,1209},
		{200,678,230,567,1675},{480,567,876,345,2268},{450,345,678,912,2385},
		{1430,2190,2309,2258,8187}};
	
		
		System.out.printf("%s","Salesman\t");
		for(int i=1;i<6;i++)
		{
			if(i==5)
				System.out.print("Totals");
			else
			System.out.print(i+"\t");
			
		}
		
		System.out.println();
		for(int i=0;i<sales.length;i++)
		{
			if(i==5)
				System.out.print("Totals\t\t");
			else
			System.out.print("Product Number" +(i+1)+" ");
			
			for(int j=0;j<sales[i].length;j++)
			{
				
				
				System.out.print(sales[i][j]+ "\t");
				
				
			}
			System.out.println();
		}
		
	}

}
