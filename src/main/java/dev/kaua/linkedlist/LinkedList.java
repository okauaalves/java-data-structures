package dev.kaua.linkedlist;

public class LinkedList<T> {
    private Node<T> head;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) { this.data = data; }
    }

    public void addFirst(T data) {
        Node<T> node = new Node<>(data);
        node.next = head;
        head = node;
        size++;
    }

    public void addLast(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) { head = node; size++; return; }
        Node<T> curr = head;
        while (curr.next != null) curr = curr.next;
        curr.next = node;
        size++;
    }

    public T removeFirst() {
        if (head == null) throw new RuntimeException("List is empty");
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public boolean contains(T data) {
        Node<T> curr = head;
        while (curr != null) {
            if (curr.data.equals(data)) return true;
            curr = curr.next;
        }
        return false;
    }

    public int size() { return size; }

    public void print() {
        Node<T> curr = head;
        StringBuilder sb = new StringBuilder("[");
        while (curr != null) {
            sb.append(curr.data);
            if (curr.next != null) sb.append(" -> ");
            curr = curr.next;
        }
        sb.append("]");
        System.out.println(sb);
    }
}
