package first;

public class Construct_Weapons {
	//need to create definitions here
	String name;
	int damage;
	int range;
	
	Construct_Weapons(String name, int dmg, int range){ //must be same as class name
		
		this.name = name;
		this.damage = dmg;
		this.range = range;
		
	}
	void shoot() {
		System.out.println("Bang");
	}
	
	void reload() {
		System.out.println("Reloading!");
	}
}
