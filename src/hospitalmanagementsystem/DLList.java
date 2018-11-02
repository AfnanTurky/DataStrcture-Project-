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
public class DLList {
	
	public  Node head;         // Reference to first element
	public  Node last;         // Reference to last element
	private int size;					  // Size of list
	
	/** Constructors */
	DLList() {
		last = head = null;
		size = 0;
		}

	/** Remove all elements */
	public void clear() {
		last = head = null;  
		size = 0;
		}

	/** add "element" to the end of list */
	public void add(PatientFile data) { 
		Node temp = new Node(data, null, null);
		if(head == null){
			head = last = temp;
		} 
		else {
			last.setNext(temp);
			temp.setPrev(last);
			last = temp;
		}
		size++;
	} 

	/** add "element" at specific position */
	public void add(PatientFile data, int index) {
		if (index > size || index < 0) {
			System.out.println("Index out of bounds");
			return; 
		}
		  
		Node temp = new Node(data);
		if(index == 0){  // Add at the front or empty list
			if (head != null) {
				temp.setNext(head);
				head.setPrev(temp);
				head = temp;
			} else  // If list is empty 
				last = head = temp; 			
		} 
		else { // Add at the middle 
			Node curr = head;
			for(int i = 0; i < index-1; i++) 
				curr = curr.getNext(); 
			
			temp.setNext( curr.getNext()); 
			temp.setPrev(curr); 
			curr.getNext().setPrev(temp);
			curr.setNext(temp);
			
			if (last == curr)  // Add at the end 
				last = last.getNext(); 
		}
		size++;
	}


	/** Remove and return the removed data */
	public PatientFile remove(int id) {
		if (getByID(id)==null) {
			return null; 
		}
		PatientFile data;
		if(getByID(id)==head){ 				    // remove front element 
			data = head.getData();
			head = head.getNext();
			head.setPrev(null);
			if (head == null) 				// become empty list
				last = null;
		} 
		else {
			Node curr = getByID(id);
			
			data = curr.getNext().getData(); 
			if (last == curr.getNext()) 			// remove last element 
				last = curr; 
			curr.setNext(curr.getNext().getNext());      // Remove from list
			curr.getNext().setPrev(curr);
		}

		size--;								// Decrement count
		return data;                     // Return value
		} 

	/** @return List length */
	public int length() { 
		return size; }


	/** @return data at specific position */
	public Node getByID(int id) {
		Node curr = head;
                while(curr!=null){
                    if(curr.getData().getId()==id)
                        return curr;
                curr=curr.getNext();
                
                }
                System.out.println("This id dosn't exsist");
	return null;	
	}
        
        public PatientFile get(int index) {
		if (index >= size || index < 0) {
			System.out.println("Index out of bounds");
			return null; 
		}
		Node curr = head;
		for(int i = 0; i < index; i++)
			curr = curr.getNext(); 
		return curr.getData();
	}
	
	/** Modify the data at specific position */
	public void set(PatientFile data, int index) {
		if (index >= size || index < 0) {
			System.out.println("Index out of bounds");
			return ; 
		}
		Node curr = head;
		for(int i = 0; i < index; i++)
			curr = curr.getNext(); 
		curr.setData(data);
	}
        public void print(){
            Node curr = head;
            while(curr!=null){
                System.out.println(curr.getData());
               curr=curr.getNext();
            }
        
        }
	
}
