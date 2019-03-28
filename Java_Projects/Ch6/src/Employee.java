
public class Employee 
{
	
	private String f_name,l_name;
	private double salary;
	//default constructor
	public Employee(String f_name,String l_name,double salary)
	{
		this.f_name=f_name;
		this.l_name=l_name;
		
		
		if(salary>0.0)
		this.salary=salary;
	}
	public void setF_Name(String f_name)
	{
		
		this.f_name=f_name;
		
		
	}
	public String geF_Name()
	{
	
	return f_name;
	}
	public void setL_Name(String l_name)
	{
		
		this.l_name=l_name;
		
		
	}
	public String getL_Name()
	{
	
	return l_name;
	}
	public double getSalary()
	{
		return salary;
	}
	public double Raise()
	{
		
		if(salary>0)
			salary+=salary*.10;
		return salary;
				
				
	}

}
