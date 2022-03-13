
public class Main {

	public static void main(String[] args) {
		
		
		MyBinaryTree theTree = new MyBinaryTree(); // Instantiate an EMPTY tree
		StudentInfo someStudent;
		
		someStudent = new StudentInfo(10, "Daffy", "Duck");
		theTree.insert(someStudent, theTree.root);
		
		someStudent = new StudentInfo(6, "Elmer", "Fudd");
		theTree.insert(someStudent, theTree.root);
		
		someStudent = new StudentInfo(5, "Tweety", "Bird");
		theTree.insert(someStudent, theTree.root);
		
		System.out.println("\nInorder traversal!");
		theTree.inorder(theTree.root);
		
		System.out.println("\nPreorder traversal!");
		theTree.preorder(theTree.root);
		
		System.out.println("\nPostorder traversal!");
		theTree.postorder(theTree.root);


	}

}
