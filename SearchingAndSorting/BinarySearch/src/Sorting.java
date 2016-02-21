import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		String string = "terimaadiijai";
		char[] ch = string.toCharArray();
		Arrays.sort(ch);
		string = new String(ch);
		System.out.println(string);
		
		String s = "hello";
		
		for(int i = s.length() - 1; i >= 0; i--)
			System.out.print(s.charAt(i));

	}

}
