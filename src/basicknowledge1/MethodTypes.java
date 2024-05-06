package basicknowledge1;

public class MethodTypes 
{
	MethodTypes()
	{
	int a = 280;
	int b = 340;
	System.out.println("con"+(a+b));
	}
	
   void add ()
   {
	   int a = 670;
	   int b = 456;
	   System.out.println("sum"+(a+b));
   }
   void sub ()
   {
	   int a = 670;
	   int b = 456;
	   System.out.println("sub"+(a-b));
   }
   static void addition()
   {
	   int a = 670;
	   int b = 456;
	   System.out.println("sumAdd"+(a+b));  
   }
   static void add (double a, long b)
   {
	   System.out.println("sumPara"+(a+b));
	   
   }   
   
   public static void main(String[] args) 
   {
	  MethodTypes mob= new MethodTypes();
   	   mob.add();
   	   mob.sub();
   	   addition();
   	   
   	   add (445.80 , (long)350000000);
   }

}
