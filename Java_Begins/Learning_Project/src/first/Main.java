package first;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("I love coding (as long as it is productive and not a nerdy shitshow)");
		System.out.println("hi");
		System.out.println();
		int x = 23;
		long y = 323232323233L;
		float num = 90.09f;
		System.out.print("Your are ");
		System.out.print(x*x+num);
		System.out.print(" years old\n\n");
		System.out.println("It has been "+x+" years since you have been born");
		System.out.println("What have you accomplished?");
		char symbol = '@';
		
		String name = "Syed Muhammad Zarif";
		System.out.println("Please get your shit together "+ name+"\n\n");
		
		String p = "Band-aid";
		String q = "Antiseptic";
		
		System.out.println(p+" "+q);
		String temp;
		temp = p;
		p = q;
		q = temp; 
		System.out.println(p+" "+q);
		
		////////////////////////////OOP
		
		Class_Demo_Weapons AK47 = new Class_Demo_Weapons(); 
		
		AK47.name = "AK47";
		AK47.damage = 60;
		System.out.println("\n\n"+AK47.name);
		AK47.shoot();
		AK47.reload();
		
		
		
		Construct_Weapons weapon1 = new Construct_Weapons("m9",23,100);
		System.out.println("\n\n"+weapon1.name);
		System.out.println(weapon1.range+"m");
		System.out.println(weapon1.damage+"dps");//this is like self.name in Python

	}

}
