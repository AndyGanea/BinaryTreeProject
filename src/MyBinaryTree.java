public class MyBinaryTree {
    
    public StudentInfo root;
    public int numInTree;

    public MyBinaryTree() {
        root = null;
        numInTree = 0;
    }

    public void insert(StudentInfo studentToAdd, StudentInfo currentNode) {
        if (root == null) {
            root = studentToAdd;
            numInTree = 1;
            return;
        }
        
        if (studentToAdd.studentNum < currentNode.studentNum) {
            if (currentNode.left == null) {
                // Make studentToAdd the left child of the current node
                currentNode.left = studentToAdd;
                numInTree++;
                return;
            } else {
                insert(studentToAdd, currentNode.left);
            }
        }
        
        if (studentToAdd.studentNum > currentNode.studentNum) {
            if (currentNode.right == null) {
                // Make studentToAdd the right child of the current node
                currentNode.right = studentToAdd;
                numInTree++;
                return;
            } else {
                insert(studentToAdd, currentNode.right);
            }
        }
    } // END OF 
    
    
}
