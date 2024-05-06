packagpackage student;

public class Deepika 
{
public void add()
{
System.out.println("1");	
}
private void sub()
{
	System.out.println("2");	

}
protected void mul()
{
	System.out.println("3");	

}
void div()
{
	System.out.println("4");	

}


package teacher;

import student.Deepika;

public class DeepeshYadav 
{
public static void main(String[] args)
{
	Deepika d1=new Deepika();
	d1.add();

	
}
}

package teacher;

import student.Deepika;

public class Manish 
{
public static void main(String[] args) 
{
	Rashi r1=new Rashi();
	r1.add();
	r1.div();
	r1.mul();

	
}
}
package teacher;

public class Rashi {
	public void add()
	{
	System.out.println("1");	
	}
	private void sub()
	{
		System.out.println("2");	

	}
	protected void mul()
	{
		System.out.println("3");	

	}
	void div()
	{
		System.out.println("4");	

	}
}
package teacher;
import student.Deepika;
public class SaurabhKhandway extends Deepika
{
public static void main(String[] args) 
{
	SaurabhKhandway s1=new SaurabhKhandway();
	s1.add();
	s1.mul();
	
}
}