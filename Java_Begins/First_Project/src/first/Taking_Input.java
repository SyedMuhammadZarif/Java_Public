package first;

import java.util.Scanner;
public class Taking_Input {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?: ");
		String name = scanner.nextLine();
		System.out.println("Enter Age: ");
		int value = scanner.nextInt();
		scanner.nextLine();//clear next line char because next int does not clear it
		System.out.println("Emter your favourite game: ");
		String game = scanner.nextLine();
		System.out.println("Hello there "+name+"! Welcome to OOP hell");
		System.out.println("You are "+ value+ " years old!\nYour favourite game is: "+ game);
		
		
				}
}
