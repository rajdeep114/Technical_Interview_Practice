import java.util.Arrays;

public class SortStrings {
   public static void main(String[] args) {
      String s = sort("sdgdfgdfhsdghsdfg");
      System.out.println(s);
   }
   
   /* Sort a string - 
      Construct a character array using toCharArray() method
      Then use Arrays.sort(name of the char array)
      At Last, return a new string using content of char[].
      Use new String(name of char array. */
   public static String sort(String s) {
      char[] ch = s.toCharArray();
      Arrays.sort(ch);
      return new String(ch);
   }
}