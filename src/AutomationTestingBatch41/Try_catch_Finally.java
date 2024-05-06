package AutomationTestingBatch41;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch_Finally {

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
	    finally
	    {
	    	System.out.println("Thankyou for visiting us, come again");
	    }
	    // TODO Auto-generated method stub

	}

}
