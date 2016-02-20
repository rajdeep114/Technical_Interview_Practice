import java.util.*;
public class AddingToArrayList {
   public static void main(String[] args) {
      String[] array = {"cat", "bat", "rat", "cat", "bat", "rat"};
      addChar(array, '~');
      removeChar(array, '~');
     
   }
   
   // Modify every string in the list
   public static void addChar(String[] array, char ch) {
      ArrayList<String> list = new ArrayList<String>();
      for(String s: array) 
         list.add(s);
      for(int i = 0; i < list.size(); i++) {
         list.set(i, ch + list.get(i));
      }
      System.out.println(list);
   }
   
   // Add char before every word in an ArrayList
   public static ArrayList<String> addChar2(String[] array, char ch) {
      ArrayList<String> list = new ArrayList<String>();
      for(String s: array) 
         list.add(s);
         
      int size = list.size();
      for(int i = 0; i < size * 2; i += 2) {
         list.add(i, ch + "");
      }
      //System.out.println(list);  
      return list;
   }
   
   // Removes every odd string in an ArrayList
   public static void removeChar(String[] array, char ch) {
      ArrayList<String> list = addChar2(array, '~');
      for(int i = 0; i < list.size(); i++) {
         list.remove(i);
      }
      System.out.println(list);
   } 

}