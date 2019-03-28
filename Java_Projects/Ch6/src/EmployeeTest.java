import java.util.Scanner;
public class EmployeeTest {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.printf("%-20s%-20s%-20s%-20s%n","First Name","Last Name","Salary","Raise Salary");
		 
		Employee employee_1=new Employee("Bob","Jones",40000);
		System.out.printf("%-20s%-20s%-20.2f%-20.2f%n",employee_1.geF_Name(),employee_1.getL_Name()
				,employee_1.getSalary(),employee_1.Raise());
		 
		Employee employee_2=new Employee("Jane","Jones",67870);
		System.out.printf("%-20s%-20s%-20.2f%-20.2f%n",employee_2.geF_Name(),employee_2.getL_Name()
					,employee_2.getSalary(),employee_2.Raise());
		 
		 
	}

	

}
