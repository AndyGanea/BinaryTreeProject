public class MyBinaryTree {
    
    public StudentInfo root;
    public int numInTree;

    public MyBinaryTree() {
        root = null;
        numInTree = 0;
    }

    public void insert(StudentInfo studentToAdd, StudentInfo currentNode) {
        if (root == null) { // If the tree is empty, the root of the tree is just the student that was added
            root = studentToAdd;
            numInTree++;
            return;
        }
        
        if (studentToAdd.studentNum < currentNode.studentNum) {
            if (currentNode.left == null) {
                // Make studentToAdd the left child of the current node
                currentNode.left = studentToAdd;
                numInTree++;
                return;
            } else { // If the current node on the left is occupied, we have to call insert again.
                insert(studentToAdd, currentNode.left);
            }
        }
        
        if (studentToAdd.studentNum > currentNode.studentNum) {
            if (currentNode.right == null) {
                // Make studentToAdd the right child of the current node
                currentNode.right = studentToAdd;
                numInTree++;
                return;
            } else { // If the current node on the right is occupied, we have to call insert again.
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
        }
        if(currentNode.right != null) {
            preorder(currentNode.right);
        } 
        else {
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
        } 
        
        if(currentNode.right != null) {
            postorder(currentNode.right);
        }
        
        System.out.println(currentNode.studentNum);
        return;
        
    } // END OF POSTORDER

    public void inorder(StudentInfo currentNode) {
        if (numInTree == 0) {
            System.out.println("The tree is currently empty.");
            return;
        }
        
        if (currentNode.left != null) {
            inorder(currentNode.left);
        }
        System.out.println(currentNode.studentNum); 
        if (currentNode.right != null) {
            inorder(currentNode.right);
        } 
        
        return;
    } // END OF INORDER
    
}
