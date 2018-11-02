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
public class Node {
   

    private PatientFile data;
    private Node next;
    private Node prev;

    Node(PatientFile data, Node next) {
        this.data = data;
        this.next = next;

    }

    Node(PatientFile data) {
        this.data = data;
        this.next = null;

    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    Node(PatientFile data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public PatientFile getData() {
        return data;
    }

    public void setData(PatientFile data) {
        this.data = data;
    }

}
