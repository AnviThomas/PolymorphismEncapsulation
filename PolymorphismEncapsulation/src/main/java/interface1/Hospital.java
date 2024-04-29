package interface1;

public class Hospital implements Doctors ,  Nurses{

	@Override
	public void show() {
		// TODO Auto-generated method stub
System.out.println("class A method inherited");
	}
	public void display()
	{
		System.out.println("Class B inherited");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital obj=new Hospital();
		obj.show();
		obj.display();
	}

}
