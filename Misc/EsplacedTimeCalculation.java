public class EsplacedTimeCalculation {
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis(); 
		for(int i = 0; i <= 1000; i++) {
			for(int j = 0; j <= 1000; j++)
				System.out.println("hello");
		}
		long endTime = System.currentTimeMillis(); 

		System.out.println("Time == " + (endTime - startTime));
	}
}