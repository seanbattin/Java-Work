/*
 * Sean Battin
 * Ch5 Classwork
 * 5.22
 * 
 * This program reads in a temperature and then converts it to either fahrenheit or celsius
 * 
 */





import java.util.Scanner;
public class tempConverter {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		
		double temp,result;
		String tempType;
		
		System.out.print("Enter a temperature: ");
		temp=in.nextDouble();
		for(;;)
		{
		
		System.out.print("Is that in Fahrenheit or Celsius? ");
		tempType=in.next();
		if(tempType.equalsIgnoreCase("Fahrenheit")||tempType.equalsIgnoreCase("Celsius"))
			break;
		else
			System.out.println("\nCheck Spelling. Invalid Temperature Type!!!\n");
			continue;
		}
		
		if(tempType.equalsIgnoreCase("Celsius"))
		{
		 result=celsiusToFahrenheit(temp);
		System.out.println(temp+" degrees Celsius is "+result + " degrees Fahrenheit.");
		}
		
		if(tempType.equalsIgnoreCase("Fahrenheit"))
		{
		result=fahrenheitToCelsius(temp);
		System.out.println(temp+" degrees Fahrenheit is "+result + " degrees Celsius.");
		}
		// TODO Auto-generated method stub

	}
	public static double celsiusToFahrenheit(double x)
	{
		 x= x*1.8 +32;
		
		return x;
	}
	public static double fahrenheitToCelsius(double x)
	{
		 x= (x-32)/1.8;
		
		return x;
	}

}
