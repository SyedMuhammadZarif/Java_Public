package first;

public class Methods {
	public static void main(String[] args) {
		
		String Name = "Syed";
		int Age = 23;
		hello(Name,Age);
	}
	static void hello(String name, int age) {
		System.out.println("Hello "+name+"!\nYou are "+age+" Years Old!\n");
		
		System.out.println(add(2,3.4));
		System.out.println(add(2,3));
	
		
		//printf method
		System.out.printf("You have %d messages\n", 23);
		System.out.printf("You have %.1f  battery remaining\n", 23.44);// %xf where x is precision
		System.out.printf("You have %s messages\n", "lots of");// suing "=+ before s will justify it to left
	}
	
	//Overloaded methods
	static int add(int a, int b) {
		return a+b;
	}
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	static int add(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	static double add(double a, double b) {
		return a+b;
	}
	
	
	
}
