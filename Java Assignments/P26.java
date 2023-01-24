

class Test //parent class
{
	public void display1()
	{
		System.out.println("Parent class method");
	}
}

class P26 extends Test //child class
{
	public void display2()
	{
		System.out.println("Child class method");
	}
	
	public static void main(String args[])
	{
		P26 obj = new P26();
		obj.display1();
		obj.display2();
	}
}