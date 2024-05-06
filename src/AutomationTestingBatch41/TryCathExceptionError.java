package AutomationTestingBatch41;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCathExceptionError {

	public static void main(String[] args) {
		
		    Scanner s1 = new Scanner(System.in);
		    try {
		    int age = s1.nextInt();
		    System.out.println(age);
		    }
		    catch (InputMismatchException a1)
		    {
		    	System.out.println("Handed the Exception");
		    }
		    
		    catch (NullPointerException a2)
		    		{
		    	System.out.println("Handed the Exception 1");
		    
		    		}
		    catch (IndexoutOfBoundsException a3)
		    {
		    	System.out.println("Handed the Exception 2");
		    }
		// TODO Auto-generated method stub

	}

}
