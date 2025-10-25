package com.rafimiazi.dsa.phase00_setup.collections.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int size = 0;

    public LinkedList() {
        this.head = null;
    }

    public void addFirst(T data) {
        Node<T> node = new Node<>(data, head);
        this.head = node;
        this.size++;
    }

    public void addLast(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            this.head = node;
        } else {
            Node<T> currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = node;
        }
        this.size++;
    }

    public T deleteLast() {
        Node<T> currNode = this.head;
        T val;
        if (this.head == null) {
            throw new NoSuchElementException("List is empty.");
        } else if (this.head.next == null) {
            val = this.head.data;
            this.head = null;
            this.size--;
        } else {
            while (currNode.next.next != null) {
                currNode = currNode.next;
            }
            val = currNode.data;
            currNode.next = null;
            this.size--;
        }
        return val;
    }

    public int getSize() {
        return this.size;
    }

    public T getfirst() {
        return this.head.data;
    }

    public T getLast() {
        Node<T> currNode = this.head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        return currNode.data;
    }

    public void print() {
        Node<T> currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data);
            currNode = currNode.next;
            if (currNode != null) {
                System.out.print(" --- ");
            }
        }
        System.out.println();
    }
}
