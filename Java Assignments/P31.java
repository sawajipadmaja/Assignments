
abstract class Base 
{
	abstract void fun();
	
	void display()
	{
		System.out.println("Base class method");
	}
}

class Derived extends Base 
{
	void fun()
	{
		System.out.println("Derived class method");
	}
}


class P31 
{
	public static void main(String args[])
	{		
		Base b = new Derived();
		b.fun();
		Derived d = new Derived();
		d.display();
	}
}
