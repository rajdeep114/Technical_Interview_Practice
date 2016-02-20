import java.util.*;

public class RemoveDuplicates {
   public static void main(String[] args) {
      String[] array = {"cat", "bat", "rat", "cat", "bat", "rat"};
      removeDuplicate(array);
      replaceValue(array, "cat", "sat");
   }
   
   // Remove duplicates in an array or a file
   public static void removeDuplicate(String[] array) {
      ArrayList<String> list = new ArrayList<String>();
      
      for(String s: array) {
         if(!list.contains(s))
            list.add(s);
      }
      System.out.println(list);
   }
   
   
   // Replace one string with another
   public static void replaceValue(String[] array, String original, 
                                                   String replacement) {
   
      ArrayList<String> list = new ArrayList<String>();
      for(String s: array) 
         list.add(s);
      list.set(list.indexOf(original), replacement);
      System.out.println(list);
   }
}