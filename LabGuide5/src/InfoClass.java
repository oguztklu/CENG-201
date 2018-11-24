
import Memory.Alzheimer;
import Memory.Amnesia;
import Memory.MemoryDeficit;
import java.util.ArrayList;


public class InfoClass {
 public static ArrayList<MemoryDeficit> memoryArrayList = new ArrayList<>();
 
 public static void addMemory(MemoryDeficit x){
 memoryArrayList.add(x);
     
 }
  
 public static String getAllMemory(){
  String x = "";   
     for (MemoryDeficit y : memoryArrayList) {
      x += y.toString();
     }
   
     return x;
 }
 
 public static String getAmnesia(){
     String x = "";
     for(MemoryDeficit y : memoryArrayList){
         if(y instanceof Amnesia){
             x += y.toString();
         }
     }
     return x;
 }
 
 public static String getAlzheimer(){
     String x = "";
     for(MemoryDeficit y : memoryArrayList){
         if(y instanceof Alzheimer){
             x += y.toString();
         }
            
     }
     return x;
 }
 
 public static MemoryDeficit searchMemory(String id){
 
     for (int i = 0; i < memoryArrayList.size(); i++) {
         if (id.equals(memoryArrayList.get(i).getDeficit_id())) {
             return memoryArrayList.get(i);
         }
         
         
     }
 return null;
 }
 public static String showTotalMemory(){
 String x = "";
 


x = "Total MemoryDeficit : " + MemoryDeficit.getTotal_deficit() + "\n" + "\nTotal Alzheimer : " + Alzheimer.getTotalAlzheimer() + "\nTotal Amnesia : " + Amnesia.getTotal_Amnesia() + "\n";

return x; 
 
 
 }

}
