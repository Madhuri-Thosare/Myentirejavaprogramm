package AutomationTestingBatch41;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

	
	public static void main(String[] args) {
		int n1 = 3;
		int n1 = 4;
		String name[] = new String [n1];
		 name[0] ="madhuri";
	     name[1] ="dev";
	     name[2] ="jitu";
	     name[3] ="ramu";
	     
	     Scanner c1 = new Scanner(System.in);
		    try {
		    int age = c1.nextInt();
		    System.out.println();
		    }
		    catch (InputMismatchException n1)
		    {
		    	System.out.println("Handed the Exception");
		    }
		// TODO Auto-generated method stub

	}

}
