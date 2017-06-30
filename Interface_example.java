interface IHello
{
	public void HelloWorld(String msg);
}
//hello git
class Hello
{
	public void helloworld()
	{
		System.out.println("this is parent");
	}

 	public void hh()
	{
		System.out.println("this is parent's hh()");
	}
}
public class Interface_example extends Hello implements IHello{

	public void HelloWorld(String msg)
	{	
		System.out.println("your messasge is :"+ msg);
	}
	public void helloworld()
	{
		System.out.println("this is child");	
	}
	
 	public void hh()
	{	super.hh();
		System.out.println("this is child's hh()");
	}
	
	public static void main(String[] args)
	{
		Interface_example i= new Interface_example();
		i.HelloWorld("LIVE LONG AND PROSPER!!");
		IHello ih=new Interface_example();// INTERFACE VARIABLE REFERENCING iNTERFACE_EXAMPLE OBJECT
		ih.HelloWorld("To ERR is to human");


		i.helloworld();
		Hello i2=new Hello();
		i2.helloworld();
		Hello i3= new Interface_example();   //RUN-TIME POLYMORPHISM
		i3.helloworld();

		i.hh();
		
		
		

	}
}
