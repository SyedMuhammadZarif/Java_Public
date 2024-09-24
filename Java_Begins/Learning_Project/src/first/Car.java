package first;

public class Car {

	
	private String make;
	private String model;
	private int year;
	
	Car(String make,String model,int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	Car(Car x){ /////////OL constructor that takes Car object as an input
		this.copy(x);
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void copy(Car x) {///////////////copying the car with a method, this method will 
						 	//be called from a car object and take a car object as an input
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}
		
}
