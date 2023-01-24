

interface Demo
{
	public abstract void display();
}

class P25 implements Demo
{
	public void display()
	{
		System.out.println("interface ");		
	}
	
	public static void main(String args[])
	{
		P25 obj = new P25();
		obj.display();
	}
	
}
