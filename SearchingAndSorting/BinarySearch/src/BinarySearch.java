import java.util.*;


public class BinarySearch {

	public static void main(String[] args) {
		/* Binary searches : It searches sorted data by repeatedly dividing search space in half.
		 * 	- This algorithm starts by finding the central element of the array or list.
		 * 	- If central element is smaller than the target there is no need to examining elements to
		 *    the left of the center.
		 *  - Similarly for a number larger than center does not examining right element to center.
		 * 
		 */
		
		int[] num = {1, 3, 4, 5, 8, 9, 5, 5, 53, 7, 9, 0, 5, 3, 5, 78, 8, 9, 0};
		
		//Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		// We can use the Arrays.binarySearch(array) method to find result.
		int index = Arrays.binarySearch(num, 53);
		
		System.out.println(index);
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i : num)
			list.add(i);
		List<Integer> list2 = new ArrayList<Integer>(list);
		
		// Sorting a list using Collections class
		Collections.sort(list);
		int in = Collections.binarySearch(list, 53);
		
		
		System.out.println(in);
		
		
		
		
	}

}
