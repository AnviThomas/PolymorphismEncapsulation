package interface1;

public class Screen implements ScreenPlay1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Screen obj=new Screen();
		obj.show();
		obj.print();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("interface to interface ");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("2 interfaces implemented to the class");
	}

}
