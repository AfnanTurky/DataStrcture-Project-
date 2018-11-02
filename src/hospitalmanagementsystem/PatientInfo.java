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
public class PatientInfo {
  
    private String name;
    private int id;
    private int age;
    private String PhoneNumer;
    private String gender;
    public Stack BackTrack;

    public PatientInfo(String name, int id, int age, String PhoneNumer, String gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.PhoneNumer = PhoneNumer;
        this.gender = gender;
        BackTrack = new Stack();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumer() {
        return PhoneNumer;
    }

    public void setPhoneNumer(String PhoneNumer) {
        this.PhoneNumer = PhoneNumer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    


    @Override
    public String toString() {
        return "Patient Information :" + "\nName: " + name + "\nID: " + id + "\nage: " + age + "\nPhone Number=" 
                + PhoneNumer ;
    }
    
    

}
 

