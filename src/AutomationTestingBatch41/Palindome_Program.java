package AutomationTestingBatch41;

public class Palindome_Program 
{

	public static void main(String[] args) 
	{
		String input = "madhuri";
		String reverse ="";
		
		for (int i=input.length()-1;i>=0;i--)
		{
		char op=	input.charAt(i);
		reverse=reverse+op;
		
		System.out.println(reverse);
		}
		
		
		// TODO Auto-generated method stub

	}

}
