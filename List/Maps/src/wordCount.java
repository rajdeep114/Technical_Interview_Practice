import java.util.*;
import java.io.*;

public class wordCount {
	public static void main(String[] args) throws FileNotFoundException { 
		Scanner input = new Scanner(new File("file.txt"));
		Map<String,Integer> wordCount = new TreeMap<String, Integer>();
		while(input.hasNext()) {
			String word = input.next();
			if(!wordCount.containsKey(word)) {
				wordCount.put(word, 1);
			} else {
				wordCount.put(word, wordCount.get(word) + 1);
			}
		}
		
		// Access all values in a map
		Collection<Integer> count = wordCount.values();
		int max = 0;
		for(int i: count) {
			if(max < i)
				max = i;
		}
		
		
		// Access values and key using keySet() method
		for(String str : wordCount.keySet()) {
			if(wordCount.get(str) >= 2000 )
				System.out.println(str + " occurs " + wordCount.get(str) + "times");
		}
		input.close(); 			// Close filee
	}

}
