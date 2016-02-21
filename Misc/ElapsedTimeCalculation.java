public class ElapsedTimeCalculation {
	public static void main(String[] args) {

		//long startTime = System.currentTimeMillis(); 
		long startTime = System.nanoTime();
		for(int i = 0; i <= 1000; i++) {
			for(int j = 0; j <= 1000; j++)
				System.out.println("hello");
		}
		//long endTime = System.currentTimeMillis(); 
		long endTime = System.nanoTime();

		System.out.println("Elapsed Time" + (endTime - startTime) / 1000000000.0 + " sec");
	}
}