import java.util.*;

public class Lab6Tester {

   public static void main(String[] args) {
   
      //test studentSwap method    
      
      String[] students = {"Adam", "Yutao", "Yunda", "Tamanna", "Avijit", "Ali", "Cole"};
      //System.out.println(Arrays.toString(students));
      String[] resultArray = studentSwap(students, 1, 4);
      System.out.println("The swapped students are ");
      System.out.println(Arrays.toString(resultArray));
      //[Adam, Avijit, Yunda, Tamanna, Yutao, Ali, Cole]
      System.out.println();
 
      //test subtractArrays
      System.out.println("The subtracted values are");
      int[] array1 = {20, 67, 4, 5, 55};
      int[] array2 = {8, 7, 100, 3, 2};
      System.out.println(Arrays.toString(subtractArrays(array1, array2)));
      System.out.println();  
   
   }//end main
   
   //Swaps students in array
   public static String[] studentSwap(String[] students, int indexA, int indexB) { 
      
      return null; 
   }
   
   //Subracts elements of array
   public static int[] subtractArrays(int[] array1, int[] array2){ 
      
      return null;
    }
    
   

 }//end class