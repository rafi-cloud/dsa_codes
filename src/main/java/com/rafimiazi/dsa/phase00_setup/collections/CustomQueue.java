package com.rafimiazi.dsa.phase00_setup.collections;

/**
 * --- STEP 1: CustomQueue Interface (The Parent) ---
 * * Represents the basic FIFO (First-In, First-Out) Queue operations.
 * * This is the foundation of our structure.
 * 
 * Note: All methods in this interface are implicitly public and non-static.
 * Interface methods cannot be private unless using Java 9+ private method feature.
 * 
 * @param <E> The type of elements held in this queue
 */
interface CustomQueue<E> {
    // --- Methods throwing exceptions (Standard Queue behavior) ---
    /**
     * Inserts the element at the tail. Throws IllegalStateException if full (not
     * applicable here).
     */
    boolean add(E e);

    /** Retrieves and removes the head. Throws NoSuchElementException if empty. */
    E remove();

    /**
     * Retrieves, but does not remove, the head. Throws NoSuchElementException if
     * empty.
     */
    E element();

    // --- Methods returning special values (Non-exception handling behavior) ---
    /** Inserts the element at the tail. Returns true on success, false if full. */
    boolean offer(E e);

    /** Retrieves and removes the head. Returns null if empty. */
    E poll();

    /** Retrieves, but does not remove, the head. Returns null if empty. */
    E peek();

    // --- Basic utility methods ---
    int size();

    boolean isEmpty();
}
