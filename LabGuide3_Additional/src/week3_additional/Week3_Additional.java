
package week3_additional;


public class Week3_Additional {

  
    public static void main(String[] args) {
        
Director d1 = new Director( );

d1.setDirectorName("Evren Aykac");

d1.display();

System.out.println("name : "+d1.getDirectorName() + "\nNumber of Films : "+ d1.getNumOfFilms()+ "\n Oscar wins and nominees : "+ d1.getOscar()+ "\n " +d1.getDirectorName() + d1.getInfo() + "earn " + d1.earings() + " per film\n" );


Director d2 = new Director ("Steven Spielberg", 161, 17," is well known with Schindler’s Listand Saving Private Ryan");

d2.display();
System.out.println("name : "+d2.getDirectorName() + "\nNumber of Films : "+ d2.getNumOfFilms()+ "\n Oscar wins and nominees : "+ d2.getOscar()+ "\n " +d2.getDirectorName() + d2.getInfo() + "earn " + d2.earings() + " per film\n" );

    }
    
}
