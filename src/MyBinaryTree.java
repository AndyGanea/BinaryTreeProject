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
    } // END OF INSERT

    public void preorder(StudentInfo currentNode) {
        if (numInTree == 0) {
            System.out.println("The tree is currently empty.");
            return;
        }

        System.out.println(currentNode.studentNum);

        if (currentNode.left != null) {
            preorder(currentNode.left);
        } else if(currentNode.right != null) {
            preorder(currentNode.right);
        } else {
            return;
        }
    } // END OF PREORDER

    public void postorder(StudentInfo currentNode) {
        if (numInTree == 0) {
            System.out.println("The tree is currently empty.");
            return;
        }

        
        if (currentNode.left != null) {
            postorder(currentNode.left);
        } else if(currentNode.right != null) {
            postorder(currentNode.right);
        } else {
            System.out.println(currentNode.studentNum);
            return;
        }
    } // END OF POSTORDER

    public void inorder(StudentInfo currentNode) {
        if (numInTree == 0) {
            System.out.println("The tree is currently empty.");
            return;
        }
        
        if (currentNode.left != null) {
            postorder(currentNode.left);
        }
        System.out.println(currentNode.studentNum); 
        if (currentNode.right != null) {
            postorder(currentNode.right);
        } 
        
        return;
    } // END OF INORDER
    
}
