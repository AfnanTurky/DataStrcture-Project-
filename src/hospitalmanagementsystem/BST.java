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
public class BST {
    private BSTNode root; // Root of the BST
	int size;             // Number of nodes in the BST

	/** Constructor */
	BST() { root = null; size = 0; }

	/** Reinitialize tree */
	public void clear() { root = null; size = 0; }

	/** Insert a record into the tree.
     * @param id
     * @param client
  	 */
    public void insert( int k, PatientFile e) {
		root = inserthelp(root, k, e);
		size++;
	}

	
  
        
	/** @return The current subtree, modified to contain
  	the new item */
	private BSTNode inserthelp(BSTNode rt, int k, PatientFile e) {
		if (rt == null) return new BSTNode(k, e);
		if (rt.getKey()>k)
			rt.setLeft(inserthelp(rt.getLeft(), k, e));
		else
			rt.setRight(inserthelp(rt.getRight(), k, e));
		return rt;
	}
	
        
	/** @return Record with key value k, null if none exist.
  	@param k The key value to find. */
	public PatientFile find(int k) { return findhelp(root, k); }
 
	private PatientFile findhelp(BSTNode rt,int k) {
		if (rt == null) return null;
		if (rt.getKey()>k)
			return findhelp(rt.getLeft(), k);
		else if (rt.getKey()==k) return rt.getData();
		else return findhelp(rt.getRight(), k);
	}
	
	private BSTNode getmin(BSTNode rt) {
		if (rt.getLeft() == null) return rt;
		return getmin(rt.getLeft());
	}
	
	private BSTNode deletemin(BSTNode rt) {
		if (rt.getLeft() == null) return rt.getRight();
		rt.setLeft(deletemin(rt.getLeft()));
		return rt;
	}
	
	/** Remove a record from the tree.
  	@param k Key value of record to remove.
  	@return The record removed, null if there is none. */
	public PatientFile remove(int k) {
		PatientFile temp = findhelp(root, k);   // First find it
		if (temp != null) {
			root = removehelp(root, k); // Now remove it
			size--;
		}
		return temp;
	}
	
	/** Remove a node with key value k
	@return The tree with the node removed */
	private BSTNode removehelp(BSTNode rt,int k) {
		if (rt == null) 
			return null;
		if (rt.getKey()>k)
			rt.setLeft(removehelp(rt.getLeft(), k));
		else 
			if (rt.getKey()<k)
				rt.setRight(removehelp(rt.getRight(), k));
			else { // Found it ^_^
				if (rt.getLeft() == null) 
					return rt.getRight();
				else 
					if (rt.getRight() == null) 
						return rt.getLeft();
					else { // Two children
						BSTNode temp = getmin(rt.getRight());
						rt.setData(temp.getData());
						rt.setKey(temp.getKey());
						rt.setRight(deletemin(rt.getRight()));
					}
			}
		return rt; 
	}

	/** @return The number of records in the dictionary. */
	public int size() { return size; }
}