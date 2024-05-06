package basicknowledge1;

public class constructoroverloading 
{
	int i = 100;
	char c = 'M';
	boolean b = true;
	double d = 3.1444;
	long l = 566667;
	float f = (float) 3.4;
	String s = "sas";
	
	
	constructoroverloading(int i)
	{
		System.out.println(100);
	}
	constructoroverloading(char c)
	{
		System.out.println('M');
	}
	constructoroverloading(boolean b)
	{ 
		System.out.println(true);
	}
	constructoroverloading(double d)
	{
		System.out.println(3.1444);
	}
	constructoroverloading(long l)
	{
		System.out.println(566667);
	}
	constructoroverloading(float f)
	{
		System.out.println(566667);
	}
	constructoroverloading(String s)
	{
		System.out.println("sas");
	}
	public static void main(String[] args) 
	{
		
	}

}
