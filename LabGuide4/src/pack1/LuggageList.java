
package pack1;

/**
 *
 * @author OGUZ
 */
public class LuggageList {
  
    static   final int MAX_COUNT = 5;
 static   final int MAX_KILOS = 50;
    
   static private int total_kilo = 0;
    private int total_LuaggageCount = 0;
    static int i = -1;
    Luggage myLuaggage[] = new Luggage[MAX_COUNT];
    
    public boolean addLuagge(Luggage x){
    i++;
    total_kilo += x.getWeigh_kilo();
        if (i < MAX_COUNT && total_kilo <= MAX_KILOS) {
            
         myLuaggage[i] = x;   
            total_LuaggageCount++;
            return true;
        }
        
        else
        return false;    
    
    
    }

    public Luggage getLuggage(String BelongTO){
        for (int i = 0; i < MAX_COUNT; i++) {
            if (myLuaggage[i].getBelongsTO().equals(BelongTO)) {
               return myLuaggage[i]; 
            }
    
            
        }
    return null;
    
    
    }

    public Luggage[] getAll() {
        return myLuaggage;
    }

   


public Luggage getHighhestCapacityLuaggage(){

double max = myLuaggage[0].getCapacity_lt();
int index = 0;
    for (int k = 1; k < MAX_COUNT; k++) {
        if (myLuaggage[k].getCapacity_lt() > max) {
          max = myLuaggage[k].getCapacity_lt();
          index = k;
        }
        
    }
return myLuaggage[index];
}


public boolean removeLuggage(String Luaggage_ID){

int id = Integer.parseInt(Luaggage_ID);

    if (total_LuaggageCount <= MAX_COUNT) {
       for (int u = 0; u < MAX_COUNT; u++) {
        
        if (id == myLuaggage[u].getLuggage_ID()) {
            
            System.out.println("The Luggage belonging to:" + myLuaggage[u].getBelongsTO() +" is removed.");
            //myLuaggage[MAX_COUNT-1] = myLuaggage[u];
            myLuaggage[u] = myLuaggage[MAX_COUNT-1];
            total_LuaggageCount--;
            
            return true;
        }
   
        
    } 
    }

    


return false;
}

public void display(){

    for (int j = 0; j < total_LuaggageCount; j++) {
        System.out.println(myLuaggage[j].toString());
    }


}

}
