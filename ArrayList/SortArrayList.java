import java.util.*;

public class SortArrayList {
   public static void main(String[] args) {
      String[] array = {"cat", "bat", "rat", "cat", "bat", "rat"};
      Arrays.sort(array);
      System.out.print(Arrays.toString(array));
      
     // sort(array);
      
      //reverse("hello");
  
   }
   
   // Sorting an ArrayList using Collections.sort
   public static void sort(String[] array) {
      ArrayList<String> list = new ArrayList<String>();
      for(String s: array) 
         list.add(s);
      System.out.println("Before sort " + list);
      Collections.sort(list);
      System.out.println("After sort " + list);
   }
   
   // Reverse a string
   public static void reverse(String s) {
        for(int i = s.length() - 1; i >= 0; i--) {
         System.out.print(s.charAt(i));
      }
   }
}