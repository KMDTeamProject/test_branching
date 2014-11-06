package git.branching;

public class MainTree {
	public static void main(String[] _args) {
		Tree tree = new Tree((int) (Math.random() * 100),
				(int) (Math.random() * 100));
//		for (int j = 0; j < 2; j++) {
//			Branch branch;
//			try {
//				branch = Branch
//						.createBranch((int) (Math.random() * Branch.MAX_SIZE));
//				for (int k = 0; k < 2; k++) {
//					try {
//						Leaf leaf = Leaf.createLeaf(1,
//								(int) (Math.random() * Leaf.MAX_SIZE));
//						branch.addLeaf(leaf);
//					} catch (Exception e) {
//						System.err.print("\nCannot create leaf");
//					}
//				}
//				tree.addBranch(branch);
//			} catch (Exception e1) {
//				System.err.print("\nCannot create branch");
//			}
//		}
		System.out.print("\n" + tree);
	}
}
