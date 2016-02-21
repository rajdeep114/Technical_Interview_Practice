import java.util.*;


public class MapView {

	public static void main(String[] args) {
		Map<Integer, String> ssn = new HashMap<Integer, String>();
		ssn.put(123456789, "Rajdeep Singh");
		ssn.put(222233334, "John Doe");
		ssn.put(482643936, "Jane Doe");
		ssn.put(389456239, "Eddy");
		ssn.put(646638465, "Mou");
		ssn.put(366482848, "gasti");
		
		//Set<Integer> key = ssn.keySet();
		for(int i : ssn.keySet()) {
			System.out.println(i + " = " + ssn.get(i));
		
		}
		
		// Print all values in a Map --  values() method return Collection of value (this
		// is not collections!!
		Collection<String> value = ssn.values();
		for(String s: value)
			System.out.println(s);
		
		
		
	}

}
