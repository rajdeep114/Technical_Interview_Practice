import java.util.*;

import javax.xml.bind.ValidationEvent;

public class Maps {

	public static void main(String[] args) {
		/* Maps: It is a collection that associate objects called keys with objects called
		 * values.
		 * 
		 * Two class that implements map interface are: HashMap and TreeMap
		 * 
		 * Sets and Maps interface have similar implementations
		 * HashMap -- general purpose
		 * TreeMap -- stores comparable keys in sorted order
		 */
		Map<String, Double> maps = new HashMap<String, Double>();
		
		// add elements in HashMap
		maps.put("raj", 34.0);
		maps.put("rajee", 343.0);
		maps.put("rajw", 30.0);
		
		System.out.println(maps);
		
		// Search elements in HaspMap
		boolean d = maps.containsKey("raj");
		if(d) {
			double t = maps.get("raj");
		}
		
		
		System.out.println(d);
		
	}

}
