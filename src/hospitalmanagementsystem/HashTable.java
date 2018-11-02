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
public class HashTable {

    Node tables[];
    private final int size;

    public HashTable(int size) {

        this.size = size;
        tables = new Node[size];
    }

    public int hashFunc(int id) {
        return id % size;
    }

    public void clear() {
        tables = new Node[size];
    }

    public void insert(PatientFile patient) {
        int index = hashFunc(patient.getId());

        if (tables[index] != null) {
            Node temp = tables[index];
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.getNext().setNext(new Node(patient, null, null));
        } else {
            tables[index] = new Node(patient, null, null);
        }

    }

    public PatientFile remove(PatientFile patient) {

        int index = hashFunc(patient.getId());
        if (tables[index] != null) {
            Node temp = tables[index];
            while (temp != null && temp.getNext().getData() != patient) {
                temp = temp.getNext();
            }
            if (temp != null) {
                temp.setNext(temp.getNext().getNext());
            }
        } else {
            System.err.println("This patient record dosn't exisist please try again with valid ID.");
            return null;
        }

        return patient;
    }

    public PatientFile search(int id){
     int index = hashFunc(id);
     PatientFile patient;
        if (tables[index]!= null) {
           Node temp = tables[index];
           if(temp.getData().getId()==id)
               return temp.getData();
            while (temp!= null) {
                if(temp.getData().getId()==id)
                    return temp.getData();
                temp = temp.getNext();
            }
           
        }
        System.err.println("This patient record dosn't exisist please try again with valid ID.");
            return null;
    }
    public void print() {
        Node temp;
        for (int i = 0; i < size; i++) {
            temp = tables[i];
            while (temp != null) {
                System.out.print(temp.getData() + "\n");
                temp = temp.getNext();
            }

        }
    }

}
