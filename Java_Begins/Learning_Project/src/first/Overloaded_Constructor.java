package first;

public class Overloaded_Constructor {
	
	String dough;
	String cheese;
	String toppings;
	
	Overloaded_Constructor(String dough, String cheese, String toppings){
		this.dough = dough;
		this.cheese = cheese;
		this.toppings = toppings;
		
	}
	////////same constructor different parameter
	
	Overloaded_Constructor(String dough, String cheese){
		this.dough = dough;
		this.cheese = cheese;
		
	}
}
