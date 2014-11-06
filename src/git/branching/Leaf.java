package git.branching;

/**
 * 
 * @author siddiqui16
 *
 */
public class Leaf {
	public static final int MAX_SIZE = 20;

	int color;
	int size;

	protected Leaf(int _color, int _size) {
		color = _color;
		size = _size;
	}

	public Leaf createLeaf(int _color, int _size) throws Exception {
		Leaf obj = null;
		if (size < Leaf.MAX_SIZE)
			obj = new Leaf(_color, _size);
		else {
			throw new Exception("Max leaf size allowed is " + Leaf.MAX_SIZE);
		}
		return obj;
	}
}
