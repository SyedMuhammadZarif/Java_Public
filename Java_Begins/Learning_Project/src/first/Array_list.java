package first;
import java.util.ArrayList;
public class Array_list {
	public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<String>();//must have wrapper class, must import ArrayList
		food.add("Pizza");
		food.add("Burger");
		food.add("Pasta");// add serially to idx
		food.set(0, " Depression");//change value
		for(int i = 0; i<food.size(); i++) {
			System.out.print(food.get(i)+" ");//gets value at idx
		}
		
	}
}
