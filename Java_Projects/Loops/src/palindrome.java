import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int r,sum=0,num,temp=0;   
		 
		  Scanner in = new Scanner(System.in);
		  System.out.println("Enter a number to see if it's a palindrome");
		  num= in.nextInt();
		  temp=num;
		  int length = String.valueOf(num).length();
		  System.out.println(length);
		  System.out.println(num);
		  if(length<=5)
		  {
		  
		  while(num>0){    
		   r=num%10;
		   
		   sum=(sum*10)+r;    
		   num/=10;
		   System.out.println(sum);
		  }  
		  System.out.println(temp);
		  
		  if(temp ==sum)    
		   System.out.println("palindrome number ");    
		  
		  else    
		   System.out.println("not palindrome"); 
		  }
		  
		  else
		System.out.print("Number must be only 5 digits");
	}

}
