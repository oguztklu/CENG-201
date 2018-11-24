
package week3_additional;


public class Director {
 private String directorName;
 private int numOfFilms;
 private int oscar;
 private String info;

    public Director() {
     directorName = "Alejandro González Iñárritu";
     numOfFilms = 16;
     oscar = 7;
     info = " is well known with the movies like: Birdman, The Revenant";
     
    }

    public Director(String directorName, int numOfFilms, int oscar, String info) {
        this.directorName = directorName;
        this.numOfFilms = numOfFilms;
        this.oscar = oscar;
        this.info = info;
    }

    public String getDirectorName() {
        return directorName;
    }

    public int getNumOfFilms() {
        return numOfFilms;
    }

    public int getOscar() {
        return oscar;
    }

    public String getInfo() {
        return info;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }
  
    
  public int earings(){
  double rate = numOfFilms / oscar;
  
      if (rate < 5) {
          return 10000000;
      }
      
      else if(5 <= rate&&rate < 10){
          
      return 5000000 ;
      }
      else if(10 <= rate&&rate < 15){
          
      return 1000000;
      }
      else {
      
      return 500000;
      }
  }
  
  public void display(){
      System.out.println("Direction INFORMATİON\n-------------------------\n");
  
  }
}
