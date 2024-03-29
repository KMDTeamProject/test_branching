package git.branching;

/**
 * 
 * @author siddiqui16
 * @version 0.12
 * @version 0.1
 */
public class Leaf {
	public static final int MAX_SIZE = 20;

	int color;
	int size;

	protected Leaf(int _color, int _size) {
		color = _color;
		size = _size;
	}

	public static Leaf createLeaf(int _color, int _size) throws Exception {
		Leaf obj = null;
		if (_size < Leaf.MAX_SIZE)
			obj = new Leaf(_color, _size);
		else
			throw new Exception("Max leaf size allowed is " + Leaf.MAX_SIZE);
		return obj;
	}
	
	public String toString() {
		return "Leaf (" + color + "," + size +")";
	}
}
