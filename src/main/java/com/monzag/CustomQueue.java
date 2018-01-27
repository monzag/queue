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
        if (isEmpty()) {
//            throw Exception
        }
        return first;
    }

    public String dequeue() {
        if (isEmpty()) {
//            throw Exception
        }
        String item = first.getValue();
        first = first.getNext();
        return item;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int getQueueSize() {
        int size = 0;
        Node node = first;
        while (node != null) {
            node = node.getNext();
            size++;
        }

        return size;
    }
}
