import java.util.Scanner;
import java.util.*;
public class EmployeeMain{
	
	public static void main(String args[])
{
	Employee e1=new  Employee(45,"Pratik",45000);
	Employee e2=new Employee(91,"Ram",40000);

	System.out.println("Annual basic of employee 1="+e1.GetAnnualBasic());
	System.out.println("monthly gross of employee 1="+e1.GetmonthlyGross());
	System.out.println("Annual gross of employee 1="+e1.GetAnnualGross());
	System.out.println("monthly deduction of employee 1="+e1.GetMonthlyDeduction());
	System.out.println("monthly take home of employee 1="+e1.getMonthlyTakeHome());
	System.out.println("annual take home of employee 1="+e1.GetAnnualTakeHome());
	System.out.println("Annual basic of employee 2="+e2.GetAnnualBasic());
	System.out.println("monthly gross of employee 2="+e2.GetmonthlyGross());
	System.out.println("Annual gross of employee 2="+e2.GetAnnualGross());
	System.out.println("monthly deduction of employee 2="+e2.GetMonthlyDeduction());
	System.out.println("monthly take home of employee 2="+e2.getMonthlyTakeHome());
	System.out.println("Annual take home of employee 2="+e2.GetAnnualTakeHome());
}
}
