import java.util.Scanner;

public class multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);

int x,y;
System.out.print("Enter first integer: ");
x=input.nextInt();

System.out.print("Enter second integer: ");
y=input.nextInt();

if(x%y==0)
{
	
	System.out.println(x + " is a multiple of " + y);
	
}
if(x%y!=0)
{
	
	System.out.println(x + " is not a multiple of " + y);
	
}		
	}

}
