
public class Ch2Homework {

	public static void main(String[] args) {
				
		for (int i = 0; i < 10; i++) {
	        System.out.print("*");
	    }
	    System.out.println();
	    for (int i = 0; i < 10 - 2; i++) {
	        System.out.print("*");
	        for (int j = 0; j < 10 - 2; j++) {
	            System.out.print(" ");
	        }
	        System.out.println("*");
	    }
	    for (int i = 0; i < 10; i++) {
	        System.out.print("*");
	    }
	    System.out.println();
		// TODO Auto-generated method stub
	    
	    //Oval
	    for (int i = 0; i < 1; i++) {
	        System.out.print("   ");
	        for(int j=0;j<1;j++)
	        	System.out.print("***");
	    }
	    System.out.print("   ");
	    System.out.println();
	    for(int i=1;i<=1;i++)
	    {
	    	System.out.print(" *");
	    	for(int j=0;j<5;j++)
	    	{
	    		System.out.print(" ");
	    	}
	    	System.out.print("* ");
	    }
	    	
	    	System.out.println();
	    for (int i = 0; i < 5; i++) {
	        System.out.print("*");
	        for (int j = 0; j < 7; j++) {
	            System.out.print(" ");
	        }
	        System.out.println("*");
	    }
	    for(int i=1;i<=1;i++)
	    {
	    	System.out.print(" *");
	    	for(int j=0;j<5;j++)
	    	{
	    		System.out.print(" ");
	    	}
	    	System.out.print("* ");
	    }
	    System.out.println();
	    
	    
	    
	    for (int i = 0; i < 1; i++) {
	        System.out.print("   ");
	        for(int j=0;j<1;j++)
	        	System.out.print("***");
	    }
	    System.out.print("   ");
	    System.out.println();
	    System.out.println();

	    
	    //Arrow
	    for (int i=1; i<10; i += 2)
	    {
	        for (int k=0; k < (4 - i / 2); k++)
	        {
	            System.out.print(" ");
	        }
	        for (int j=0; j<i; j++)
	        {
	            System.out.print("*");
	        }
	        System.out.println("");
	    }
	    
	    for (int i = 0; i < 6; i++) {
	        System.out.print("    ");
	        for(int j=0;j<1;j++)
	        	System.out.println("*");
	    }
	    System.out.print("   ");
	    System.out.println();
	    //Diamond
	    int n=6;
	    int space = n - 1; 
	      
       
        for (int i = 0; i < n; i++) 
        { 
            
            for (int j = 0; j < space; j++) 
                System.out.print(" "); 
      
            for (int j = 0; j <= i; j++) 
                System.out.print("* "); 
      
            System.out.print("\n"); 
            space--; 
        } 
      
       
        space = 0; 
      
        
        for (int i = n; i > 0; i--) 
        { 
            
            for (int j = 0; j < space; j++) 
                System.out.print(" "); 
      
           
            for (int j = 0; j < i; j++) 
                System.out.print("* "); 
      
            System.out.print("\n"); 
            space++; 
        } 
    } 
	    
	    
	}


