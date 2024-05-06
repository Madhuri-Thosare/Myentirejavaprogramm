package AutomationTestingBatch41;

import java.util.Arrays;

public class CountofSpace {
        static int count_space=0;
	public static void main(String[] args) {
		String name="madhuri jitendra thosare";
		
		char [] c1 = name.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		for (int i=0;i<c1.length; i++)
		{
			boolean answer = Character.isSpaceChar(c1[i]);
			if (answer ==true)
			{
				count_space++;
			}

		}
		System.out.println("The total count of space are->" +count_space);
		
}

		// TODO Auto-generated method stub

	}


