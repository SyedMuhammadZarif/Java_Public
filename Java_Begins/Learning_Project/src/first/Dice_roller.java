//using while loops as well as .equalsIgnoreCase (interesting feature) also using random fuinction, made the GUI call shorter using alias
package first;
import java.util.InputMismatchException;
import java.util.Random;
import javax.swing.JOptionPane;

public class Dice_roller {
	
	public static void main(String[]args) {
	


	try{
		JOptionPane guibox = new JOptionPane();
		
		int flag = 1;
		int dice_sides = Integer.parseInt(guibox.showInputDialog("Hello!\nEnter sides of dice: "));
		while(flag==1)
		{
			Random random = new Random();
			int roll = random.nextInt(dice_sides)+1;
			guibox.showMessageDialog(null,"The Dice Rolled a: "+roll);
			String Flag = guibox.showInputDialog(null, "Do you want to continue?");
			if(Flag.equalsIgnoreCase("No")) {
				flag = 0;
			}
		}
	}
	catch(InputMismatchException | NumberFormatException ime){
		System.out.println("Enter a whole number!");
		JOptionPane.showMessageDialog(null,"Enter a whole number!");
	}

    }
}