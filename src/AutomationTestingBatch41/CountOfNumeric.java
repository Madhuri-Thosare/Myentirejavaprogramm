package AutomationTestingBatch41;

import java.util.Arrays;

public class CountOfNumeric {

	        static int count_numeric=0;
		public static void main(String[] args) {
			String name="madhuri1234567";
			
			char [] c1 = name.toCharArray();
			
			System.out.println(Arrays.toString(c1));
			for (int i=0;i<c1.length; i++)
			{
				boolean answer = Character.isDigit(c1[i]);
				if (answer ==true)
				{
					count_numeric++;
				}

			}
			System.out.println("The total count of numeric are->" +count_numeric);
			
	}

}
