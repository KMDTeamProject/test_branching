package git.branching;

import java.util.ArrayList;

/**
 * 
 * @author siddiqui16
 * @version 0.11
 */
public class Tree {
	int height;
	int stem_width;
	ArrayList<Branch> branches;

	public Tree(int _height, int _stem_width) {
		height = _height;
		stem_width = _stem_width;
		branches = new ArrayList<Branch>();
	}

	public void addBranch(Branch _b) {
		branches.add(_b);
	}
}
