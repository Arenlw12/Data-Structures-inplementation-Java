package Trees;

public class BinarySearchTree {
    public Node root;

    public BinarySearchTree() {
        root = null;
    }

    public Node insert(Node node, int key) {
        if (node == null) {
            node = new Node(key);
            return node;
        }
        if (key < node.element) {
            node.left = insert(node.left, key);
        } else if (key > node.element) {
            node.right = insert(node.right, key);
        }
        return node;
    }

    public Node search(Node root, int key) {
        if (root == null || root.element == key) {
            return root;
        }
        if (root.element < key)
            return search(root.right, key);

        return search(root.left, key);
    }

    public static class Node {
        private final int element;
        private Node left;
        private Node right;

        public Node(int elem) {
            this.element = elem;
            this.left = null;
            this.right = null;
        }
    }
}
