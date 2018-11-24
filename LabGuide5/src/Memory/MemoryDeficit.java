/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memory;

/**
 *
 * @author OGUZ
 */
public abstract class MemoryDeficit {
   protected String deficit_id;
   protected String memory_loss;
   protected static int total_deficit = 0;

    public MemoryDeficit(String deficit_id, String memory_loss) {
        this.deficit_id = deficit_id;
        this.memory_loss = memory_loss;
        total_deficit++;
    }

    public String getDeficit_id() {
        return deficit_id;
    }

    public static int getTotal_deficit() {
        return total_deficit;
    }

    @Override
    public String toString() {
        return "\nDeficit ID : " + this.deficit_id + "\nMemory Loss : " + this.memory_loss  ;
    }
   
}
