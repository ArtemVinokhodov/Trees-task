public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] nodes = {50, 30, 70, 20, 40, 60, 80, 10, 25, 35, 45, 75};

        for (int node : nodes) {
            tree.insert(node);
        }

        System.out.println("Inorder traversal:");
        tree.inorderTraversal(tree.root);
        System.out.println("\nPreorder traversal:");
        tree.preorderTraversal(tree.root);
        System.out.println("\nPostorder traversal:");
        tree.postorderTraversal(tree.root);
    }
}