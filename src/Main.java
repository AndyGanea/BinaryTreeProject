
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

		someStudent = new StudentInfo(15, "Jeffrey-Kai", "Li");
		theTree.insert(someStudent, theTree.root);

		someStudent = new StudentInfo(22, "Abhinav", "Bala");
		theTree.insert(someStudent, theTree.root);

		someStudent = new StudentInfo(19, "Abhinav", "Bhati");
		theTree.insert(someStudent, theTree.root);

		someStudent = new StudentInfo(7, "Ronik", "Agarwal");
		theTree.insert(someStudent, theTree.root);

		someStudent = new StudentInfo(11, "Easshan", "Sumbli");
		theTree.insert(someStudent, theTree.root);

		someStudent = new StudentInfo(20, "Shreyas", "Tanguturi");
		theTree.insert(someStudent, theTree.root);

		someStudent = new StudentInfo(3, "A", "Bird");
		theTree.insert(someStudent, theTree.root);
		
		System.out.println("\nInorder traversal!");
		theTree.inorder(theTree.root);
		
		System.out.println("\nPreorder traversal!");
		theTree.preorder(theTree.root);
		
		System.out.println("\nPostorder traversal!");
		theTree.postorder(theTree.root);


	}

}
