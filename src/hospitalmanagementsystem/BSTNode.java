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
public class BSTNode  {
	private int key;              // Key for this node
	private PatientFile data;               // Node data
	private BSTNode  left;  // reference to left child
	private BSTNode  right; // reference to right child

	/** Constructors */
	public BSTNode() {left = right = null; }
	public BSTNode(int key, PatientFile data){ 
		this.key = key;
		this.data = data;
		left = right = null;
	}  
	public BSTNode(int key, PatientFile data, BSTNode  left, BSTNode  right){ 
		this.key = key; 
		this.data = data;
		this.left = left; 
		this.right = right; 
	  }

	/** Get and set the key value */
	public int getKey() { return key; }
	public void setKey(int key) { this.key = key; }

	/** Get and set the data value */
	public PatientFile getData() { return data; }
	public void setData(PatientFile data) { this.data = data; }

	/** Get and set the left child */
	public BSTNode  getLeft() { return left; }
	public void setLeft(BSTNode  left) { this.left = left; }

	/** Get and set the right child */
	public BSTNode  getRight() { return right; }
	public void setRight(BSTNode  right) { this.right = right; }

 	/** @return True if a leaf node, false otherwise */
	public boolean isLeaf(){
		return (left == null) && (right == null); }
}
