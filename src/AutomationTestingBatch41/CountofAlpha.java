package AutomationTestingBatch41;

import java.util.Arrays;

public class CountofAlpha {
        static int countofalpha = 0;
	public static void main(String[] args) {
		String name="madhuri";
		
		char [] c1 = name.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		for (int i=0;i<c1.length; i++)
		{
			boolean answer = Character.isAlphabetic(c1[0]);
			if (answer ==true)
			{
				countofalpha++;
			}

		}
		System.out.println("The total count of Alphabet are->" +countofalpha);
		
		// TODO Auto-generated method stub

	}

}
