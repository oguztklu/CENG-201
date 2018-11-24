/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labguide3_1;

/**
 *
 * @author OGUZ
 */
public class Book {
    private String title;
 private int publishyear;
 private double price;

    public Book() {
     title = "NoBookTitle";
     publishyear = 0;
     price = 0.0;
             
        
    }

    public Book(String title) {
        this.title = title;
        publishyear = 0;
        price = 0.0;
                
    }

    public Book(String title, int publishyear, double price) {
        this.title = title;
        this.publishyear = publishyear;
        this.price = price;
    }
    
    public void Display(){
        System.out.println(this.title + " "  + this.publishyear +" " +this.price);
    
    }
 
}
