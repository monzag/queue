package com.monzag;

public class CustomQueue {

    private Node first;
    private Node last;

    public void enqueue(String value, Integer priority) {
        Node newItem = new Node(value, priority);
        if (first == null) {
            first = newItem;
            last = first;

        } else if (priority == null || priority >= getQueueSize() - 1) {
            last.setNext(newItem);
            last = newItem;

        } else if (priority == 1) {
            newItem.setNext(first);
            first = newItem;

        } else {
            enqueueWithPriorityInTheMiddle(newItem);
        }
    }

    private void enqueueWithPriorityInTheMiddle(Node newItem) {
        Node current = first;
        for (int i = 1; i < newItem.getPriority(); i++) {
            current = current.getNext();
            if (current == null) {
                current = newItem;
                i = newItem.getPriority();
            }
        }
        newItem.setNext(current.getNext());
        current.setNext(newItem);
    }

    public Node peek() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        return first;
    }

    public String dequeue() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException();
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
