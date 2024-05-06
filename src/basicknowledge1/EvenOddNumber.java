package basicknowledge1;

public class EvenOddNumber 
{
	public static void main(String[] args) 
	{
	  int a = 0;
	  char flag = 'O'; //Even   'O' - Odd
	  
	  if(flag == 'E') System.out.println("Even numbers are : \n");
	  else System.out.println("Odd numbers are : \n");
	  
	  for (a=0; a<=100; a++)
	  {
		  if (flag == 'E')
		  {
			  if(a % 2==0)
			  {
				  System.out.print(a+" ") ;
			  }
		  }
		  else 
		  {
			  if(a%2 != 0)
			  {
				  System.out.print(a+" ") ; 
			  }
		  }
		  
	  }
	  /*
	  System.out.println("\n\nOdd numbers are : \n");
	  for (a=0; a<=100; a++)
	  {
		  if (a % 2!=0)
		  {
			  System.out.print(a + " ") ; 
		  }
		  
	  }
	 */
	}

}
