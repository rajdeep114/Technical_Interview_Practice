public class binarySearch{
	public static void main(String[] args){
		int arg = Integer.parseInt(args[0]);
		int[] arr = {0, 0, 2, 3, 5, 6, 7, 56,88};
		System.out.println(binarysearch(arr, arg));

	}

	public static int binarysearch(int[] array, int target){

		int leftIndex = 0;
		int rightIndex = array.length - 1;
		int middleIndex;

		while(leftIndex <= rightIndex){
			middleIndex = (leftIndex + rightIndex) / 2;

			if(target < array[middleIndex]){
				rightIndex = middleIndex - 1;
			} else if(target > array[middleIndex]){
				leftIndex = middleIndex + 1;
			}else {
				return middleIndex;
			}

		}
		return -1;
	}





}