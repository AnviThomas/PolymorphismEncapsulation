package encapsulation;

public class EmployeeDetails {
public static void main(String args[])
{
	Employee obj=new Employee();
	obj.setName("Anvi");
	obj.setSalary(15000);
	System.out.println(obj.getName());
	System.out.println(obj.getSalary());
}
}
