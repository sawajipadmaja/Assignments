

class Parent
{
	void display()
	{
		System.out.println("Parent class method");
	}
	
}

class Child extends Parent
{
	void display()
	{
		System.out.println("Child class method");
	}
}

class P29 
{
	public static void main(String args[])
	{
		Parent p = new Parent();
		p.display();
		Child c = new Child();
		c.display();
	}
}