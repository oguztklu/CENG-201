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
public class LabGuide3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book b1 = new Book();
       Book b2 = new Book("The Java Tutorial");
    Book b3 = new Book("Accounting Principles", 2005, 135.8);
    Book b4 = new Book("Algorithms in C", 2008, 45.5);
    
    b1.Display();
    b2.Display();
    b3.Display();
    b4.Display();
    }
    
}
