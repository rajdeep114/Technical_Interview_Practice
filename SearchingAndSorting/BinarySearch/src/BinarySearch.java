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
		
		Arrays.sort(num);
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
		


		int[] arr = {0, 1, 2, 3, 6, 8, 9};
		System.out.println(binarysearch(arr, 3));
		
		
	}
	
	
	
	public static int binarysearch(int[] array, int target) {
		int leftIndex = 0;
		int rightIndex = array.length - 1;
		int middleIndex;
		
		// We need equal sign in case the value of middle, left and right is same
		while(leftIndex <= rightIndex) {
			
			middleIndex = (leftIndex + rightIndex) / 2;
			
			if(target < array[middleIndex])
				rightIndex = middleIndex - 1;
			else if(target > array[middleIndex])
				leftIndex = middleIndex + 1;
			else
				return middleIndex;
	
		}
		return -1;
		
	}

}
