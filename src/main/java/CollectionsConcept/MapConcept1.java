package CollectionsConcept;

import java.awt.RenderingHints.Key;
import java.util.HashMap;

import org.apache.poi.ss.formula.functions.Value;

public class MapConcept1 {

	public static void main(String[] args) {

	 HashMap<String,String> hpp=new HashMap<String, String>();
	 hpp.put("India", "Delhi");
	 hpp.put("United stats", "Washington");
	 hpp.put("UK", "London");
	 hpp.put("China", "Kona");
	 
	 for(String Name :hpp.keySet()){

         String Capital=hpp.get(Name);
		 System.out.println("Name is showing:"+Name + ", Value :"+Capital );
	 }
	 
	}

}
