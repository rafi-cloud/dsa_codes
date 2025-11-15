/*
LinkedList Implementation Overview:

Insertion Methods:
- addFirst(T data) -> void: Adds an element to the beginning.
- addLast(T data) -> void: Adds an element to the end.
- add(int index, T data) -> void: Adds an element at a specified index.
- add(T data) -> boolean: Adds an element to the end, returns true if successful.

Deletion Methods:
- removeFirst() -> T: Removes and returns the first element.
- removeLast() -> T: Removes and returns the last element.

Getter Methods:
- size() -> int: Returns the current size of the list.
- getFirst() -> T: Returns the first element.
- getLast() -> T: Returns the last element.

Utility Methods:
- contains(T data) -> boolean: Returns true if the element is found.
- isEmpty() -> boolean: Returns true if the list is empty.
- print() -> void: Displays all elements.

Note: The list is implemented as a doubly-linked list, maintaining both head and tail references for efficient operations at both ends.
*/

package com.rafimiazi.dsa.phase00_setup.collections.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // INSERTION METHODS:

    // adds element to the beginning of the linkedlist.
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
        this.size++;
    }

    // adds element to the end of the linkedlist.
    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            this.tail = newNode;
            this.head = newNode;
        } else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
        this.size++;
    }

    // adds an element to the specified index of the linkelist.
    public void add(int index, T data) {
        if (index == 0) {
            addFirst(data);
        } else if (index == this.size) {
            addLast(data);
        } else if (index > 0 && index < size) {
            Node<T> newNode = new Node<>(data);
            Node<T> currNode = this.head;
            for (int i = 0; i < index; i++) {
                currNode = currNode.next;
            }
            newNode.next = currNode;
            newNode.prev = currNode.prev;
            currNode.prev.next = newNode;
            currNode.prev = newNode;
            this.size++;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean add(T data) {
        int val = this.size;
        addLast(data);
        if (this.size > val) {
            return true;
        }
        return false;

    }

    // DELETION METHODS:

    // removes the first element of the linkedlist.
    public T removeFirst() {
        T data;
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else if (this.head.next == null) {
            data = this.head.data;
            this.head = null;
            this.tail = null;
        } else {
            data = this.head.data;
            this.head = this.head.next;
        }
        this.size--;
        return data;
    }

    // removes the last elements of the linkedlist.
    public T removeLast() {
        T data;
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else if (this.tail.prev == null) {
            data = this.tail.data;
            this.tail = null;
            this.head = null;
        } else {
            data = this.tail.data;
            this.tail = this.tail.prev;
        }
        this.size--;
        return data;

    }

    // GETTER METHODS:

    // returns the size of the linkedlist.
    public int size() {
        return this.size;
    }

    // returns ths first element of the linkedlist.
    public T getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.head.data;
    }

    // returns the last element of the linkelist.
    public T getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.tail.data;
    }

    // UTILITY METHODS:

    // search the list for an element.
    public boolean contains(T data) {
        Node<T> currNode = this.head;
        for (int i = 0; i < size; i++) {
            if (currNode.data == data) {
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }

    // checks if the linkedlist is empty.
    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    // prints the linkedlist elements to the console.
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
