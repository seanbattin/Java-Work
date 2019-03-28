import java.util.Scanner;
import java.security.SecureRandom;
public class diceRoll {

	public static void main(String[] args) 
	{
		SecureRandom randomNumbers = new SecureRandom();
		int sum[]=new int[13];
		
		for(int i=0;i<sum.length;i++)
		{
			sum[i]=0;
		}
		for(int i=1;i<36000;i++)
		{
			int face1=1+randomNumbers.nextInt(6);
			int face2=1+randomNumbers.nextInt(6);
			sum[face1+face2]++;
		}
		System.out.println("Sum\tFrequency\tPercent");
		for ( int k = 2; k < sum.length; k++ )
	      {
	        int percent = sum[ k ] / ( 360 );
	        System.out.println( k+"\t"+sum[ k ]+"\t\t"+percent+"\t" );
	      } // end for		
	}

}
