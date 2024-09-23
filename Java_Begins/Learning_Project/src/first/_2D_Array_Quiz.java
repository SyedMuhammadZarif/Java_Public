package first;
import java.util.Scanner;

public class _2D_Array_Quiz {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] Questions = {"1) What is the size of an int in Java? ", 
				"2) Which method is used to compare two strings in Java for equality?",
				"3) What will happen if an array index is out of bounds in Java?",
				"4) Which keyword is used to prevent inheritance in Java?"};
		
		String[][] Options = 
			{
			{"A) 4 bytes","B) 2 bytes", "C) 8 bytes", "D) None of the above"},
			{"A) ==","B) ++", "C) compareTo()", "D) equals()"},
			{"A) Program Terminates","B) ArrayIndexOutOfBoundsException", "C) Array auto resizes", "D) None of the above"},
			{"A) static","B) final", "C) const", "D) None of the above"}
			};
		
		char[] Anskeys = {'A', 'C', 'B', 'B'};
		double score = 0;//needs to be double, if in, then needs to be casted to Double
		
		for(int i = 0; i<= Questions.length-1; i++) 
		{
			
			System.out.println(Questions[i]);
			for(int j = 0; j<=3;j++) 
			{
				System.out.println(Options[i][j]+"\n");
			}
			String ans = scan.nextLine();
			System.out.println(ans);
			if((ans.charAt(0))==(Anskeys[i])) 
			{
				score++;
				System.out.println(score);
			}
		}
		System.out.println("Here is your score: "+ ((score/(Questions.length))*100)+"%");
	
	
	
	
	}
	
}
