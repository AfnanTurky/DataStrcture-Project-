/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

/**
 *
 * @author Afnan AlOtaibi
 */
public class PatientFile extends PatientInfo {
  private Prescription prescription;
    private String receipt;
    private String doctor;
    private double payment;

    public PatientFile(String name, int id, int age, String PhoneNumer, String gender) {
        super(name, id, age, PhoneNumer, gender);
    }

    public PatientFile(double payment, String name, int id, int age, String PhoneNumer, String gender) {
        super(name, id, age, PhoneNumer, gender);
        this.payment = payment;
    }

    public void setPrescription(int numOfMdicine, int totalPrice) {
        this.prescription = new Prescription(numOfMdicine,totalPrice);
        
    }

   

    public void setDoctor(String doctor) {
        this.doctor = doctor;
        
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    
    public Prescription getPrescription() {
        return prescription;
    }

   

    public String getDoctor() {
        return doctor;
    }

    public double getPayment() {
        return payment;
    }
    public void printPatientInfo(){
      
        
        
    }
    
    public void printAllInfo(){
        System.out.println(this.toString());

    }

    @Override
    public String toString() {
        return  super.toString()+((prescription!=null)?("Prescription: " + prescription ):"")+ 
               ((receipt!=null)?("\nReceipt: "+ receipt ):"")+ 
              ((doctor!=null)?("\nDoctor: " + doctor):"" )+ ((payment!=0.0)?("\nPayment: " + payment + '\n'):"");
    }
    
    
}
class Prescription {
    private int numOfMedicine;
    private int total;
 
    public Prescription(int numOfMedcine, int total) {
        this.numOfMedicine = numOfMedcine;
        this.total = total;
    }

    public int getNumOfMedicine() {
        return numOfMedicine;
    }

    public int getTotal() {
        return total;
    }
    
    @Override
    public String toString() {
        return "Receipt:\n" + "Number of medicine" + numOfMedicine + "\nTotal=" + total + '\n';
    }   
}
