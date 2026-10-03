package dev.kaua;

import dev.kaua.linkedlist.LinkedList;
import dev.kaua.stack.Stack;
import dev.kaua.binarytree.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Linked List ===");
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1); list.addLast(2); list.addLast(3);
        list.addFirst(0);
        list.print();
        System.out.println("Contains 2: " + list.contains(2));
        list.removeFirst();
        list.print();

        System.out.println("\n=== Stack ===");
        Stack<String> stack = new Stack<>();
        stack.push("A"); stack.push("B"); stack.push("C");
        System.out.println("Stack: " + stack);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());

        System.out.println("\n=== Binary Search Tree ===");
        BinarySearchTree bst = new BinarySearchTree();
        int[] vals = {5, 3, 7, 1, 4, 6, 8};
        for (int v : vals) bst.insert(v);
        System.out.print("In-order: ");
        bst.inOrder();
        System.out.println("Contains 4: " + bst.contains(4));
        System.out.println("Contains 9: " + bst.contains(9));
    }
}
