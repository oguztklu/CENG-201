
package week3_2;


public class Movie {
 String title;
int year;
double rating;

    public Movie(String title, int year, double rating) {
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
         
     this.rating = 0.0;
    }

    public Movie(String title) {
        this.title = title;
         this.year = 0;
        this.rating = 0.0;
    }

    public Movie() {
     this.title = "null";
     this.year = 0;
     this.rating = 0.0;
    }
public void Display(){
    System.out.println(this.title + " " +this.year +" " +this.rating +" points");



}

}
