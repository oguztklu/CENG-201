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
public class Alzheimer extends MemoryDeficit{
  private String declining_area;
  private static int totalAlzheimer = 0;
  ClinicalCase clin;

    public Alzheimer(String declining_area,String patient_id,String patient_name,String patient_surname,int age,String gender, String deficit_id, String memory_loss) {
        super(deficit_id, memory_loss);
        this.declining_area = declining_area;
        clin = new ClinicalCase(patient_id, patient_name, patient_surname, age, gender);
        totalAlzheimer++;
    }

   /* @Override
    public String toString() {
        MemoryDeficit x = this;
        return x.toString() + ""+ clin.toString() + "\nDeclining Area : " + this.declining_area;
    }*/

    @Override
    public String toString() {
        return super.toString() + clin + "\nDeclening Area : " + this.declining_area;
    }
    

    public static int getTotalAlzheimer() {
        return totalAlzheimer;
    }

   

    
    

   
  
}
