package dev.kaua.binarytree;

public class BinarySearchTree {
    private Node root;

    private static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    public void insert(int val) { root = insert(root, val); }

    private Node insert(Node node, int val) {
        if (node == null) return new Node(val);
        if (val < node.val) node.left = insert(node.left, val);
        else if (val > node.val) node.right = insert(node.right, val);
        return node;
    }

    public boolean contains(int val) { return contains(root, val); }

    private boolean contains(Node node, int val) {
        if (node == null) return false;
        if (val == node.val) return true;
        return val < node.val ? contains(node.left, val) : contains(node.right, val);
    }

    public void inOrder() { inOrder(root); System.out.println(); }

    private void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }
}
