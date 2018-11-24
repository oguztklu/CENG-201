/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Scanner;


public class Cargo {

    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        LuggageList myList = new LuggageList();
        Luggage myLug[] = new Luggage[5];
        String capacity;
        double capa;
        String isim;
       String weight;
         int x = 1;
         
        int ia = 0; 
      while(true){
          if (ia >=5) {
              System.out.println("Error: Max size of (kilo or/and count) is reached! Cannot add any more luggage!");
                break;
          }
          
      System.out.println("Luagge NO " + x + " :");
            System.out.print("Belogs To : ");
            
            isim = scan.nextLine();
            System.out.println("Enter wight in kilos :");
            weight = scan.nextLine();
            System.out.println("Enter the capacity like x:x:x");
            capacity = scan.nextLine();
            String []full = capacity.split(":");
            
            capa = Integer.parseInt(full[0])*Integer.parseInt(full[1])*Integer.parseInt(full[2]);
            
            capa = capa / 1000;
            myLug[ia] = new Luggage(isim, Integer.parseInt(weight), capa);
            
            if (myList.addLuagge(myLug[ia])) {
                System.out.println("The luggage belonging to:" + myLug[ia].getBelongsTO()+  " is added to the list.");
                x++;
                ia++;
            }
            
            
            else{
            
                System.out.println("Error: Max size of (kilo or/and count) is reached! Cannot add any more luggage!");
                break;
            }
      
      
      
      
      
      
      
      }
        
        System.out.println("Here is a list of the luggages (using toString() method of list object)");
        System.out.println("\n-----------------------\n\n");
            
            myList.display();
        
            System.out.println("\n\n-------------\n");
            System.out.println("Which luggage would you like to delete?");
            System.out.println("Enter an ID: ");
            String id;
            id = scan.nextLine();
            
            myList.removeLuggage(id);
            
            myList.display();
            
             System.out.println("\n\n-------------\n\n");
             System.out.println("Whose luggage would you like to search? ");
             
             isim = scan.nextLine();
             System.out.println("Here is the luggage you were looking for...");
             System.out.println(myList.getLuggage(isim).toString());
             
             System.out.println("\n---------------\n\n");
             System.out.println("The luggage belonging to" + " " + myList.getHighhestCapacityLuaggage().getBelongsTO() + "  Gunaydin has the highest capacity of " + myList.getHighhestCapacityLuaggage().getCapacity_lt());
             
             
        
    
    }
    
}
