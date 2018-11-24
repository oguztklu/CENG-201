
package pack1;

/**
 *
 * @author OGUZ
 */
public class Luggage {
  private int luggage_ID ;
   private String belongsTO;
   private int weigh_kilo;
   private double capacity_lt;
  static private int lastusedId = 500;

    public Luggage(String belongsTO, double capacity_lt) {
        this.belongsTO = belongsTO;
        this.capacity_lt = capacity_lt;
        luggage_ID = lastusedId;
        lastusedId++;
    }

    public Luggage(String belongsTO, int weigh_kilo, double capacity_lt) {
        this.belongsTO = belongsTO;
        this.weigh_kilo = weigh_kilo;
        this.capacity_lt = capacity_lt;
        luggage_ID = lastusedId;
        lastusedId++;
    }
    

    public int getLuggage_ID() {
        return luggage_ID;
    }

    public String getBelongsTO() {
        return belongsTO;
    }

    public int getWeigh_kilo() {
        return weigh_kilo;
    }

    public double getCapacity_lt() {
        return capacity_lt;
    }

    @Override
    public String toString() {
        return "Luggage id = " + luggage_ID +"\nBelongs To: " + belongsTO + "\nWeight of the luggage: " + weigh_kilo + "\nCapacity of the luggage:" + capacity_lt + " liters\n";
    }  
}
