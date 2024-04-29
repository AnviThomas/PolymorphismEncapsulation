package encapsulation;

public class Bank {
private String name;
private String emailid;
private long account;
public void setter(String name, String emailid ,long account)
{
	this.name=name;
	this.emailid=emailid;
	this.account=account;
}
public void getter()
{
	System.out.println("Bank name is " + name + " " + "Email id is " + emailid+ "Account number is " +" " + account);
}
}
