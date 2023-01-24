

class Parentcls
{
	void display()
	{
		System.out.println("Parent class method");
	}
	
}

class Childcls extends Parentcls
{
	void display()
	{
		super.display();
		System.out.println("Child class method");
	}
}

class P30
{
	public static void main(String args[])
	{
		Childcls c = new Childcls();
		c.display();
	}
}