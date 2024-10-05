package first;

public class Main {

	public static void main(String[] args) {
		// basics
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
		/////////////////////////////////////////////
		String p = "Band-aid";
		String q = "Antiseptic";
		
		System.out.println(p+" "+q);
		String temp;
		temp = p;
		p = q;
		q = temp; 
		System.out.println(p+" "+q);
		
		////////////////////////////OOP/////////////////////
		
		Class_Demo_Weapons AK47 = new Class_Demo_Weapons(); 
		
		AK47.name = "AK47";
		AK47.damage = 60;
		System.out.println("\n\n"+AK47.name);
		AK47.shoot();
		AK47.reload();
		///////////////////////to string method overriding////////////////
		System.out.println(AK47.toString());
		
		//////////////////////////////////////////////////constructors///////////
		Construct_Weapons weapon1 = new Construct_Weapons("m9",23,100);
		System.out.println("\n\n"+weapon1.name);
		System.out.println(weapon1.range+"m");
		System.out.println(weapon1.damage+"dps");//this is like self.name in Python
		
		///////////////////////////////////////////////Overloading a constructor, i.e, same constructor name yet different parameters
		Overloaded_Constructor pizza1 = new Overloaded_Constructor("thin","Mozarella","mushrooms");
		System.out.println(pizza1.dough);
		System.out.println(pizza1.cheese);
		System.out.println(pizza1.toppings);
		
		Overloaded_Constructor pizza2 = new Overloaded_Constructor("thin", "cheddar");
		System.out.println(pizza2.dough+" "+pizza2.cheese);
		
		/////////////////array of objects/////////////
		
		Construct_Weapons ak47 = new Construct_Weapons("ak47", 40,200);
		Construct_Weapons m4a1 = new Construct_Weapons("m4a1", 36, 180);
		
		Construct_Weapons[] armory = {ak47, m4a1};
		
		System.out.println(armory[0]);////this is the memory address
		System.out.println(armory[0].name+" "+armory[0].range);///this is accessing and printing
		///////////////////////// not adding super, static and abstract as unnecessary and easy   r
		///////////////////copy objects//////////////////////////
		Car car1 = new Car("Chevrolet","Camaro",2021);
		//Car car2 = new Car("Ford","Mustang",2022);
		//car2.copy(car1);//////////the og one
		Car car2 = new Car(car1);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());


		Cat kitty = new Cat("Gushun", "meow", 1);
		kitty.meow();
		System.out.println(kitty.name);

		Cat tintin = new Cat(kitty);
		tintin.set_animal_name("Tin Tin");
		System.out.println(tintin.name);
		System.out.println(tintin.age);
		tintin.clawsofa();
		kitty.clawsofa();
//////////////////////////////////////////////INTERFACES/////////////
		Prey_Rabbit buni = new Prey_Rabbit();
		buni.flee();
	}

}
