package com.rafimiazi.dsa;

// import java.util.ArrayList;
import com.rafimiazi.dsa.phase00_setup.collections.linkedlist.LinkedList;;

public class Main {
    public static void main(String[] args) {


        //LINKEDLIST
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(7);
        list.addFirst(8);
        list.addLast(0);
        list.addFirst(9);
        list.addLast(-1);
        System.out.println(list.deleteLast());
        System.out.println(list.deleteLast());
        System.out.println(list.deleteLast());
        list.print();
        System.out.println("LinkedList Size: " + list.getSize());
        System.out.println("First element: " + list.getfirst());
        System.out.println("Last element: " + list.getLast());

    }
}
