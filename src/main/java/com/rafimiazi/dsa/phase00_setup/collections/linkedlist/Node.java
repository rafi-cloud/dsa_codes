package com.rafimiazi.dsa.phase00_setup.collections.linkedlist;

public class Node<T> {
    T data;
    Node<T> next;
    // Node <T> prev;

    public Node(T data) {
        this.data = data;
        this.next = null;
        // this.prev = null;
    }

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

}
