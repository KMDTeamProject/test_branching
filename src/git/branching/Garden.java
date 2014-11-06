package git.branching;

import java.util.ArrayList;

/**
 * 
 * @author siddiqui16
 * @version 0.12
 *
 */
public class Garden {
	int length;
	int width;
	ArrayList<Tree> trees;
	
	public Garden() {
		length = 5000;
		width = 5000;
		trees = new ArrayList<Tree>();
	}
	
	public void addTree(Tree _t) {
		trees.add(_t);
	}

}
