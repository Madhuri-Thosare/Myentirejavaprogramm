package basicknowledge1;
public class Gloabalvariable 
{
	static int a = 100;
	static int b = 300;
	
	static void add()
	{
		a= 200;
		System.out.println(a+b);
	}
	static void sub()
	{
		System.out.println(a-b);
	}
	static void mul()
	{
		System.out.println(a*b);
	}
	static void mod()
	{
		System.out.println(a%b);
	}
	

	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		mod();
		
		
		// TODO Auto-generated method stub

	}

}
