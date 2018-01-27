package com.monzag;

public class CustomQueue {

    private Node first;
    private Node last;

    public void enqueue(String value) {
        Node newItem = new Node(value);
        if (first == null) {
            first = newItem;
            last = first;
            
        } else {
            last.setNext(newItem);
            last = newItem;
        }
    }

    public Node peek() {

    }

    public String dequeue() {

    }
}
