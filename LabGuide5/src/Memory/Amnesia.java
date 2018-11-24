/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memory;

import ClinicalCase.ClinicalCase;

/**
 *
 * @author OGUZ
 */
public class Amnesia extends MemoryDeficit {
    private String amnesia_type;
    private String cause;
    private String location;
    private static int total_Amnesia = 0;
   ClinicalCase clin ;

    public Amnesia(String amnesia_type, String cause, String location, String patient_id,String patient_name,String patient_surname,int age,String gender, String deficit_id, String memory_loss) {
        super(deficit_id, memory_loss);
        this.amnesia_type = amnesia_type;
        this.cause = cause;
        this.location = location;
        this.clin = new ClinicalCase(patient_id, patient_name, patient_surname, age, gender);
        total_Amnesia++;
    }

    @Override
    public String toString() {
      
        return super.toString() + "" + clin.toString() + "\nAmnesia Type : "+ this.amnesia_type + "\nCause : " + this.cause + "\nLocation: "+this.location;
    }

    public static int getTotal_Amnesia() {
        return total_Amnesia;
    }
   
   
   
}
