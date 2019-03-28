import java.util.Scanner;
public class gasMileage {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int trips,miles,gallons;
		float mpg,sum=0,avg,all_mpg;
		System.out.print("How many trips will you will taking: ");
		trips=in.nextInt();
		for(int i=1;i<=trips;i++)
		{
			System.out.println("\nHow many miles did you travel for trip "+ i);
			miles=in.nextInt();
			System.out.println("How many gallons did you use for trip "+ i);
			gallons=in.nextInt();
			mpg=(float)miles/gallons;
			sum+=mpg;
			System.out.println("The miles per gallon for trip "+ i +" was "+ mpg+ " miles per gallon");
			
			System.out.println("The combined mpg is: " + sum);
		}
		avg=sum/trips;
		
		System.out.println("\nThe average mpg was: " + avg);
		
		
		
		// TODO Auto-generated method stub

	}

}
