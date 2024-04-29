package polymorphism;

public class Universities extends School{
public void show()
{
	super.show();
	System.out.println("Universities are judging");
}
public static void main(String args[])
{
	Universities obj=new Universities();
	obj.show();
	
}
}
