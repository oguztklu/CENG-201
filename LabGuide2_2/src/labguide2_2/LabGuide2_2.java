/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labguide2_2;

import java.util.Scanner;
public class LabGuide2_2 {
 public static int menu(){
    Scanner scan = new Scanner(System.in);
    int choice  = 0;
    
        System.out.println("Menu\n------------");
        System.out.println("1-Rectangle\n2-Square\n3-Circle\n4-Exit");
        choice = scan.nextInt();
        
        return choice;
    
    }
    
    public static void rec_area(){
    int a1 = 0,a2 = 0;
     Scanner scan = new Scanner(System.in);
        System.out.println("Enter two sides ");
        a1 = scan.nextInt();
        a2 = scan.nextInt();
        double area = a1*a2;
        System.out.println("Area of Rectangle is " + area);
    }
    
     public static void rec_per(){
    int a1 = 0,a2 = 0;
     Scanner scan = new Scanner(System.in);
        System.out.println("Enter two sides ");
        a1 = scan.nextInt();
        a2 = scan.nextInt();
        double area = 2.0 *(a1 + a2);
        System.out.println("Area of Rectangle is " + area);
    }
    
     public static void cir_area(){
    int a1 = 0;
     Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius ");
        a1 = scan.nextInt();
        
        double area = Math.PI*Math.pow(a1,2);
        System.out.println("Area of Circle is " + area);
    }
    
    public static void cir_per(){
    double a1 = 0;
     Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius ");
        a1 = scan.nextDouble();
        
        double area = 3.14*2.0*a1;
        System.out.println("Perimeter of Circle is " + area);
    }
     public static void square_per(){
    int a1 = 0;
     Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side ");
        a1 = scan.nextInt();
        
        double area = 4.0*a1;
        System.out.println("Perimeter of Square is " + area);
    }
     public static void square_area(){
    int a1 = 0;
     Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side ");
        a1 = scan.nextInt();
        
        double area = Math.pow(a1,2);
        System.out.println("Area of Square is " + area);
    }
    
    
    public static void main(String[] args) {
          int secim = 0;
      Scanner scan = new Scanner(System.in);
      
      
      while(secim != 4){
      secim = menu();
      if(secim == 4)
      break;
      
      else if(secim == 1){
          System.out.println("Which operation do you want to calculate ?");
          System.out.println("For Area(A),For Perimater(P)");
          String ch;
          ch = scan.nextLine();
          if (ch.equals("A")) {
              
           rec_area();
          }
          else if(ch.equals("P")){
          
          rec_per();
          }
      }
      else if(secim == 2){
      System.out.println("Which operation do you want to calculate ?");
         System.out.println("For Area(A),For Perimater(P)");
         String ch;
          ch = scan.nextLine();
           if (ch.equals("A")) {
              
           square_area();
          }
          else if(ch.equals("P")){
          
          square_per();
          }
      }
      else  if(secim == 3){
        System.out.println("Which operation do you want to calculate ?");
         System.out.println("For Area(A),For Perimater(P)");
         String ch;
          ch = scan.nextLine();
          if (ch.equals("A")) {
              System.out.println("Deneme");
           cir_area();
          }
          else if(ch.equals("P")){
          
          cir_per();
          }
      }
      }
    }
    
}
