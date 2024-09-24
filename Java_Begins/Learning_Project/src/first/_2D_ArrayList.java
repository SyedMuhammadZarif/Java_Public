package first;
import java.util.*;

public class _2D_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> WebDev = new ArrayList<String>();
		ArrayList<String> AppDev = new ArrayList<String>();
		ArrayList<String> SoftDev = new ArrayList<String>();
		ArrayList<ArrayList<String>> Skills = new ArrayList<ArrayList<String>>();
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
	
		for(int i=0; i<Skills.size();i++) {
			
			System.out.println(Skills.get(i)+"\n");	
		}
		
	}

}
