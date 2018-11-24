/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labguide2_1;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author OGUZ
 */

public class LabGuide2_1 {

    /**
     * @param args the command line arguments
     */
       
    public static void displayOdd(int []a,int x){
        System.out.println("The odd number :");
        for (int i = 0; i < x; i++) {
            System.out.print(a[i] +" ");
        }
    
    
    
    }
    
    public static void displayEven(int []a,int x){
    
        System.out.println("The even number :");
     for (int i = 0; i < x; i++) {
            System.out.print(a[i] +" ");
        }
    
    
    }
    
    public static int max_odd(int []a){
    
    int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] > max)
            max = a[i];        
        }
    
    return max;
    }
     public static int max_even(int []a){
    
    int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] > max)
            max = a[i];        
        }
    
    return max;
    }
    public static void main(String[] args) {
        int deger = 0,maxeven = 0,maxodd = 0;
        double sum = 0;
        double average = 0;
        int []odd = new int[30];
                
        int []even = new int[30];
        int a = 0,b = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers(to stop enter -1)");
        
        while(deger != -1){
        
        deger = scan.nextInt();
        if(deger == -1)
            break;
            if (deger % 2 == 0) {
                even[a] = deger;
                sum += deger;
                a++;
            } 
            else{
            odd[b] = deger;
             sum += deger;
            b++;
            
            }
        
        }
        average = sum / (a + b);
        displayOdd(odd,a);
        displayEven(even,b);
        System.out.println("The sum of the number is " + sum);
        System.out.println("The average of the number is " + average);
        System.out.println("The max of the odd number is " + max_odd(odd));
         System.out.println("The max of the even number is " + max_even(even));
        
    }
    }
    

