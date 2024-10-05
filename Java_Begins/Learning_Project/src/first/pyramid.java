package first;
import java.util.Scanner;
public class pyramid {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		int spaces = 1;
		char symb = '@';
		int chars = -1;
		for(int i = 0; i<=spaces; i++) {
			chars+=2;
			for(int j = spaces-i; j>0; j--) {
				System.out.print(" ");
			}
			
			for(int k =0; k<chars; k++) {
				System.out.print(symb);
			}
			System.out.print("\n");
		}
	}
}
