/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Afnan AlOtaibi
 */
public class Hospitalmanagementsystem {
  Scanner input;
    BST records;
    Queue waitingList;
    private DLList male;

    public Hospitalmanagementsystem() {
        male = new DLList();
        records = new BST();
        waitingList = new Queue();
        input = new Scanner(System.in);
    }

    public void UpdateAccount(int id) {

        char choose;
        PatientFile patient = records.find(id);//find it 
        patient.BackTrack.push(patient);

        do {
            System.out.print("What do you want to update? (Enter the number)\n"
                    + "1- update name\n2- update id\n3- update age\n4- update phone number\n"
                    + "5- update doctor name\n6- claculate the total payment:\ne- Exit");

            choose = input.next().charAt(0);
            switch (choose) {
                case '1':
                    System.out.println("Enter a name: ");
                    patient.setName(input.next());
  Scanner input;
    BST records;
    Queue waitingList;
    private DLList male;

    public Hospitalmanagementsystem() {
        male = new DLList();
        records = new BST();
        waitingList = new Queue();
        input = new Scanner(System.in);
    }

    public void UpdateAccount(int id) {

        char choose;
        PatientFile patient = records.find(id);//find it 
        patient.BackTrack.push(patient);

        do {
            System.out.print("What do you want to update? (Enter the number)\n"
                    + "1- update name\n2- update id\n3- update age\n4- update phone number\n"
                    + "5- update doctor name\n6- claculate the total payment:\ne- Exit");

            choose = input.next().charAt(0);
            switch (choose) {
                case '1':
                    System.out.println("Enter a name: ");
                    patient.setName(input.next());
  Scanner input;
    BST records;
    Queue waitingList;
    private DLList male;

    public Hospitalmanagementsystem() {
        male = new DLList();
        records = new BST();
        waitingList = new Queue();
        input = new Scanner(System.in);
    }

    public void UpdateAccount(int id) {

        char choose;
        PatientFile patient = records.find(id);//find it 
        patient.BackTrack.push(patient);

        do {
            System.out.print("What do you want to update? (Enter the number)\n"
                    + "1- update name\n2- update id\n3- update age\n4- update phone number\n"
                    + "5- update doctor name\n6- claculate the total payment:\ne- Exit");

            choose = input.next().charAt(0);
            switch (choose) {
                case '1':
                    System.out.println("Enter a name: ");
                    patient.setName(input.next());
  Scanner input;
    BST records;
    Queue waitingList;
    private DLList male;

    public Hospitalmanagementsystem() {
        male = new DLList();
        records = new BST();
        waitingList = new Queue();
        input = new Scanner(System.in);
    }

    public void UpdateAccount(int id) {

        char choose;
        PatientFile patient = records.find(id);//find it 
        patient.BackTrack.push(patient);

        do {
            System.out.print("What do you want to update? (Enter the number)\n"
                    + "1- update name\n2- update id\n3- update age\n4- update phone number\n"
                    + "5- update doctor name\n6- claculate the total payment:\ne- Exit");

            choose = input.next().charAt(0);
            switch (choose) {
                case '1':
                    System.out.println("Enter a name: ");
                    patient.setName(input.next());
                    break;

                case '2':
                    System.out.println("Enter id");
                    try {
                        patient.setId(input.nextInt());
                    } catch (InputMismatchException e) {
                        System.err.println("you have to enter digits");
                    }
                    break;

                case '3':
                    System.out.println("Enter age");
                    try {
                        patient.setId(input.nextInt());
                    } catch (InputMismatchException e) {
                        System.err.println("you have to enter digit only");
                    }
                    break;

                case '4': {
                    System.out.println("Enter new phone number ");
                    patient.setPhoneNumer(input.next());
                    break;
                }
                case '5': {
                    System.out.println("Enter doctor name");
                    patient.setDoctor(input.next());
                    break;
                }
                case '6': {
                    System.out.println("Enter a payment");
                    try {
                        int p = input.nextInt();
                        patient.setPayment(p + patient.getPrescription().getTotal());
                    } catch (InputMismatchException e) {
                        System.err.println("you have to enter digit only");
                    }
                    break;
                }
                case 'e':
                    break;
                case 'E':
                    break;
                default:
                    System.err.println("You should enter one of the digits above or 'E' to exit.\nPlease try again");

            }

        } while (choose != 'e' && choose != 'E');

    }// end method update Account

    public void serve() {
        PatientFile client = waitingList.deQueue();
        int chosenNum;
        boolean isMismatch, done = false;

        do {
            System.out.println("Choose a service:\n1-Update account\n2-Get previous update"
                    + "\n3-Make an appointment\n4-Delet Accoumt"
                    + "\n5-Print Prescription\n6-Exite");

            try {
                chosenNum = input.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("You should enter one of the digits above.\nPlease try again.");
                continue;
            }

            switch (chosenNum) {
                case 1:
                    UpdateAccount(client.getId());
                    break;
                case 2:
                    System.out.println("previous update:\n" + client.BackTrack.pop());
                    break;
                case 3:
                case 4:
                    deleteAccount(client.getId());
                    break;
                case 5:
                    System.out.println(client.getPrescription());
                case 6:
                    done = true;
                    break;
                default:
                    System.err.println("You should enter one of the digits above.\nPlease try again.");

            }

        } while (!done);

    }

    public void creatAccount() {

        System.out.println("Enter your name , ID , age and phone number");
        String name, phN, gender = name = phN = null;
        int id, age = id = 0;
        boolean isMismatch = true;
        do {
            name = input.nextLine();
            phN = input.next();
            gender = input.next();
            try {

                id = input.nextInt();
                age = input.nextInt();

                isMismatch = false;
            } catch (InputMismatchException e) {
                System.out.println(" Please try again the ID and age should be consist of numbers only");
            }
        } while (isMismatch);
        PatientFile client = new PatientFile(name, id, age, phN, gender);
        records.insert(id, client);

        if (client.getGender().equalsIgnoreCase("male")) {
            male.add(client);
        } else {

        }

    }

    public PatientFile deleteAccount(int id) {
        PatientFile temp = records.find(id);
        if (temp.getGender().equalsIgnoreCase("male")) {
            male.remove(id);
        } else {

        }
        return records.remove(id);
    }

    public void SortMaleRecords() {

        for (Node i = male.head.getNext(); i != null; i = i.getNext()) {
            for (Node j = i; j != male.head; j = j.getPrev()) {
                if (j.getData().getId() < j.getPrev().getData().getId()) {
                    swap(j, j.getPrev());
                } else {
                    break;
                }
            }

        }
    }

    private void swap(Node i, Node j) {
        PatientFile temp = i.getData();
        i.setData(j.getData());
        j.setData(temp);
    }

    public PatientFile searchMale(int id) {
        SortMaleRecords();

        int f = 0;
        int l = male.length()-1;
        int mid;

        while (f <= l) {
            mid = (f + l) / 2;

            if (id == male.get(mid).getId()) {
                return male.get(mid);
            }

            if (id < male.get(mid).getId()) {
                l = mid - 1;
            }

            if (id > male.get(mid).getId()) {
                f = mid + 1;
            }
        }

        System.out.println("The Patient File does not found");
        return null;
    }

    public void printInfo(int id) {
        PatientFile p = records.find(id);
        p.printAllInfo();
    }


    public PatientFile searchInAllRecords(int id) {
        return records.find(id);
    }

    public void printWaitingList() {
        waitingList.print();
    }

    public void printMaleInfo() {
        male.print();
    }
}
