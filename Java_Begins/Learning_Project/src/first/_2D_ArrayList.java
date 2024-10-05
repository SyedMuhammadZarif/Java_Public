package first;
import java.util.*;

public class _2D_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> WebDev = new ArrayList<>();
		ArrayList<String> AppDev = new ArrayList<>();
		ArrayList<String> SoftDev = new ArrayList<>();
		ArrayList<ArrayList<String>> Skills = new ArrayList<>();
		Skills.add(SoftDev);
		Skills.add(AppDev);
		Skills.add(WebDev);
		
		WebDev.add("HTML/CSS");
		WebDev.add("Ruby");
		WebDev.add("Elixir");
		WebDev.add("PHP");
		WebDev.add("MongoDB");
		WebDev.add("TypeScript");
		
		SoftDev.add("GoLang");
		SoftDev.add("Python");
		SoftDev.add("C#");
		SoftDev.add("C++");
		SoftDev.add("Java");
		
		AppDev.add("Python");
		AppDev.add("C++");
		AppDev.add("JavaScript");
		AppDev.add("Java");

		System.out.println(Skills.get(1).getFirst());
		System.out.println(Skills.getLast().getLast());
        for (ArrayList<String> skill : Skills) {

            System.out.println(skill + "\n");
        }
		
	}

}
