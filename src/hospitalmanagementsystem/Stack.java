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
public class Stack {
 private Node top;      // Reference to first element
    private int size;	    	// Number of elements
    
    /** Constructors */
    public Stack() {
        top = null;
        size = 0;
    }
    
    /** Reinitialize stack */
    public void clear() {
        top = null;
        size = 0;
    }
    
   
    public void push(PatientFile elem) {
        Node temp = new Node(elem, top);
        top = temp;
        size++;
    }
    
    
    public PatientFile pop() {
        if( top == null ) {
            System.out.println("Stack is empty");
            return null;
        }
        PatientFile elem = top.getData();
        top = top.getNext();
        size--;
        return elem;
    }
    
    /** @return Top value */
    public PatientFile topValue() {
        if( top == null ) {
            System.out.println("Stack is empty");
            return null;
        }
        return top.getData();
    }
    
    /** @return Stack length */
    public int length() { 
        return size; }
    public boolean isEmpty()
    {
        return top == null;
    }
}
