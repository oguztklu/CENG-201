/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicalCase;

/**
 *
 * @author OGUZ
 */
public class ClinicalCase {
  private String patient_id;
  private String patient_name;
  private String patient_surname;
  private int age;
  private String gender;

    public ClinicalCase(String patient_id, String patient_name, String patient_surname, int age, String gender) {
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.patient_surname = patient_surname;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nPateint ID : " + this.patient_id + "\nPatient Name: " + this.patient_name + "\nPatient Surname : " + this.patient_surname + "\nAge : " + this.age + "\nGender : " + this.gender ;
    }

    public String getPatient_id() {
        return patient_id;
    }
  
    
}
