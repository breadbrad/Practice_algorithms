/** private -> only be accessed within the declared class itself
	protected -> can be accessed by the subclasses in other package 
	class Node<T> -> is nested within class BinaryTree<T>. 
	we will use the BinaryTree<T> and Node<T> classes as superclasses 
	Serializable interface -> defines no methods, used to provide a marker for classes 
	(can be written to a binary file using the ObjectOutputStream / read by ObjectInputStream*/



protected static class Node<T> implements Serializable {
	protected T data;

	protected Node<T> left;

	protected Node<T> right;

	public Node(T data){
		this.data = data;
		left = null;
		right = null;
	}

	public String toString() {
		return data.toString();
	}
}