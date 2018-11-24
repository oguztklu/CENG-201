
package week2_3;

import java.util.Scanner;
import java.util.Arrays;
public class Week2_3 {

    public static int[] reverse(int[] list) {
  int[] result = new int[list.length];

  for (int i = 0, j = result.length - 1;  i < list.length; i++, j--) {
    result[j] = list[i];
  }

  return result;
}   
    public static void main(String[] args) {
     int []array = {2,10,89,37,6,12,45,4,68,8,12};
     System.out.println("Original Array");
     for(int i = 0;i<array.length;i++){
     
         System.out.print(array[i] + " ");
     
     
     }
     Arrays.sort(array);
     
     array = reverse(array);
        
      
  

          System.out.println("\nSorted Array");
     for(int i = 0;i<array.length;i++){
     
         System.out.print(array[i] + " ");
     
     
     }
     
     
     double devision;
     double average = 0;
     double sum = 0;
        for (int i = 0; i < array.length; i++) {
         sum += array[i];  
        }
        average = sum / array.length;
        
     double up = 0;
        for (int i = 0; i < array.length; i++) {
        up += Math.pow((array[i] - average),2.0);    
            
        }
        devision = Math.sqrt(up / array.length);
        
        System.out.println("\nStandart Derivation is " + devision);
        
    }
    
}
