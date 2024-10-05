package first;

public class Class_Demo_Weapons {
	
	String name = "M4A1";
	int damage = 40;
	
	void shoot() {
		System.out.println("Bang");
	}
	
	void reload() {
		System.out.println("Reloading!");}
	/////////method overriding///gets it from public hence keyword
	public String toString(){
		
		return(name+" "+damage+ "dps");
	}
}

