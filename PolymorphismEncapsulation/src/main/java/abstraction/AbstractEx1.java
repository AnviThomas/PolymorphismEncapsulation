package abstraction;

public class AbstractEx1 extends AbstractionEx{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractEx1 obj=new AbstractEx1();
		obj.display();
		obj.show();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Child class method overridden");
	}

}
