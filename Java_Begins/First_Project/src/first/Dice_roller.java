//using while loops as well as .equalsIgnoreCase (interesting feature) also using random fuinction, made the GUI call shorter using alias
package first;
import java.util.Random;
import javax.swing.JOptionPane;

public class Dice_roller {
	
	public static void main(String[]args) {
	
		
		Random random = new Random();
		JOptionPane guibox = new JOptionPane();
		
		int flag = 1;
		int dice_sides = Integer.parseInt(guibox.showInputDialog(null, "Hello!\nEnter sides of dice: "));
		while(flag==1)
		{
			int roll = random.nextInt(dice_sides)+1;
			guibox.showMessageDialog(null,"The Dice Rolled a: "+roll);
			String Flag = guibox.showInputDialog(null, "Do you want to continue?");
			if(Flag.equalsIgnoreCase("No")) {
				flag = 0;
			}
		}
	}
}