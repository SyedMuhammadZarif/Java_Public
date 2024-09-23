package first;
import javax.swing.JOptionPane;
import java.util.Scanner; //just practicing

public class Hypotenuse {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);//just practice
		
		//some fun with math class demo
		double Query1 = Double.parseDouble(JOptionPane.showInputDialog("Enter first number: "));
		double Query2 = Double.parseDouble(JOptionPane.showInputDialog("Enter second number: "));
		double Answer = Math.max(Query1, Query2);
		JOptionPane.showMessageDialog(null, Answer+" is the bigger number");
		
		//actual hypotenuse code:
		double Base = Double.parseDouble(JOptionPane.showInputDialog("Enter base of triangle: "));
		double Height = Double.parseDouble(JOptionPane.showInputDialog("Enter height of triangle: "));
		double Hypotenuse = Math.sqrt(Math.pow(Base, 2)+Math.pow(Height, 2));
		JOptionPane.showMessageDialog(null, "The hypotenuse is: "+Hypotenuse);
		scan.close();
	}
}
