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
public class Queue {
 public Node front;
    public Node rear;
    public int count;

    public Queue() {
        front = null;
        rear = null;
        count = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enQueue(PatientFile val) {
        Node node =new Node(val);
        if (isEmpty()) {
            front = rear = node;
        } else {
           rear.setNext(node);
           rear=node;
           
        }

        count++;
    }

    public PatientFile deQueue() {
        PatientFile t;
        if (isEmpty()) {
            System.out.println("The Queue is empty!!");
            return null;
        } else {

            t = front.getData();
            front = front.getNext();
            count--;

            return t;
        }
    }
    //Implement the method peek

    public PatientFile peek() {
        PatientFile t;
        if (isEmpty()) {
            System.out.println("The Queue is empty!!");
            return null;
        } else {

            t = front.getData();

            return t;
        }
    }

  
    void print() {
        int size = count;
        for (int i = 0; i < size; i++) {
            enQueue(peek());
            System.out.print(deQueue() + "|");
        }
        System.out.println();
    }

}

