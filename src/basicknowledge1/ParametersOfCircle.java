package basicknowledge1;
import java.util.Scanner;

public class ParametersOfCircle {
	final double pi= 3.141592;
	double radius = 0.0;
	double circleArea = 0.0;
	double circumferance = 0.0;
	
	void AreaofCircle() {
		System.out.println("Area Of Circle = " + (pi*radius*radius)+"\n");
		
	}
	
	void Circumferance() {
		System.out.println("circumferance = " + (2* pi*radius)+"\n");
		
	}
	
	public static void main(String[] args) 
	{
		ParametersOfCircle C1 = new ParametersOfCircle();
		Scanner S1 = new Scanner(System.in) ;
		System.out.println("Enter radius\n");
		C1.radius = S1.nextDouble();
		System.out.println("input radius =  \n" + C1.radius);
		C1.AreaofCircle();
		C1.Circumferance();
		

	}

}
