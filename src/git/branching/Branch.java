package git.branching;

import java.util.ArrayList;

/**
 * 
 * @author siddiqui16
 * @version 0.1
 */
public class Branch {
	public static final int MAX_SIZE = 100;
	
	int size;
	ArrayList<Leaf> leaves;
	
	protected Branch(int _size) {
		size = _size;
		leaves = new ArrayList<Leaf>();
	}
	
	public void addLeaf(Leaf _l) {
		leaves.add(_l);
	}
	
	public Branch createBranch(int _size) throws Exception {
		Branch obj = null;
		if (size < Leaf.MAX_SIZE)
			obj = new Branch(_size);
		else
			throw new Exception("Max branch size allowed is " + Branch.MAX_SIZE);
		return obj;
	}
}
