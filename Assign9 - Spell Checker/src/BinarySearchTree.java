public class BinarySearchTree<E extends Comparable<E>> {

    public void display(String s) {

    }

    <object> object remove(E String) {
        return null;
    }

    public int numberNodes() {
        if(root==null)
            return 0;

        int left = getLeftHeight(root)+1;
        int right = getRightHeight(root)+1;

        if(left==right){
            return (2<<(left-1))-1;
        }else{
            return numberNodes()+numberNodes()+1;
        }
    }

    public int getLeftHeight(TreeNode n){
        if(n==null) return 0;

        int height=0;
        while(n.left!=null){
            height++;
            n = n.left;
        }
        return height;
    }

    public int getRightHeight(TreeNode n){
        if(n==null) return 0;

        int height=0;
        while(n.right!=null){
            height++;
            n = n.right;
        }
        return height;
    }


    int numberLeafNodes(){
    if(root==null)
            return 0;

    int left = getLeftHeight(root)+1;
    int right = getRightHeight(root)+1;

        if(left==right){
        return (2<<(left-1))-1;
    }else{
        return numberLeafNodes()+numberLeafNodes()+1;
    }
}





    public int height() {
        if(root==null)
            return 0;

        int left = getLeftHeight(root)+1;
        int right = getRightHeight(root)+1;

        if(left==right){
            return (2<<(left-1))-1;
        }else{
            return height()+height()+1;
        }
    }


    private class TreeNode {
        private E data;
        private TreeNode left;
        private TreeNode right;

        TreeNode(E theData) {
            data = theData;
            left = null;
            right = null;
        }
    }

    private TreeNode root;

    BinarySearchTree() {
        root = null;
    }


    boolean insert(E newElement) {
        // newElement will be added and this will still be a
        // BinarySearchTree. This tree will not insert newElement
        // if it will compareTo an existing element equally.
        if (root == null)
            root = new TreeNode(newElement);
        else {
            // find the proper leaf to attach to
            TreeNode curr = root;
            TreeNode prev = root;
            while (curr != null) {
                prev = curr;
                if (newElement.compareTo(curr.data) < 0)
                    curr = curr.left;
                else if (newElement.compareTo(curr.data) > 0)
                    curr = curr.right;
                else {
                    System.out.println(newElement + " in this BST");
                    return false;
                }
            }

            // Correct leaf has now been found. Determine whether to
            // link the new node came from prev.left or prev.right
            if (newElement.compareTo(prev.data) < 0)
                prev.left = new TreeNode(newElement);
            else
                prev.right = new TreeNode(newElement);
        }
        return true;
    } // end insert


    // Return a reference to the object that will compareTo
    // searchElement equally. Otherwise, return null.
    boolean search(E searchElement) {
        // Begin the search at the root
        TreeNode ref = root;
        // Search until found or null is reached
        while (ref != null) {

            if (searchElement.compareTo(ref.data) < 0)
                ref = ref.left; // go down the left subtree
            else
                ref = ref.right; // go down the right subtree
        }
        // Found an empty tree. SearchElement was not found


        // The insert and find methods will be added here
        return Boolean.parseBoolean(null);
    }

}