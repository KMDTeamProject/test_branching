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

	public String toString() {
		String str = "Garden";
		for (Tree t : trees) {
			String treeStr = t.toString();
			str += "\n\t" + treeStr.replaceFirst("\n", "\n\t");
		}
		return str;
	}

	public static void main(String[] _args) {
		Garden secret_garden = new Garden();
		for (int i = 0; i < 2; i++) {
			Tree tree = new Tree((int) (Math.random() * 100),
					(int) (Math.random() * 100));
			for (int j = 0; j < 2; j++) {
				Branch branch;
				try {
					branch = Branch
							.createBranch((int) (Math.random() * Branch.MAX_SIZE));
					for (int k = 0; k < 2; k++) {
						try {
							Leaf leaf = Leaf.createLeaf(1,
									(int) (Math.random() * Leaf.MAX_SIZE));
							branch.addLeaf(leaf);
						} catch (Exception e) {
							System.err.print("\nCannot create leaf");
						}
					}
					tree.addBranch(branch);
				} catch (Exception e1) {
					System.err.print("\nCannot create branch");
				}
			}
			secret_garden.addTree(tree);
		}
		System.out.print("\n" + secret_garden);
	}
}
