import java.util.Arrays;


public class Sorting {

	public static void main(String[] args) {
		String string = "terimaadiijai";
		char[] ch = string.toCharArray();
		Arrays.sort(ch);
		string = new String(ch);
		//System.out.println(string);
		
		String s = "hello";
		
		//for(int i = s.length() - 1; i >= 0; i--)
			//System.out.print(s.charAt(i));
		int[] array = { 0, 13, 4, 56, 245, 7, -1, 4, 6, 7 ,-7, -4};
		String[] arr = {"s", "d", "a", "r", "w", "o", "p"};
		//System.out.println(Arrays.toString(arr));
		selectionSortObjects(arr);
		//System.out.println(Arrays.toString(arr));

	}
	
	// Selection Sort for primitive type
	public static void selectionSort(int[]array) {
		for(int i = 0; i < array.length - 1; i++) {
			int min = i;
			for(int j = i + 1 ; j < array.length; j++) {
				if(array[j] < array[min])
					min = j;
			}
			swap(array, i, min);
		}
	}
	
	// Swap integers in an array
	public static void swap(int[] array, int indexA, int indexB) {
		int temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
	}
	
	// Selection Sort for Strings
	public static void selectionSortObjects(String[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			int min = i;
			for(int j = i + 1 ; j < array.length; j++) {
				int compare = array[min].compareTo(array[j]);
				System.out.println("Comparing " + array[i] + " and " + array[j] + " = " +compare);
				if(compare > 0) {
					min = j;
				}
			}
			swapObjects(array, i, min);
			System.out.println(Arrays.toString(array) + " and min is " + min + "\n" );
		}
	}
	
	// Swap strings in an array
	public static void swapObjects(Object[] obj, int indexA, int indexB) {
		Object temp = obj[indexA];
		obj[indexA] = obj[indexB];
		obj[indexB] = temp;
		
	}
	
	
	
	
	
	
}
