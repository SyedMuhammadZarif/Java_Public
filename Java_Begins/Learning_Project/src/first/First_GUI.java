package first;


import javax.swing.JOptionPane;
public class First_GUI {
	public static void main(String[]args) {
		String name = JOptionPane.showInputDialog("Ener your name: ");
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
		
		JOptionPane.showMessageDialog(null,  "Hello "+name+ "\nYou are "+age+" years old");
		
	}

}
