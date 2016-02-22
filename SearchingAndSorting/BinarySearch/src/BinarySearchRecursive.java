
public class BinarySearchRecursive {
	public static void main(String[] args) {
		int[] array = {0, 1, 2, 3, 6, 8, 9};
		System.out.println(binarysearch(array, 9, 0, array.length - 1));
	}
	
	public static int binarysearch(int[] array, int target, int leftIndex, int rightIndex) {
		
		if (leftIndex > rightIndex) {
			return -1;
		} else {
			int middleIndex = (leftIndex + rightIndex) / 2;
			if(array[middleIndex] == target)
				return middleIndex;
			else if (target < array[middleIndex]) {
				rightIndex = middleIndex - 1;
				return binarysearch(array, target, leftIndex, rightIndex);
			} else {
				leftIndex = middleIndex + 1;
				return binarysearch(array, target, leftIndex, rightIndex);
			
			}
		}
	}
}
