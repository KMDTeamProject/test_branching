package git.branching;

import java.util.ArrayList;

/**
 * 
 * @author siddiqui16
 * @version 0.12
 *
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

	public static Branch createBranch(int _size) throws Exception {
		Branch obj = null;
		if (_size < Branch.MAX_SIZE)
			obj = new Branch(_size);
		else
			throw new Exception("Max branch size allowed is " + Branch.MAX_SIZE);
		return obj;
	}

	public String toString() {
		String str = "\nBranch";
		for (Leaf l : leaves) {
			String lStr = l.toString();
			str += "\n\t" + lStr.replace("\n", "\n\t");
		}
		return str;
	}
}
