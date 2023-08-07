package ArrayListConcept;

import java.util.HashMap;

public class HashMapConcept2 {

	public static void main(String[] args) {

		HashMap<String, String> hp=new HashMap<String, String>();
        hp.put("key1", "value1");		
		
        hp.put("key2", "value2");	
       // hp.put("key2", "value2");	
		
        System.out.println("Loop match for each Loop");
        
        for(String key : hp.keySet()){
        	System.out.println("Data are showing:"+key);
        }
	}

}
