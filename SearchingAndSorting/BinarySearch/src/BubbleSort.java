import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 0, 13, 4, 56, 245, 7, -1, 4, 6, 7 ,-7, -4};
		String[] arr = {"s", "d", "a", "r", "w", "o", "p"};
		System.out.println(Arrays.toString(array));
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}
	
	public static void bubbleSort(int[] array) {
		boolean isSorted;
		for(int i = 0; i < array.length - 1; i++) {
			isSorted = true;
			for(int j = 0; j < array.length - 1 - i; j++) {
				if(array[j] > array[j + 1]) {
					swap(array, j, j + 1);
					isSorted = false;
				}
			}
			if(isSorted)
				break;
		}
		
	}
	
	public static void swap(int[] array, int indexA, int indexB) {
		int temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
	}

}
